package UserPack;

import Database.DatabaseConnection;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;
import AdminPanel.AdminHome;

public class LoginPage extends javax.swing.JFrame {

    public LoginPage() {
        initComponents();
        ImageIcon p = new ImageIcon("src/main/java/img/ProjectLogo.png");
        LogoLabel.setIcon(p);
        ImageIcon ab = new ImageIcon("src/main/java/img/ContactUsImg.png");
        ContactIconLabel.setIcon(ab);
        ImageIcon a = new ImageIcon("src/main/java/img/PasswordLockWhiteImg.png");
        PasswrodIconLabel.setIcon(a);
        ImageIcon passeye = new ImageIcon("src/main/java/img/PasswordEyeImg.png");
        PassEyeLabel.setIcon(passeye);
        ImageIcon ear = new ImageIcon("src/main/java/img/EarthBlackImg.png");
        EarthIconLabel.setIcon(ear);
        ImageIcon e = new ImageIcon("src/main/java/img/HomeSmallIcon1.png");
        BackHomeLabel.setIcon(e);
        ImageIcon exitlogp = new ImageIcon("src/main/java/img/CloseWhiteImg.png");
        ExitLabel.setIcon(exitlogp);
        ImageIcon minip = new ImageIcon("src/main/java/img/MinimizeWhiteImg.png");
        MinimizeLabel.setIcon(minip);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        LoginPanelBtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        RegistrationPanelBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        EnterEmail = new javax.swing.JTextField();
        EnterPassword = new javax.swing.JPasswordField();
        NameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        ContactIconLabel = new javax.swing.JLabel();
        PasswrodIconLabel = new javax.swing.JLabel();
        FormTitleLabel = new javax.swing.JLabel();
        NewUserLabel = new javax.swing.JLabel();
        ExitLabel = new javax.swing.JLabel();
        MinimizeLabel = new javax.swing.JLabel();
        PassEyeLabel = new javax.swing.JLabel();
        ForgotPassLabel = new javax.swing.JLabel();
        ForgotPasswordPanelBtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BackHomeLabel = new javax.swing.JLabel();
        LeftSidePanel = new javax.swing.JPanel();
        EarthIconLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(74, 31, 61));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPanelBtn.setBackground(new java.awt.Color(74, 31, 61));
        LoginPanelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        LoginPanelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginPanelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginPanelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginPanelBtnMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Login");

