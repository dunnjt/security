/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgen;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author johndunn
 */
public class TokenTimer {
    
    Timer timer;
    private static boolean expired = false;

    public TokenTimer() {
        timer = new Timer();
        timer.schedule(new TokenExpire(), 30*1000);
    }

    class TokenExpire extends TimerTask {
        public void run() {
            expiredToken();
            timer.cancel();
        }
    }
    
    public static boolean expiredToken() {
        expired = true;
        return expired;
    }
    
}
