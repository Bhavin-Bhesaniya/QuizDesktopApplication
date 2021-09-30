package UserPack;

import Database.DatabaseConnection;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class OtpConfirm extends javax.swing.JFrame {

    String name;
    String receiveotp;
    String receivemail;
    String password;

    public OtpConfirm(String otp, String to, String uname, String passwd) {
        initComponents();
        receiveotp = otp;
        receivemail = to;
        name = uname;
        password = passwd;
        ImageIcon ao = new ImageIcon("src/main/java/img/CloseWhiteImg.png");
        ExitLabel.setIcon(ao);
    }

    public OtpConfirm() {
        initComponents();
        ImageIcon ao = new ImageIcon("src/main/java/img/CloseWhiteImg.png");
        ExitLabel.setIcon(ao);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OtpMainPanel = new javax.swing.JPanel();
        EnterOtp = new javax.swing.JTextField();
        OtpTite = new javax.swing.JLabel();
        ResendOtpPanel = new javax.swing.JPanel();
        ResendOtp = new javax.swing.JLabel();
        ConfirmOtp = new javax.swing.JPanel();
        ConfirmOtpLabel = new javax.swing.JLabel();
        BackPanel = new javax.swing.JPanel();
        BackLabel = new javax.swing.JLabel();
        ExitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(480, 250));
        setMinimumSize(new java.awt.Dimension(485, 218));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OtpMainPanel.setBackground(new java.awt.Color(74, 31, 61));
        OtpMainPanel.setMaximumSize(new java.awt.Dimension(485, 218));
        OtpMainPanel.setMinimumSize(new java.awt.Dimension(485, 218));
        OtpMainPanel.setPreferredSize(new java.awt.Dimension(485, 218));
        OtpMainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EnterOtp.setBackground(new java.awt.Color(74, 31, 61));
        EnterOtp.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EnterOtp.setForeground(new java.awt.Color(255, 255, 255));
        EnterOtp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        OtpMainPanel.add(EnterOtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 78, 247, 39));

        OtpTite.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OtpTite.setForeground(new java.awt.Color(255, 255, 255));
        OtpTite.setText("Enter OTP");
        OtpMainPanel.add(OtpTite, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 44, 153, 28));

        ResendOtpPanel.setBackground(new java.awt.Color(74, 31, 61));
        ResendOtpPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ResendOtpPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResendOtpPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResendOtpPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResendOtpPanelMouseExited(evt);
            }
        });

        ResendOtp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResendOtp.setForeground(new java.awt.Color(255, 255, 255));
        ResendOtp.setText("Resend");

        javax.swing.GroupLayout ResendOtpPanelLayout = new javax.swing.GroupLayout(ResendOtpPanel);
        ResendOtpPanel.setLayout(ResendOtpPanelLayout);
        ResendOtpPanelLayout.setHorizontalGroup(
            ResendOtpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResendOtpPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ResendOtp)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ResendOtpPanelLayout.setVerticalGroup(
            ResendOtpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ResendOtp, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        OtpMainPanel.add(ResendOtpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 158, -1, -1));

        ConfirmOtp.setBackground(new java.awt.Color(74, 31, 61));
        ConfirmOtp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ConfirmOtp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmOtpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ConfirmOtpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ConfirmOtpMouseExited(evt);
            }
        });

        ConfirmOtpLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ConfirmOtpLabel.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmOtpLabel.setText("Confirm");

        javax.swing.GroupLayout ConfirmOtpLayout = new javax.swing.GroupLayout(ConfirmOtp);
        ConfirmOtp.setLayout(ConfirmOtpLayout);
        ConfirmOtpLayout.setHorizontalGroup(
            ConfirmOtpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfirmOtpLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(ConfirmOtpLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        ConfirmOtpLayout.setVerticalGroup(
            ConfirmOtpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ConfirmOtpLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        OtpMainPanel.add(ConfirmOtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 158, -1, -1));

        BackPanel.setBackground(new java.awt.Color(74, 31, 61));
        BackPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        BackPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackPanelMouseExited(evt);
            }
        });

        BackLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BackLabel.setForeground(new java.awt.Color(255, 255, 255));
        BackLabel.setText("Back");

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BackLabel)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
        );

        OtpMainPanel.add(BackPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        ExitLabel.setToolTipText("");
        ExitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExitLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExitLabelMouseExited(evt);
            }
        });
        OtpMainPanel.add(ExitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 30, 30));

        getContentPane().add(OtpMainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 488, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void ConfirmOtpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmOtpMouseClicked
        String a = EnterOtp.getText();
        if (a.equals("")) {
            JOptionPane.showMessageDialog(null, "please enter otp");
        } else {
            if (receiveotp.equals(a)) {
                try {
                    Connection con = DatabaseConnection.getCon();
                    PreparedStatement pst = con.prepareStatement("insert into register(name,email,pass) values ('" + name + "','" + receivemail + "','" + password + "')");
                    Statement st = con.createStatement();
                    ResultSet rst = st.executeQuery("select * from register where email ='" + receivemail + "'");
                    if (receivemail.equals(rst)) {
                        JOptionPane.showMessageDialog(null, "You have Already Register with this email id");
                        new RegistrationPage().setVisible(true);
                        dispose();
                    } else {
                        pst.executeUpdate();
                        ResultSet rs = st.executeQuery("select id from register where email ='" + receivemail + "'");
                        rs.next();
                        int user_id = rs.getInt(1);
                        new QuizHome(user_id).setVisible(true);
                        dispose();
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter Right Otp");
            }
        }
    }//GEN-LAST:event_ConfirmOtpMouseClicked

    private void ResendOtpPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResendOtpPanelMouseClicked
        RegistrationPage obj = new RegistrationPage();
        receiveotp = obj.generateOTP();
        String message = receiveotp;
        String subject = "OTP";
        String to = receivemail;
        String from = "bhavin.otp2021@gmail.com";
        obj.sendEmail(message, subject, to, from);
    }//GEN-LAST:event_ResendOtpPanelMouseClicked

    private void ConfirmOtpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmOtpMouseEntered
        ConfirmOtp.setBackground(new java.awt.Color(186, 79, 84));
    }//GEN-LAST:event_ConfirmOtpMouseEntered

    private void ConfirmOtpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmOtpMouseExited
        ConfirmOtp.setBackground(new java.awt.Color(74, 31, 61));
    }//GEN-LAST:event_ConfirmOtpMouseExited

    private void ResendOtpPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResendOtpPanelMouseEntered
        ResendOtpPanel.setBackground(new java.awt.Color(186, 79, 84));
    }//GEN-LAST:event_ResendOtpPanelMouseEntered

    private void ResendOtpPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResendOtpPanelMouseExited
        ResendOtpPanel.setBackground(new java.awt.Color(74, 31, 61));
    }//GEN-LAST:event_ResendOtpPanelMouseExited

    private void BackPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackPanelMouseClicked
        new RegistrationPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackPanelMouseClicked

    private void BackPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackPanelMouseEntered
        BackPanel.setBackground(new java.awt.Color(186, 79, 84));
    }//GEN-LAST:event_BackPanelMouseEntered

    private void BackPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackPanelMouseExited
        BackPanel.setBackground(new java.awt.Color(74, 31, 61));
    }//GEN-LAST:event_BackPanelMouseExited

    private void ExitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseEntered
        ImageIcon exit1 = new ImageIcon("src/main/java/img/CloseBlackImg.png");
        ExitLabel.setIcon(exit1);
    }//GEN-LAST:event_ExitLabelMouseEntered

    private void ExitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseExited
        ImageIcon exit2 = new ImageIcon("src/main/java/img/CloseWhiteImg.png");
        ExitLabel.setIcon(exit2);
    }//GEN-LAST:event_ExitLabelMouseExited

    private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to quit", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitLabelMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OtpConfirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackLabel;
    private javax.swing.JPanel BackPanel;
    private javax.swing.JPanel ConfirmOtp;
    private javax.swing.JLabel ConfirmOtpLabel;
    private javax.swing.JTextField EnterOtp;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JPanel OtpMainPanel;
    private javax.swing.JLabel OtpTite;
    private javax.swing.JLabel ResendOtp;
    private javax.swing.JPanel ResendOtpPanel;
    // End of variables declaration//GEN-END:variables

}
