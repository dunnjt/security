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
 *
 * @author johndunn
 */
public class PasswordList {
    
    private static ArrayList<Passwords> allPasswords = null;
    private static PasswordList instance = null;
    
    private PasswordList() {
        allPasswords = new ArrayList<Passwords>();
    }
    
    public static PasswordList getInstance() {
        if(instance == null) {
            instance = new PasswordList();
        }
        return instance;
    }
    
    public void genPasswordList() {
        try {
            Scanner fileInput = new Scanner(new File("output.txt"));
            while (fileInput.hasNext()) {
                allPasswords.add(new Passwords(fileInput.next(), fileInput.next(), fileInput.next()));
            }
        }
        catch(IOException e) {
            
        }
        
    } 
    
    public ArrayList<Passwords> getPasswordList() {
        return allPasswords;
    }
    
    public int getIndex(String user) {
         for (int i = 0; i < allPasswords.size(); i++) {
            if(user.equals(allPasswords.get(i).getUser())) {
                return i;
            }
        }
        return -1;     
    }
    
    public void addToPasswordList(Passwords newPass) {
        allPasswords.add(newPass);     
    }
    
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
