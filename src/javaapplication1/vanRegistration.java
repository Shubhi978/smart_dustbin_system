/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javaapplication1.emailValidation.emailValidation;

/**
 *
 * @author Snehalreet
 */
public class vanRegistration extends javax.swing.JFrame {

    /**
     * Creates new form vanRegistration
     */
    public vanRegistration() {
        initComponents();
        
        
        this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    //System.out.println("WindowClosingDemo.windowClosing");
                    landing.dashboard.setVisible(true);
                    //landing.vr.setVisible(false);
                    dispose();
                    }
                });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        emailIdTextField = new javax.swing.JTextField();
        vanIdTextField = new javax.swing.JTextField();
        driverNameTextField = new javax.swing.JTextField();
        cancelButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        lbl_Message = new javax.swing.JLabel();
        notificationLabel = new javax.swing.JLabel();
        emptyErrorLabel = new javax.swing.JLabel();
        nameValidation = new javax.swing.JLabel();
        idValidation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.white);

        jPanel2.setBackground(new java.awt.Color(255, 190, 11));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jyots\\Documents\\NetBeansProjects\\smart_dustbin_system\\images\\van.png")); // NOI18N

        jTextField1.setEditable(false);
        jTextField1.setBackground(java.awt.Color.white);
        jTextField1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(7, 59, 76));
        jTextField1.setText("Van Registeration");
        jTextField1.setBorder(null);

        jTextField2.setEditable(false);
        jTextField2.setBackground(java.awt.Color.white);
        jTextField2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(7, 59, 76));
        jTextField2.setText("E-Mail ID:");
        jTextField2.setBorder(null);

        jTextField3.setEditable(false);
        jTextField3.setBackground(java.awt.Color.white);
        jTextField3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(7, 59, 76));
        jTextField3.setText("Driver Name:");
        jTextField3.setBorder(null);

        jTextField4.setEditable(false);
        jTextField4.setBackground(java.awt.Color.white);
        jTextField4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(7, 59, 76));
        jTextField4.setText("Van ID:");
        jTextField4.setBorder(null);
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        emailIdTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailIdTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIdTextFieldActionPerformed(evt);
            }
        });

        vanIdTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        driverNameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        driverNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverNameTextFieldActionPerformed(evt);
            }
        });

        cancelButton.setBackground(new java.awt.Color(26, 83, 92));
        cancelButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(249, 251, 242));
        cancelButton.setText("CANCEL");
        cancelButton.setBorder(null);
        cancelButton.setContentAreaFilled(false);
        cancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelButton.setFocusPainted(false);
        cancelButton.setOpaque(true);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        cancelButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cancelButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cancelButtonFocusLost(evt);
            }
        });

        registerButton.setBackground(new java.awt.Color(26, 83, 92));
        registerButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        registerButton.setForeground(new java.awt.Color(249, 251, 242));
        registerButton.setText("REGISTER");
        registerButton.setBorder(null);
        registerButton.setContentAreaFilled(false);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.setFocusPainted(false);
        registerButton.setOpaque(true);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        registerButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registerButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                registerButtonFocusLost(evt);
            }
        });

        lbl_Message.setBackground(java.awt.Color.white);
        lbl_Message.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl_Message.setForeground(new java.awt.Color(230, 57, 70));
        lbl_Message.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        notificationLabel.setBackground(java.awt.Color.white);
        notificationLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        notificationLabel.setForeground(new java.awt.Color(0, 221, 0));

        emptyErrorLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        emptyErrorLabel.setForeground(new java.awt.Color(230, 57, 70));
        emptyErrorLabel.setText(" ");

        nameValidation.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nameValidation.setForeground(new java.awt.Color(230, 57, 70));
        nameValidation.setText(" ");

        idValidation.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        idValidation.setForeground(new java.awt.Color(230, 57, 70));
        idValidation.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(notificationLabel)
                .addGap(368, 368, 368))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60)
                                .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(driverNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vanIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameValidation)
                                    .addComponent(lbl_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idValidation)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emptyErrorLabel)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(emptyErrorLabel)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(emailIdTextField)
                    .addComponent(jTextField2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_Message, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(driverNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameValidation)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vanIdTextField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idValidation)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(notificationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        vanIdTextField.setText("");
        driverNameTextField.setText("");
        emailIdTextField.setText("");
        notificationLabel.setText("");
        lbl_Message.setText(" ");
        nameValidation.setText(" ");
        idValidation.setText(" ");
        emptyErrorLabel.setText(" ");
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        // TODO add your handling code here:
        lbl_Message.setText(" ");
        nameValidation.setText(" ");
        idValidation.setText(" ");
        notificationLabel.setText(" ");
        emptyErrorLabel.setText(" ");
        
        boolean status = emailValidation(emailIdTextField.getText());
        
        int b = 1;
        String regex1 = "^.*[a-zA-Z]+.*$";
        String regex2 = "^.*[a-zA-Z0-9]+.*$";
        Pattern pattern1 = Pattern.compile(regex1);
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher m1 = pattern1.matcher(driverNameTextField.getText());
        Matcher m2 = pattern2.matcher(vanIdTextField.getText());
        
        
        if(emailIdTextField.getText().equals("") || driverNameTextField.getText().equals("") || vanIdTextField.getText().equals("")){
            emptyErrorLabel.setText("All fields are mandatory!");
            b=0;
        }
        else{
            if(!m1.matches()){
                nameValidation.setText("Enter a valid name");
                b=0;
            }
            if(!m2.matches()){
                idValidation.setText("Enter a valid van ID");
                b=0;
            }else try {
                String qu = "SELECT * FROM VAN WHERE id = '" + vanIdTextField.getText().trim() + "'";
                ResultSet rs = landing.databaseHandler.execQuery(qu);
                if(rs.next()){
                    idValidation.setText("ID already exists");
                    b=0;
                }
            } catch (SQLException ex) {
                Logger.getLogger(vanRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(status == false){
               lbl_Message.setText("Invalid email");
               b=0;
            }
        }
        if(b==1){
            String vanID = vanIdTextField.getText().trim();
            String vanDriver = driverNameTextField.getText().trim();
            String vanEmail = emailIdTextField.getText().trim();
            
            // Adding to database
            String qu = "INSERT INTO VAN VALUES ( " +
                    "'" + vanID + "'," +
                    "'" + vanEmail + "'," +
                    "'" + vanDriver + "'" +
                     ")";
            
            if(landing.databaseHandler.execAction(qu)){
                notificationLabel.setText("Van Registered successfully.");
            }else // Error
            {
                //Print error message
            }
               
            //CREATE LOG
            Timestamp ts = new Timestamp(System.currentTimeMillis());
            String log = ts + " : Van: " + vanID + " registered.\n";
            landing.logReport += log;
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void emailIdTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIdTextFieldActionPerformed
        // TODO add your handling code here:
           
    }//GEN-LAST:event_emailIdTextFieldActionPerformed

    private void cancelButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cancelButtonFocusGained
        cancelButton.setForeground(new java.awt.Color(230, 57, 70));
    }//GEN-LAST:event_cancelButtonFocusGained

    private void cancelButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cancelButtonFocusLost
        cancelButton.setForeground(new java.awt.Color(249, 251, 242));    }//GEN-LAST:event_cancelButtonFocusLost

    private void registerButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerButtonFocusGained
        registerButton.setForeground(new java.awt.Color(230, 57, 70));
    }//GEN-LAST:event_registerButtonFocusGained

    private void registerButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerButtonFocusLost
        registerButton.setForeground(new java.awt.Color(249, 251, 242));
    }//GEN-LAST:event_registerButtonFocusLost

    private void driverNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driverNameTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vanRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vanRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vanRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vanRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vanRegistration o =new vanRegistration();
                o.setVisible(true);
                o.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JTextField driverNameTextField;
    private javax.swing.JTextField emailIdTextField;
    private javax.swing.JLabel emptyErrorLabel;
    private javax.swing.JLabel idValidation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lbl_Message;
    private javax.swing.JLabel nameValidation;
    private javax.swing.JLabel notificationLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField vanIdTextField;
    // End of variables declaration//GEN-END:variables
}
