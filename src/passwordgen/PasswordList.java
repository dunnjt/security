/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgen;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * PasswordList is a Singleton List of all user information from output text file.
 * Methods help with new user creation and login to application.
 * @author johndunn
 */
public class PasswordList {
    
    private static ArrayList<Passwords> allPasswords = null;
    private static PasswordList instance = null;
    
    /**
     * PasswordList() private constructor. Ensures single instance of Passwords ArrayList.
     */
    private PasswordList() {
        allPasswords = new ArrayList<Passwords>();
    }
    
    /**
     * getInstance() ensures only a single instance of this class is generated.
     * @return class instance.
     */
    public static PasswordList getInstance() {
        if(instance == null) {
            instance = new PasswordList();
        }
        return instance;
    }
    
    /**
     * genPasswordList() scans output file at program startup and builds ArrayList of user information.
     */
    public void genPasswordList() {
        try {
            Scanner fileInput = new Scanner(new File("output.txt"));
            while (fileInput.hasNext()) {
                allPasswords.add(new Passwords(fileInput.next(), fileInput.next(), fileInput.next(), fileInput.next()));
            }
        }
        catch(IOException e) {
            
        }
        
    } 
    
    /**
     * getPasswordList() is a getter of the master list that contains hashed passwords and user information.
     * @return ArrayList of user information.
     */
    public ArrayList<Passwords> getPasswordList() {
        return allPasswords;
    }
    
    /**
     * getIndex() iterates through the master list of user information.
     * @param user Name of user that would be inputing into user JTextField
     * @return the index of that user in the list.
     */
    public int getIndex(String user) {
         for (int i = 0; i < allPasswords.size(); i++) {
            if(user.equals(allPasswords.get(i).getUser())) {
                return i;
            }
        }
        return -1;     
    }
    
    /**
     * addToPasswordList() adds to master user list on the file during run-time.
     * @param newPass new Passwords object that holds new user information.
     */
    public void addToPasswordList(Passwords newPass) {
        allPasswords.add(newPass);     
    }
    
    /**
     * checkUserAvail() is a helper method to determine if a username is available or taken
     * @param user name to check from user JTextField.
     * @return boolean condition as to whether the username is available.
     */
    public boolean checkUserAvail(String user) {
        boolean available = true;
        for (int i = 0; i < allPasswords.size(); i++) {
            if(user.equals(allPasswords.get(i).getUser())) {
                available = false;
                return available;
            }
        }
        return available;
        
    }
    
}
