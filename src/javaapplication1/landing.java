/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.*;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Snehalreet
 */
public class landing extends javax.swing.JFrame {
    
    static landing dashboard;
    static sensorConfig sc;
    static frameworkConfiguration fg;
    static vanRegistration vr;
    static dustbinRegistration dr;
    static startMonitoring sttm;
    static stopMonitoring stpm;
    
    static Map<String, Dustbin> dustbin = new HashMap<String, Dustbin>();
    static Map<String, Van> van = new HashMap<String, Van>();
    static ArrayList<String> vanID = new ArrayList<String>();
    static int vanIDIndex = 0;                           //current van for next mail
    static double moistureThreshold = 61;                 //in percentage
    static double ultrasonicThreshold = 15;               //depth in centimeters
    static int vanResponseDelay = 15;                    //in minutes
    static int dustbinStatusDelay = 20;                  //in minutes
    static double maxDustbinSize = 80.0;                      //in centimeters
    static String defaultBinKey = "00";
    static String defaultVanKey = "00";
    
    static Timer timer;
    static TimerTask task;
    
    static String logReport = "";
    /**
     * Creates new form landing
     */
    public landing() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField7 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        frameworkConfigButton = new javax.swing.JButton();
        registerVanButton = new javax.swing.JButton();
        sensorConfigButton = new javax.swing.JButton();
        registerDustbinButton = new javax.swing.JButton();
        startMonitorButton = new javax.swing.JButton();
        stopMonitorButton = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel2.setBackground(new java.awt.Color(26, 83, 92));
        jPanel2.setPreferredSize(new java.awt.Dimension(1024, 100));

