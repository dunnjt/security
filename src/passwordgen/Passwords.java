/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgen;

/**
 *Passwords Class creates object for user information including their username, salt, password hash, phone number.
 * @author johndunn
 */
public class Passwords {
    
    private String user;
    private String salt;
    private String passwordHash;
    private String phoneNumber;
    
    /**
     * Passwords() constructor to build Passwords object.
     * @param user
     * @param salt
     * @param passwordHash
     * @param phoneNumber 
     */
    public Passwords(String user, String salt, String passwordHash, String phoneNumber) {
        this.user = user;
        this.passwordHash = passwordHash;
        this.phoneNumber = phoneNumber;
        this.salt = salt;
    }
    
    public String getUser() {
        return user;
    }
    
    public String getHash() {
        return passwordHash;
    }
    
    public String getPhone() {
        return phoneNumber;
    }
    
    public String getSalt() {
        return salt;
    }
    
}
