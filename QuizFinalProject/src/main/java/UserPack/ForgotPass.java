package UserPack;

import Database.DatabaseConnection;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ForgotPass extends javax.swing.JFrame {

    String receiveMail;
    String otp;
    String otpw;
    String emailId;

    public ForgotPass() {
        initComponents();
        PassField.setEditable(false);
        OtpConfirmBtn.setEnabled(false);
        ConfirmPasswordField.setEditable(false);
        LoginBtn.setEnabled(false);
        ImageIcon passeye = new ImageIcon("src/main/java/img/PasswordEyeImg.png");
        PassEye.setIcon(passeye);
        ImageIcon passeye1 = new ImageIcon("src/main/java/img/PasswordEyeImg.png");
        PassEye1.setIcon(passeye1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        ForgotPassTitle = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BodyPanel = new javax.swing.JPanel();
        EmailLabel = new javax.swing.JLabel();
        OtpLb = new javax.swing.JLabel();
        NewPassLb = new javax.swing.JLabel();
        ConfirmPassLb = new javax.swing.JLabel();
        ErrorShow = new javax.swing.JLabel();
        LoginBtn = new javax.swing.JButton();
        OtpConfirmBtn = new javax.swing.JButton();
        SendOtpBtn = new javax.swing.JButton();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        PassField = new javax.swing.JPasswordField();
        OtpField = new javax.swing.JTextField();
        MailField = new javax.swing.JTextField();
        PassEye = new javax.swing.JLabel();
        PassEye1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(0, 0, 102));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ForgotPassTitle.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        ForgotPassTitle.setForeground(new java.awt.Color(255, 255, 255));
        ForgotPassTitle.setText("Forgot Password");
        HeaderPanel.add(ForgotPassTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 320, -1));

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        HeaderPanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 80, 30));

        getContentPane().add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 100));

        BodyPanel.setBackground(new java.awt.Color(102, 0, 102));
        BodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmailLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Enter Email :-");
        BodyPanel.add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, -1));

        OtpLb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        OtpLb.setForeground(new java.awt.Color(255, 255, 255));
        OtpLb.setText("Enter Otp :-");
        BodyPanel.add(OtpLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, 30));

        NewPassLb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NewPassLb.setForeground(new java.awt.Color(255, 255, 255));
        NewPassLb.setText("New Password");
        BodyPanel.add(NewPassLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 163, -1));

        ConfirmPassLb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ConfirmPassLb.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPassLb.setText("Confirm Password");
        BodyPanel.add(ConfirmPassLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        ErrorShow.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ErrorShow.setForeground(new java.awt.Color(204, 0, 0));
        BodyPanel.add(ErrorShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 290, 40));

        LoginBtn.setBackground(new java.awt.Color(102, 0, 102));
        LoginBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        LoginBtn.setText("Login");
        LoginBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        BodyPanel.add(LoginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 130, 30));

        OtpConfirmBtn.setBackground(new java.awt.Color(102, 0, 102));
        OtpConfirmBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OtpConfirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        OtpConfirmBtn.setText("Confirm");
        OtpConfirmBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        OtpConfirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtpConfirmBtnActionPerformed(evt);
            }
        });
        BodyPanel.add(OtpConfirmBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 110, 30));

        SendOtpBtn.setBackground(new java.awt.Color(102, 0, 102));
        SendOtpBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SendOtpBtn.setForeground(new java.awt.Color(255, 255, 255));
        SendOtpBtn.setText("Send Otp");
        SendOtpBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        SendOtpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendOtpBtnActionPerformed(evt);
            }
        });
        BodyPanel.add(SendOtpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 60, 100, 30));

        ConfirmPasswordField.setBackground(new java.awt.Color(102, 0, 102));
        ConfirmPasswordField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        ConfirmPasswordField.setForeground(new java.awt.Color(255, 255, 255));
        ConfirmPasswordField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        ConfirmPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ConfirmPasswordFieldKeyReleased(evt);
            }
        });
        BodyPanel.add(ConfirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 350, 30));

        PassField.setBackground(new java.awt.Color(102, 0, 102));
        PassField.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        PassField.setForeground(new java.awt.Color(255, 255, 255));
        PassField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        PassField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PassField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PassFieldKeyReleased(evt);
            }
        });
        BodyPanel.add(PassField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 350, 30));

        OtpField.setBackground(new java.awt.Color(102, 0, 102));
        OtpField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        OtpField.setForeground(new java.awt.Color(255, 255, 255));
        OtpField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        BodyPanel.add(OtpField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 136, 30));

        MailField.setBackground(new java.awt.Color(102, 0, 102));
        MailField.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        MailField.setForeground(new java.awt.Color(255, 255, 255));
        MailField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        BodyPanel.add(MailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 350, 30));

        PassEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PassEyeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PassEyeMouseExited(evt);
            }
        });
        BodyPanel.add(PassEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 30, 30));

        PassEye1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PassEye1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PassEye1MouseExited(evt);
            }
        });
        BodyPanel.add(PassEye1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 30, 30));

        getContentPane().add(BodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 950, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SendOtpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendOtpBtnActionPerformed
        //Check Email Address Of User When Click On Send Otp
        emailId = MailField.getText();
        try {
            Connection con = DatabaseConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from register where email = '" + emailId + "'");
            if (emailId.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter email id", "Select", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (rs.next()) {
                    RegistrationPage obj = new RegistrationPage();
                    otpw = obj.generateOTP();
                    String message = otpw;
                    String subject = "OTP Confirmation For QuizApp";
                    String to = emailId;
                    String from = "bhavin.otp2021@gmail.com";
                    obj.sendEmail(message, subject, to, from);
                    OtpConfirmBtn.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter true email id which u login earlier");
                }
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SendOtpBtnActionPerformed

    private void OtpConfirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtpConfirmBtnActionPerformed
        String a = OtpField.getText();
        if (a.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter Otp", "Select", JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (otpw.equals(a)) {
                PassField.setEditable(true);
                ConfirmPasswordField.setEditable(true);
            } else {
                JOptionPane.showMessageDialog(null, "Please Enter True Otp", "Select", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_OtpConfirmBtnActionPerformed

    private void PassFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassFieldKeyReleased
        String PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(PassField.getText());
        if (!match.matches()) {
            ErrorShow.setText("Password not match fullfil condition");
            LoginBtn.setEnabled(false);
        } else {
            ErrorShow.setText(null);
            LoginBtn.setEnabled(false);
        }
    }//GEN-LAST:event_PassFieldKeyReleased

    private void ConfirmPasswordFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConfirmPasswordFieldKeyReleased
        String passW = PassField.getText();
        String conpW = ConfirmPasswordField.getText();
        if (passW.equals(conpW)) {
            ErrorShow.setText(null);
            LoginBtn.setEnabled(true);
        } else {
            ErrorShow.setText("not match");
            LoginBtn.setEnabled(false);
        }
    }//GEN-LAST:event_ConfirmPasswordFieldKeyReleased

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        //Update Password Through Email Id
        String passId = PassField.getText();
        try {
            Connection con = DatabaseConnection.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("update register set pass = '" + passId + "' where email = '" + emailId + "'");
            JOptionPane.showMessageDialog(null, "Successfully login ");
            new LoginPage().setVisible(true);
            dispose();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new LoginPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PassEyeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassEyeMouseEntered
        ConfirmPasswordField.setEchoChar((char) 0);
    }//GEN-LAST:event_PassEyeMouseEntered

    private void PassEyeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassEyeMouseExited
        ConfirmPasswordField.setEchoChar('*');
    }//GEN-LAST:event_PassEyeMouseExited

    private void PassEye1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassEye1MouseEntered
        PassField.setEchoChar((char) 0);
    }//GEN-LAST:event_PassEye1MouseEntered

    private void PassEye1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassEye1MouseExited
        PassField.setEchoChar('*');
    }//GEN-LAST:event_PassEye1MouseExited
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForgotPass().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JLabel ConfirmPassLb;
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JLabel ErrorShow;
    private javax.swing.JLabel ForgotPassTitle;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JTextField MailField;
    private javax.swing.JLabel NewPassLb;
    private javax.swing.JButton OtpConfirmBtn;
    private javax.swing.JTextField OtpField;
    private javax.swing.JLabel OtpLb;
    private javax.swing.JLabel PassEye;
    private javax.swing.JLabel PassEye1;
    private javax.swing.JPasswordField PassField;
    private javax.swing.JButton SendOtpBtn;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
