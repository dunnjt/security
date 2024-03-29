/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgen;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.UUID;

/**
 *
 * @author johndunn
 */
public class NewUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewUserPanel
     */
    public NewUserPanel() {
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
        backNewUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordCheck = new javax.swing.JLabel();
        phoneNumField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        userNewAccount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordNewUser = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        confirmNewUser = new javax.swing.JPasswordField();
        newUserSubmit = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(680, 340));

        jLabel1.setFont(new java.awt.Font("Myanmar MN", 0, 24)); // NOI18N
        jLabel1.setText("Thou Shall Not Pass Word Keeper");

        backNewUser.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        backNewUser.setForeground(new java.awt.Color(0, 0, 255));
        backNewUser.setText("Back->");
        backNewUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backNewUserMousePressed(evt);
            }
        });

        jLabel2.setText("Create New Account");

        passwordCheck.setText("jLabel6");

        jLabel6.setText("Phone Number:");

        userNewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNewAccountActionPerformed(evt);
            }
        });

        jLabel3.setText("User Name:");

        jLabel4.setText("Password:");

        passwordNewUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordNewUserKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordNewUserKeyReleased(evt);
            }
        });

        jLabel5.setText("Confirm Password:");

        newUserSubmit.setText("Submit");
        newUserSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(35, 35, 35))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newUserSubmit, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(passwordCheck)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(confirmNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phoneNumField)
                                    .addComponent(userNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(passwordNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addComponent(backNewUser)))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(passwordCheck)
                        .addGap(18, 18, 18)
                        .addComponent(newUserSubmit))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(confirmNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(81, 81, 81)))
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backNewUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backNewUserMousePressed
        LoginPanel login = new LoginPanel();
        PasswordGen.updateFrames(this, login);
       
    }//GEN-LAST:event_backNewUserMousePressed

    private void userNewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNewAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNewAccountActionPerformed

    private void newUserSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserSubmitActionPerformed

        generatePass();
    }//GEN-LAST:event_newUserSubmitActionPerformed

    private void passwordNewUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordNewUserKeyTyped
       
    }//GEN-LAST:event_passwordNewUserKeyTyped

    private void passwordNewUserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordNewUserKeyReleased
        checkPassStrength();
    }//GEN-LAST:event_passwordNewUserKeyReleased

    private static void checkPassStrength() {
        String passString = new String(passwordNewUser.getPassword());
        if(!StrengthTest.getStrength(passString)) {
            passwordCheck.setForeground(Color.red);
            passwordCheck.setText("Weak Password");
        }
        else {
            passwordCheck.setForeground(Color.green);
            passwordCheck.setText("Good Password");
        }
    }
    
    private static void generatePass() {
        
        boolean validUser = true;
        PasswordList list = PasswordList.getInstance();
        if (!list.checkUserAvail(userNewAccount.getText())) {
            validUser = false;
            passwordCheck.setForeground(Color.red);
            passwordCheck.setText("User Name Not Available");
        }
        boolean match = false;
        if(!Arrays.equals(passwordNewUser.getPassword(), confirmNewUser.getPassword())) {
            passwordCheck.setForeground(Color.red);
            passwordCheck.setText("Passwords Do Not Match");
        }
        else if(Arrays.equals(passwordNewUser.getPassword(), confirmNewUser.getPassword())) {
            match = true;
        }
        boolean phoneValid = true;
        if (phoneNumField.getText().length()!=11) {
            passwordCheck.setForeground(Color.red);
            passwordCheck.setText("Invalid Phone Number Length");
            phoneValid = false;
        }
        String passString = new String(passwordNewUser.getPassword());
        if (match && validUser && phoneValid && StrengthTest.getStrength(passString)) {
            
            String uuidSalt = UUID.randomUUID().toString().replaceAll("-", "");
            
            String savedPass = SHA256.getSHA256Hash(userNewAccount.getText()+uuidSalt+passString);
            try(PrintWriter out = new PrintWriter(new FileWriter("output.txt", true)))
            {
                out.print(userNewAccount.getText() + " " + uuidSalt + " " + savedPass + " " + phoneNumField.getText() +"\n");
                }catch(IOException e){
            }
            list.addToPasswordList(new Passwords(userNewAccount.getText(), uuidSalt, savedPass, phoneNumField.getText()));
            passwordCheck.setForeground(Color.green);
            passwordCheck.setText("Password Accepted");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backNewUser;
    private static javax.swing.JPasswordField confirmNewUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton newUserSubmit;
    private static javax.swing.JLabel passwordCheck;
    private static javax.swing.JPasswordField passwordNewUser;
    private static javax.swing.JTextField phoneNumField;
    private static javax.swing.JTextField userNewAccount;
    // End of variables declaration//GEN-END:variables
}
