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


/**
 *
 * @author johndunn
 */
public class Plivo {

    private String authId = "MANJZJYTZMMDDJYZUZN2";
    private String authToken = "ZTYyMTkzNDUyYjdjY2ZmNWNlMWNjMmMwNDBmOWQ4";
    private RestAPI api = new RestAPI(authId, authToken, "v1");

    public Plivo() {

    }

    public static int createCode() {

        SecureRandom rnd = new SecureRandom();
        int shortCode = 100000 + rnd.nextInt(900000);
        
        return shortCode;
    }
    
    public static int getTime() {
        
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
            } else {
                System.out.println(msgResponse.error); 
            }
        } catch (PlivoException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
