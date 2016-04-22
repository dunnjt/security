/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgen;

import java.util.LinkedHashMap;
import java.security.SecureRandom;

import com.plivo.helper.api.client.*;
import com.plivo.helper.api.response.message.MessageResponse;
import com.plivo.helper.exception.PlivoException;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import static passwordgen.TokenTimer.expiredToken;


/**
 *Plivo Class - uses Plivo API to create SMS Token and forward that to Cell provider.
 * Class code is primarily derived from Plivo API.
 * @author johndunn
 */
public class Plivo {

    private String authId = "MANJZJYTZMMDDJYZUZN2";
    private String authToken = "ZTYyMTkzNDUyYjdjY2ZmNWNlMWNjMmMwNDBmOWQ4";
    private RestAPI api = new RestAPI(authId, authToken, "v1");
    private boolean status = false;
    private int shortCode;
    private Timer timer;
    private boolean expired = false;

    public Plivo() {

    }

    /**
     * createCode() generates a SecureRandom 6 digit number.
     * @return 6 digit int to be used as SMS token for login.
     */
    public int createCode() {

        SecureRandom rnd = new SecureRandom();
        shortCode = 100000 + rnd.nextInt(900000);
        
        return shortCode;
    }

    public void startTimer() {
        timer = new Timer();
        timer.schedule(new TokenExpire(), 30*1000);
    }

    class TokenExpire extends TimerTask {
        public void run() {
            expired = true;
            timer.cancel();
        }
    }
    
    public boolean expiredToken() {
        return expired;
    }
    
    
    /**
     * 
     * @return 
     */
    public int getTime() {
        
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return Integer.parseInt(sdf.format(cal.getTime()));
    }
    
    public void sendCode(int shortCode, String phoneNumber) {
        
        LinkedHashMap<String, String> parameters = new LinkedHashMap<String, String>();
        parameters.put("src", "18054753449"); // Sender's phone number with country code
        parameters.put("dst", phoneNumber); // Receiver's phone number with country code
        parameters.put("text", Integer.toString(shortCode)); // Your SMS text message
        parameters.put("url", "http://server/message/notification/"); // The URL to which with the status of the message is sent
        parameters.put("method", "GET"); // The method used to call the url
            
        try {
            // Send the message
            MessageResponse msgResponse = api.sendMessage(parameters);

            // Print the response
            System.out.println(msgResponse);
            // Print the Api ID
            System.out.println("Api ID : " + msgResponse.apiId);
            // Print the Response Message
            System.out.println("Message : " + msgResponse.message);

            if (msgResponse.serverCode == 202) {
                // Print the Message UUID
                System.out.println("Message UUID : " + msgResponse.messageUuids.get(0).toString());
                status = true;
            } else {
                System.out.println(msgResponse.error); 
            }
        } catch (PlivoException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
    
    public boolean getStatus() {
        return status;
    }
}
