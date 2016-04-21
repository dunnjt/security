/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgen;

/**
 *
 * @author johndunn
 */
public class Passwords {
    
    private String user;
    private String passwordHash;
    
    public Passwords(String user, String passwordHash) {
        this.user = user;
        this.passwordHash = passwordHash;
    }
    
    public String getUser() {
        return user;
    }
    
    public String getHash() {
        return passwordHash;
    }
    
}