        javax.swing.GroupLayout LoginPanelBtnLayout = new javax.swing.GroupLayout(LoginPanelBtn);
        LoginPanelBtn.setLayout(LoginPanelBtnLayout);
        LoginPanelBtnLayout.setHorizontalGroup(
            LoginPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelBtnLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(38, 38, 38))
        );
        LoginPanelBtnLayout.setVerticalGroup(
            LoginPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        login.add(LoginPanelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 381, -1, -1));

        RegistrationPanelBtn.setBackground(new java.awt.Color(74, 31, 61));
        RegistrationPanelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        RegistrationPanelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrationPanelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegistrationPanelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegistrationPanelBtnMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Click Here");

        javax.swing.GroupLayout RegistrationPanelBtnLayout = new javax.swing.GroupLayout(RegistrationPanelBtn);
        RegistrationPanelBtn.setLayout(RegistrationPanelBtnLayout);
        RegistrationPanelBtnLayout.setHorizontalGroup(
            RegistrationPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistrationPanelBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );
        RegistrationPanelBtnLayout.setVerticalGroup(
            RegistrationPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        login.add(RegistrationPanelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 442, 90, 40));

        EnterEmail.setBackground(new java.awt.Color(74, 31, 61));
        EnterEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnterEmail.setForeground(new java.awt.Color(255, 255, 255));
        EnterEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        login.add(EnterEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 183, 228, 39));

        EnterPassword.setBackground(new java.awt.Color(74, 31, 61));
        EnterPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnterPassword.setForeground(new java.awt.Color(255, 255, 255));
        EnterPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        login.add(EnterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 314, 228, 39));

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Enter Email");
        login.add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 147, -1, 20));

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Enter Password");
        login.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 288, -1, 20));
        login.add(ContactIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 173, 37, 30));
        login.add(PasswrodIconLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 321, 37, 31));

        FormTitleLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        FormTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        FormTitleLabel.setText("Login Form");
        login.add(FormTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 34, 160, 38));

        NewUserLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NewUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        NewUserLabel.setText("New User ?");
        login.add(NewUserLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 110, 40));

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
        login.add(ExitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 10, 30, 30));

        MinimizeLabel.setBackground(new java.awt.Color(186, 79, 84));
        MinimizeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeLabelMouseExited(evt);
            }
        });
        login.add(MinimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));

        PassEyeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PassEyeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PassEyeLabelMouseExited(evt);
            }
        });
        login.add(PassEyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 30, 28));

        ForgotPassLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ForgotPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        ForgotPassLabel.setText("Forgot Password ?");
        login.add(ForgotPassLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 170, 42));

        ForgotPasswordPanelBtn.setBackground(new java.awt.Color(74, 31, 61));
        ForgotPasswordPanelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        ForgotPasswordPanelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPasswordPanelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForgotPasswordPanelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgotPasswordPanelBtnMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Click Here");

        javax.swing.GroupLayout ForgotPasswordPanelBtnLayout = new javax.swing.GroupLayout(ForgotPasswordPanelBtn);
        ForgotPasswordPanelBtn.setLayout(ForgotPasswordPanelBtnLayout);
        ForgotPasswordPanelBtnLayout.setHorizontalGroup(
            ForgotPasswordPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ForgotPasswordPanelBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );
        ForgotPasswordPanelBtnLayout.setVerticalGroup(
            ForgotPasswordPanelBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
        );

        login.add(ForgotPasswordPanelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 492, 90, 40));

        BackHomeLabel.setToolTipText("");
        BackHomeLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackHomeLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackHomeLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackHomeLabelMouseExited(evt);
            }
        });
        login.add(BackHomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 30));

        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 0, 411, 540));

        LeftSidePanel.setBackground(new java.awt.Color(186, 79, 84));

        EarthIconLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EarthIconLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EarthIconLabelMouseExited(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Fun With Learn");

        javax.swing.GroupLayout LeftSidePanelLayout = new javax.swing.GroupLayout(LeftSidePanel);
        LeftSidePanel.setLayout(LeftSidePanelLayout);
        LeftSidePanelLayout.setHorizontalGroup(
            LeftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftSidePanelLayout.createSequentialGroup()
                .addGroup(LeftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(LeftSidePanelLayout.createSequentialGroup()
                        .addContainerGap(131, Short.MAX_VALUE)
                        .addComponent(EarthIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftSidePanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TitleLabel)))
                .addGap(115, 115, 115))
        );
        LeftSidePanelLayout.setVerticalGroup(
            LeftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftSidePanelLayout.createSequentialGroup()
                .addGroup(LeftSidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftSidePanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftSidePanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139)
                .addComponent(EarthIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        getContentPane().add(LeftSidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginPanelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPanelBtnMouseClicked
        String umail = EnterEmail.getText();
        String passwd = EnterPassword.getText();

        try {
            Connection con = DatabaseConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from register where email ='" + umail + "' and pass = '" + passwd + "'");

            if (umail.equals("") & passwd.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter detail", "Select", JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (rs.next()) {
                    int user_id = rs.getInt(1);
                    JOptionPane.showMessageDialog(null, "Successfully login ", "Select", JOptionPane.INFORMATION_MESSAGE);
                    new QuizHome(user_id).setVisible(true);
                    dispose();
                } else {
                    if ((umail.equals("b") & passwd.equals("admin")) || (umail.equals("m") & passwd.equals("admin"))) {
                        new AdminHome().setVisible(true);
                        dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter valid username and password ", "Select", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showConfirmDialog(this, e);
        }
    }//GEN-LAST:event_LoginPanelBtnMouseClicked

    private void RegistrationPanelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrationPanelBtnMouseClicked
        new RegistrationPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_RegistrationPanelBtnMouseClicked

    private void LoginPanelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPanelBtnMouseEntered
        LoginPanelBtn.setBackground(new java.awt.Color(186, 79, 84));
    }//GEN-LAST:event_LoginPanelBtnMouseEntered

    private void EarthIconLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EarthIconLabelMouseEntered
        ImageIcon ear = new ImageIcon("src/main/java/img/EarthRedImg.png");
        EarthIconLabel.setIcon(ear);
    }//GEN-LAST:event_EarthIconLabelMouseEntered

    private void EarthIconLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EarthIconLabelMouseExited
        ImageIcon ear = new ImageIcon("src/main/java/img/EarthBlackImg.png");
        EarthIconLabel.setIcon(ear);
    }//GEN-LAST:event_EarthIconLabelMouseExited

    private void BackHomeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackHomeLabelMouseEntered
        ImageIcon e = new ImageIcon("src/main/java/img/HomeSmallIcon.png");
        BackHomeLabel.setIcon(e);
    }//GEN-LAST:event_BackHomeLabelMouseEntered

    private void BackHomeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackHomeLabelMouseExited
        ImageIcon e = new ImageIcon("src/main/java/img/HomeSmallIcon1.png");
        BackHomeLabel.setIcon(e);
    }//GEN-LAST:event_BackHomeLabelMouseExited

    private void BackHomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackHomeLabelMouseClicked
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackHomeLabelMouseClicked

    private void LoginPanelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPanelBtnMouseExited
        LoginPanelBtn.setBackground(new java.awt.Color(74, 31, 61));
    }//GEN-LAST:event_LoginPanelBtnMouseExited

    private void RegistrationPanelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrationPanelBtnMouseEntered
        RegistrationPanelBtn.setBackground(new java.awt.Color(186, 79, 84));
    }//GEN-LAST:event_RegistrationPanelBtnMouseEntered

    private void RegistrationPanelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrationPanelBtnMouseExited
        RegistrationPanelBtn.setBackground(new java.awt.Color(74, 31, 61));
    }//GEN-LAST:event_RegistrationPanelBtnMouseExited

    private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to quit", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitLabelMouseClicked

    private void ExitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseEntered
        ImageIcon exit1 = new ImageIcon("src/main/java/img/CloseBlackImg.png");
        ExitLabel.setIcon(exit1);
    }//GEN-LAST:event_ExitLabelMouseEntered

    private void ExitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseExited
        ImageIcon exit2 = new ImageIcon("src/main/java/img/CloseWhiteImg.png");
        ExitLabel.setIcon(exit2);
    }//GEN-LAST:event_ExitLabelMouseExited

    private void MinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseClicked
        setState(RegistrationPage.ICONIFIED);
    }//GEN-LAST:event_MinimizeLabelMouseClicked

    private void MinimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseEntered
        ImageIcon ap = new ImageIcon("src/main/java/img/MinimizeBlackImg.png");
        MinimizeLabel.setIcon(ap);
    }//GEN-LAST:event_MinimizeLabelMouseEntered

    private void MinimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseExited
        ImageIcon ap = new ImageIcon("src/main/java/img/MinimizeWhiteImg.png");
        MinimizeLabel.setIcon(ap);
    }//GEN-LAST:event_MinimizeLabelMouseExited

    private void ForgotPasswordPanelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordPanelBtnMouseClicked
        new ForgotPass().setVisible(true);
        dispose();
    }//GEN-LAST:event_ForgotPasswordPanelBtnMouseClicked

    private void ForgotPasswordPanelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordPanelBtnMouseEntered
        ForgotPasswordPanelBtn.setBackground(new java.awt.Color(186, 79, 84));
    }//GEN-LAST:event_ForgotPasswordPanelBtnMouseEntered

    private void ForgotPasswordPanelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordPanelBtnMouseExited
       ForgotPasswordPanelBtn.setBackground(new java.awt.Color(74, 31, 61));
    }//GEN-LAST:event_ForgotPasswordPanelBtnMouseExited

    private void PassEyeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassEyeLabelMouseEntered
        EnterPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_PassEyeLabelMouseEntered

    private void PassEyeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassEyeLabelMouseExited
        EnterPassword.setEchoChar('*');
    }//GEN-LAST:event_PassEyeLabelMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new LoginPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackHomeLabel;
    private javax.swing.JLabel ContactIconLabel;
    private javax.swing.JLabel EarthIconLabel;
    private javax.swing.JTextField EnterEmail;
    private javax.swing.JPasswordField EnterPassword;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JLabel ForgotPassLabel;
    private javax.swing.JPanel ForgotPasswordPanelBtn;
    private javax.swing.JLabel FormTitleLabel;
    private javax.swing.JPanel LeftSidePanel;
    private javax.swing.JPanel LoginPanelBtn;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel MinimizeLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NewUserLabel;
    private javax.swing.JLabel PassEyeLabel;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel PasswrodIconLabel;
    private javax.swing.JPanel RegistrationPanelBtn;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel login;
    // End of variables declaration//GEN-END:variables
}