        jPanel3.setBackground(new java.awt.Color(78, 205, 196));

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(78, 205, 196));
        jTextField7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(29, 53, 87));
        jTextField7.setText("What can we do for you?");
        jTextField7.setBorder(null);
        jTextField7.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(26, 83, 92));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(249, 251, 242));
        jLabel1.setText("DASHBOARD");
        jLabel1.setNextFocusableComponent(sensorConfigButton);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        frameworkConfigButton.setBackground(new java.awt.Color(255, 255, 255));
        frameworkConfigButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\jyots\\Documents\\NetBeansProjects\\smart_dustbin_system\\images\\framework.png")); // NOI18N
        frameworkConfigButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        frameworkConfigButton.setFocusPainted(false);
        frameworkConfigButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                frameworkConfigButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                frameworkConfigButtonFocusLost(evt);
            }
        });
        frameworkConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frameworkConfigButtonActionPerformed(evt);
            }
        });

        registerVanButton.setBackground(new java.awt.Color(255, 255, 255));
        registerVanButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\jyots\\Documents\\NetBeansProjects\\smart_dustbin_system\\images\\van.png")); // NOI18N
        registerVanButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerVanButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registerVanButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                registerVanButtonFocusLost(evt);
            }
        });
        registerVanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerVanButtonActionPerformed(evt);
            }
        });

        sensorConfigButton.setBackground(new java.awt.Color(255, 255, 255));
        sensorConfigButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\jyots\\Documents\\NetBeansProjects\\smart_dustbin_system\\images\\sensor.png")); // NOI18N
        sensorConfigButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sensorConfigButton.setFocusPainted(false);
        sensorConfigButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sensorConfigButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sensorConfigButtonFocusLost(evt);
            }
        });
        sensorConfigButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorConfigButtonActionPerformed(evt);
            }
        });

        registerDustbinButton.setBackground(new java.awt.Color(255, 255, 255));
        registerDustbinButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\jyots\\Documents\\NetBeansProjects\\smart_dustbin_system\\images\\dustbin.png")); // NOI18N
        registerDustbinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerDustbinButton.setFocusPainted(false);
        registerDustbinButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                registerDustbinButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                registerDustbinButtonFocusLost(evt);
            }
        });
        registerDustbinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerDustbinButtonActionPerformed(evt);
            }
        });

        startMonitorButton.setBackground(new java.awt.Color(255, 255, 255));
        startMonitorButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\jyots\\Documents\\NetBeansProjects\\smart_dustbin_system\\images\\start.png")); // NOI18N
        startMonitorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        startMonitorButton.setFocusPainted(false);
        startMonitorButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                startMonitorButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                startMonitorButtonFocusLost(evt);
            }
        });
        startMonitorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startMonitorButtonActionPerformed(evt);
            }
        });

        stopMonitorButton.setBackground(new java.awt.Color(255, 255, 255));
        stopMonitorButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\jyots\\Documents\\NetBeansProjects\\smart_dustbin_system\\images\\stop.png")); // NOI18N
        stopMonitorButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stopMonitorButton.setFocusPainted(false);
        stopMonitorButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                stopMonitorButtonFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                stopMonitorButtonFocusLost(evt);
            }
        });
        stopMonitorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopMonitorButtonActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(29, 53, 87));
        jTextField1.setText("Sensor Configuration");
        jTextField1.setBorder(null);
        jTextField1.setFocusable(false);

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(29, 53, 87));
        jTextField2.setText("Framework Configuration");
        jTextField2.setBorder(null);
        jTextField2.setFocusable(false);

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(29, 53, 87));
        jTextField3.setText("Dustbin Registration");
        jTextField3.setBorder(null);
        jTextField3.setFocusable(false);

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(255, 255, 255));
        jTextField4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(29, 53, 87));
        jTextField4.setText("Van Registration");
        jTextField4.setBorder(null);
        jTextField4.setFocusable(false);

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 255));
        jTextField5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(29, 53, 87));
        jTextField5.setText("Stop Monitoring");
        jTextField5.setBorder(null);
        jTextField5.setFocusable(false);

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 255));
        jTextField6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(29, 53, 87));
        jTextField6.setText("Start Monitoring");
        jTextField6.setBorder(null);
        jTextField6.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(sensorConfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(96, 96, 96))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(registerDustbinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(startMonitorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(99, 99, 99)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stopMonitorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(registerVanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(frameworkConfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(frameworkConfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(registerVanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(stopMonitorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sensorConfigButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(registerDustbinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(startMonitorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 66, Short.MAX_VALUE))
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

    private void sensorConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorConfigButtonActionPerformed
        // TODO add your handling code here:
        sc = new sensorConfig();
        dashboard = this;
        dashboard.setVisible(false);
        sc.setVisible(true);
    }//GEN-LAST:event_sensorConfigButtonActionPerformed

    private void registerDustbinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerDustbinButtonActionPerformed
        dr = new dustbinRegistration();
        dashboard = this;
        dashboard.setVisible(false);
        dr.setVisible(true);    
    }//GEN-LAST:event_registerDustbinButtonActionPerformed

    private void startMonitorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startMonitorButtonActionPerformed
        // TODO add your handling code here:
        sttm = new startMonitoring();
        dashboard = this;
        dashboard.setVisible(false);
        sttm.setVisible(true);
    }//GEN-LAST:event_startMonitorButtonActionPerformed

    private void stopMonitorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopMonitorButtonActionPerformed
        // TODO add your handling code here:
        stpm = new stopMonitoring();
        dashboard = this;
        dashboard.setVisible(false);
        stpm.setVisible(true);
        
        //NOTE
        //task.cancel();          //stops monitoring
        //timer.cancel();         //stops monitoring
        
    }//GEN-LAST:event_stopMonitorButtonActionPerformed

    private void frameworkConfigButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frameworkConfigButtonActionPerformed
        // TODO add your handling code here:
        fg = new frameworkConfiguration();
        dashboard = this;
        dashboard.setVisible(false);
        fg.setVisible(true);
    }//GEN-LAST:event_frameworkConfigButtonActionPerformed

    private void registerVanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerVanButtonActionPerformed
        // TODO add your handling code here:
        vr = new vanRegistration();
        dashboard = this;
        dashboard.setVisible(false);
        vr.setVisible(true);
    }//GEN-LAST:event_registerVanButtonActionPerformed

    private void stopMonitorButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stopMonitorButtonFocusGained
        // TODO add your handling code here:
        jTextField5.setForeground(new java.awt.Color(230, 57, 70));
    }//GEN-LAST:event_stopMonitorButtonFocusGained

    private void sensorConfigButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sensorConfigButtonFocusGained
        jTextField1.setForeground(new java.awt.Color(230, 57, 70));
    }//GEN-LAST:event_sensorConfigButtonFocusGained

    private void registerDustbinButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerDustbinButtonFocusGained
        jTextField3.setForeground(new java.awt.Color(230, 57, 70));
    }//GEN-LAST:event_registerDustbinButtonFocusGained

    private void registerVanButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerVanButtonFocusGained
        jTextField4.setForeground(new java.awt.Color(230, 57, 70));
    }//GEN-LAST:event_registerVanButtonFocusGained

    private void startMonitorButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_startMonitorButtonFocusGained
        jTextField6.setForeground(new java.awt.Color(230, 57, 70));
    }//GEN-LAST:event_startMonitorButtonFocusGained

    private void frameworkConfigButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_frameworkConfigButtonFocusGained
        jTextField2.setForeground(new java.awt.Color(230, 57, 70));
    }//GEN-LAST:event_frameworkConfigButtonFocusGained

    private void sensorConfigButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sensorConfigButtonFocusLost
        jTextField1.setForeground(new java.awt.Color(29,53,87));
    }//GEN-LAST:event_sensorConfigButtonFocusLost

    private void frameworkConfigButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_frameworkConfigButtonFocusLost
        jTextField2.setForeground(new java.awt.Color(29,53,87));
    }//GEN-LAST:event_frameworkConfigButtonFocusLost

    private void registerDustbinButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerDustbinButtonFocusLost
        jTextField3.setForeground(new java.awt.Color(29,53,87));
    }//GEN-LAST:event_registerDustbinButtonFocusLost

    private void registerVanButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_registerVanButtonFocusLost
        jTextField4.setForeground(new java.awt.Color(29,53,87));
    }//GEN-LAST:event_registerVanButtonFocusLost

    private void startMonitorButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_startMonitorButtonFocusLost
        jTextField6.setForeground(new java.awt.Color(29,53,87));
    }//GEN-LAST:event_startMonitorButtonFocusLost

    private void stopMonitorButtonFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_stopMonitorButtonFocusLost
        jTextField5.setForeground(new java.awt.Color(29,53,87));
    }//GEN-LAST:event_stopMonitorButtonFocusLost

   
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
            java.util.logging.Logger.getLogger(landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(landing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                landing o = new landing();
                o.setDefaultCloseOperation(EXIT_ON_CLOSE);
                o.setVisible(true);
            }
        });
        
        Dustbin d = new Dustbin();
        d.ID = defaultBinKey;
        d.dimension = "80*20*20";
        d.location = "cc3 main entrance";
        
        dustbin.put(defaultBinKey, d);
        
        Van v = new Van();
        v.ID = "0";
        v.driver = "Rishika Agarwal";
        v.email = "iit2019171@iiita.ac.in";
        
        van.put("0", v);
        vanID.add("0");
        
        timer = new Timer(); 
        task = new SensorUpdate(); 
        timer.schedule(task, 1000, 5000); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton frameworkConfigButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JButton registerDustbinButton;
    private javax.swing.JButton registerVanButton;
    private javax.swing.JButton sensorConfigButton;
    private javax.swing.JButton startMonitorButton;
    private javax.swing.JButton stopMonitorButton;
    // End of variables declaration//GEN-END:variables
}
