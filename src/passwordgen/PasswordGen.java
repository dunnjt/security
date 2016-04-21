/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgen;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author johndunn
 */
public class PasswordGen {

    /**
     * @param args the command line arguments
     */
    private static JFrame frame;
    private static LoginPanel login;
    
    public static void main(String[] args) {
        
        runPassKeeper();
    }
    
    public static void runPassKeeper() {
        PasswordList list = PasswordList.getInstance();
        list.genPasswordList();
        
        login = new LoginPanel();       
        
        frame = new JFrame("You Shall Not Pass Word Keeper");
        frame.add(login, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }
    
    public static void updateFrames(JPanel oldFrame, JPanel updatedFrame) {
        
        frame.remove(oldFrame);
        frame.add(updatedFrame, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public static void updateFrames(JPanel updatedFrame) {
        
        frame.remove(login);
        frame.add(updatedFrame, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
