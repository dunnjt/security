/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgen;

import java.awt.Color;
import java.security.SecureRandom;
import javax.swing.JOptionPane;

/**
 *
 * @author johndunn
 */
public class LoginPanel extends javax.swing.JPanel {
    
    private static int token;
    private static Plivo sms;

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userNameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        tokenField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        genToken = new javax.swing.JButton();
        Login = new javax.swing.JButton();
        passCheckMain = new javax.swing.JLabel();
        createNewUser = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(680, 340));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 0, 24)); // NOI18N
        jLabel1.setText("Thou Shall Not Pass Word Keeper");

        userNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("User Name:");

        jLabel3.setText("Password:");

        jLabel4.setText("Token:");

        genToken.setText("Generate Token");
        genToken.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genTokenMouseClicked(evt);
            }
        });

        Login.setText("Login");
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginMousePressed(evt);
            }
        });
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        passCheckMain.setText("jLabel5");

        createNewUser.setText("Create New User");
        createNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createNewUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(280, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(genToken)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Login))
                                    .addComponent(tokenField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(passCheckMain)
                                .addGap(33, 33, 33))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(createNewUser)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tokenField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(11, 11, 11)
                .addComponent(passCheckMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genToken)
                    .addComponent(Login))
                .addGap(18, 18, 18)
                .addComponent(createNewUser)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameFieldActionPerformed

    private void genTokenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genTokenMouseClicked

        generateToken();
    }//GEN-LAST:event_genTokenMouseClicked

    private void LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMousePressed
        if(sms.expiredToken()) {
            JOptionPane.showMessageDialog(this, "Token Expired. Generate New Token");
        }
        else {
            checkLoginAttempt();
        }
    }//GEN-LAST:event_LoginMousePressed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed

    }//GEN-LAST:event_LoginActionPerformed

    private void createNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createNewUserActionPerformed
        NewUserPanel user = new NewUserPanel();
        PasswordGen.updateFrames(this, user);
    }//GEN-LAST:event_createNewUserActionPerformed

    private static void generateToken() {
        
        PasswordList list = PasswordList.getInstance();
        int index = list.getIndex(userNameField.getText());
        
        if (index == -1) {
            passCheckMain.setForeground(Color.red);
            passCheckMain.setText("Username Information Incorrect");
        }
        else {
            sms = new Plivo();
            token = sms.createCode();
            sms.startTimer();
            //sms.sendCode(token, list.getPasswordList().get(index).getPhone());
            passCheckMain.setForeground(Color.green);
            passCheckMain.setText("Token Generated");
        }
        
    }
    
    private static void checkLoginAttempt() {
        
        PasswordList list = PasswordList.getInstance();
        int index = list.getIndex(userNameField.getText());
        
        if (index == -1) {
            passCheckMain.setForeground(Color.red);
            passCheckMain.setText("Incorrect Login Information");
        }
        else {
            String passString = new String(passwordField.getPassword());
            String passwordToCheck = SHA256.getSHA256Hash(userNameField.getText() + passString);
    
            //need to read token here
            if (list.getPasswordList().get(index).getHash().equals(passwordToCheck)&&tokenCheck()) {
               validateLogin();
            }
            else {
                passCheckMain.setForeground(Color.red);
                passCheckMain.setText("Incorrect Login Information");
            }
        }
    }
    
    private static void validateLogin() {
        MainPanel main = new MainPanel();
        PasswordGen.updateFrames(main); 
    }
    
    private static boolean tokenCheck() {
        return tokenField.getText().equals(Integer.toString(token)) && !sms.expiredToken();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Login;
    private javax.swing.JButton createNewUser;
    private javax.swing.JButton genToken;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private static javax.swing.JLabel passCheckMain;
    private static javax.swing.JPasswordField passwordField;
    private static javax.swing.JTextField tokenField;
    private static javax.swing.JTextField userNameField;
    // End of variables declaration//GEN-END:variables
}
