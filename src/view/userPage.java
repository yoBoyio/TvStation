/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UserPageController;

/**
 *
 * @author dimi44
 */
public class userPage extends javax.swing.JFrame {

    /**
     * Creates new form userPage
     */ 
    String userDetails [];
    String userName;
    public userPage(String userDetails[]) {
        initComponents();
        this.userDetails=userDetails;
        userName=userDetails[0];
        usernameLbl.setText(userName);
        nameLbl.setText(userDetails[2]);
        surnameLbl.setText(userDetails[3]);
        emailLbl.setText(userDetails[5]);
        
    }

    private userPage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        playNamelbl2 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        playNamelbl5 = new javax.swing.JLabel();
        schDateLbl = new javax.swing.JLabel();
        schTimeLbl = new javax.swing.JLabel();
        updatePass = new javax.swing.JButton();
        errorLbl = new javax.swing.JLabel();
        oldPassField = new javax.swing.JPasswordField();
        newPassField = new javax.swing.JPasswordField();
        newPassLbl = new javax.swing.JLabel();
        playNamelbl6 = new javax.swing.JLabel();
        newPassLbl1 = new javax.swing.JLabel();
        playNamelbl7 = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        playNamelbl9 = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        surnameLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(20, 32, 37));
        jPanel2.setPreferredSize(new java.awt.Dimension(1401, 700));

        playNamelbl2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        playNamelbl2.setForeground(new java.awt.Color(255, 255, 255));
        playNamelbl2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        playNamelbl2.setText("Change Password");

        backButton.setBackground(new java.awt.Color(20, 32, 37));
        backButton.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back To The Schedule");
        backButton.setMargin(new java.awt.Insets(5, 14, 5, 14));
        backButton.setOpaque(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        playNamelbl5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        playNamelbl5.setForeground(new java.awt.Color(255, 255, 255));
        playNamelbl5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        playNamelbl5.setText("Old Password :");

        schDateLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        schDateLbl.setForeground(new java.awt.Color(255, 255, 255));
        schDateLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        schTimeLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        schTimeLbl.setForeground(new java.awt.Color(255, 255, 255));
        schTimeLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        updatePass.setText("update password");
        updatePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePassActionPerformed(evt);
            }
        });

        errorLbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        errorLbl.setForeground(new java.awt.Color(255, 255, 255));

        oldPassField.setBackground(new java.awt.Color(20, 32, 37));
        oldPassField.setForeground(new java.awt.Color(255, 255, 255));
        oldPassField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        oldPassField.setMinimumSize(new java.awt.Dimension(100, 20));
        oldPassField.setPreferredSize(new java.awt.Dimension(200, 20));

        newPassField.setBackground(new java.awt.Color(20, 32, 37));
        newPassField.setForeground(new java.awt.Color(255, 255, 255));
        newPassField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 204, 204)));
        newPassField.setMinimumSize(new java.awt.Dimension(100, 20));
        newPassField.setPreferredSize(new java.awt.Dimension(200, 20));

        newPassLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newPassLbl.setForeground(new java.awt.Color(255, 255, 255));
        newPassLbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        newPassLbl.setText("New Password :");

        playNamelbl6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        playNamelbl6.setForeground(new java.awt.Color(255, 255, 255));
        playNamelbl6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        playNamelbl6.setText("Surname :");

        newPassLbl1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newPassLbl1.setForeground(new java.awt.Color(255, 255, 255));
        newPassLbl1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        newPassLbl1.setText("Email :");

        playNamelbl7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        playNamelbl7.setForeground(new java.awt.Color(255, 255, 255));
        playNamelbl7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        playNamelbl7.setText("Name :");

        usernameLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        usernameLbl.setForeground(new java.awt.Color(255, 255, 255));
        usernameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        playNamelbl9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        playNamelbl9.setForeground(new java.awt.Color(255, 255, 255));
        playNamelbl9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        playNamelbl9.setText("Username :");

        nameLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nameLbl.setForeground(new java.awt.Color(255, 255, 255));
        nameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        surnameLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        surnameLbl.setForeground(new java.awt.Color(255, 255, 255));
        surnameLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        emailLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailLbl.setForeground(new java.awt.Color(255, 255, 255));
        emailLbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(errorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(playNamelbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newPassLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(schDateLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(schTimeLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(38, 38, 38))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(updatePass)))
                .addGap(287, 287, 287))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(playNamelbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(newPassLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(surnameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(emailLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nameLbl, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(playNamelbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(playNamelbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(playNamelbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(backButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(usernameLbl)
                                .addGap(18, 18, 18)
                                .addComponent(nameLbl)
                                .addGap(18, 18, 18)
                                .addComponent(surnameLbl)
                                .addGap(19, 19, 19)
                                .addComponent(emailLbl))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(playNamelbl9)
                                .addGap(18, 18, 18)
                                .addComponent(playNamelbl7)
                                .addGap(18, 18, 18)
                                .addComponent(playNamelbl6)
                                .addGap(19, 19, 19)
                                .addComponent(newPassLbl1)))
                        .addGap(131, 131, 131)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(playNamelbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(schDateLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(schTimeLbl)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playNamelbl5)
                        .addGap(14, 14, 14)
                        .addComponent(newPassLbl))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(oldPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(newPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(errorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(updatePass)
                .addGap(87, 87, 87)
                .addComponent(backButton)
                .addGap(130, 130, 130))
        );

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 952, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        home newhome=new home();
        newhome.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updatePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePassActionPerformed
        // TODO add your handling code here:
        String oldPass=String.valueOf(oldPassField.getPassword());
        String newPass=String.valueOf(newPassField.getPassword());
        if(oldPass==null ||newPass==null ){
            errorLbl.setText("Fields cant be null");
        }else if(oldPass.equals(newPass)){
            errorLbl.setText("Password cant be the same");
        }else if (newPass.length()<8) {
            errorLbl.setText("Password must be at least 8 characters");
        }else{
            int pass=UserPageController.updatePass(userName, newPass, oldPass);
            if(pass==1){
                errorLbl.setText("Password updated succefully");
            }else if (pass==2){
                errorLbl.setText("Wrong Password");

            }
        }
    }//GEN-LAST:event_updatePassActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        dispose();
        mainPage main=new mainPage(userDetails);
        main.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(userPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JLabel errorLbl;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JPasswordField newPassField;
    private javax.swing.JLabel newPassLbl;
    private javax.swing.JLabel newPassLbl1;
    private javax.swing.JPasswordField oldPassField;
    private javax.swing.JLabel playNamelbl2;
    private javax.swing.JLabel playNamelbl5;
    private javax.swing.JLabel playNamelbl6;
    private javax.swing.JLabel playNamelbl7;
    private javax.swing.JLabel playNamelbl9;
    private javax.swing.JLabel schDateLbl;
    private javax.swing.JLabel schTimeLbl;
    private javax.swing.JLabel surnameLbl;
    private javax.swing.JButton updatePass;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}