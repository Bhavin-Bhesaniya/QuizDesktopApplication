package UserPack;

import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegistrationPage extends javax.swing.JFrame {

    String otp;
    String to;

    public String generateOTP() {
        int randomPin = (int) (Math.random() * 9000) + 1000;
        otp = String.valueOf(randomPin);
        return otp;
    }

    public RegistrationPage() {
        initComponents();
        ImageIcon p = new ImageIcon("src/main/java/img/ProjectLogo.png");
        LogoLabel.setIcon(p);
        ImageIcon ear = new ImageIcon("src/main/java/img/EarthRedImg.png");
        EarthLabel.setIcon(ear);
        ImageIcon exitlogp = new ImageIcon("src/main/java/img/CloseWhiteImg.png");
        ExitLabel.setIcon(exitlogp);
        ImageIcon minip = new ImageIcon("src/main/java/img/MinimizeWhiteImg.png");
        MinimizeLabel.setIcon(minip);
        ImageIcon e = new ImageIcon("src/main/java/img/HomeSmallIcon1.png");
        BackHomeLabel.setIcon(e);
        ImageIcon conp = new ImageIcon("src/main/java/img/ContactUsImg.png");
        con.setIcon(conp);
        ImageIcon email = new ImageIcon("src/main/java/img/email.png");
        emai.setIcon(email);
        ImageIcon a = new ImageIcon("src/main/java/img/PasswordLockWhiteImg.png");
        pass.setIcon(a);
        ImageIcon passeye = new ImageIcon("src/main/java/img/PasswordEyeImg.png");
        PassEye.setIcon(passeye);
        EnterEmail.setEditable(false);
        EnterPassword.setEditable(false);
        RegistrationBtn.setEnabled(false);
    }

    public static void sendEmail(String message, String subject, String to, String from) {
        Properties properties = System.getProperties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");
        Session session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("bhavin.otp2021@gmail.com", "Bh@vin12Op");
            }
        });
        session.setDebug(true);
        MimeMessage m = new MimeMessage(session);
        try {
            m.setFrom(from);
            m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            m.setSubject(subject);
            m.setContent(message, "text/html");
            Transport.send(m);
            System.out.print("Sent success.........");

        } catch (MessagingException e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JPanel();
        ex = new javax.swing.JLabel();
        RegistrationPanel = new javax.swing.JPanel();
        GoLoginPanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        RegisTitleLabel = new javax.swing.JLabel();
        EnterName = new javax.swing.JTextField();
        EnterEmail = new javax.swing.JTextField();
        EnterPassword = new javax.swing.JPasswordField();
        NameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        con = new javax.swing.JLabel();
        emai = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        PassEye = new javax.swing.JLabel();
        GoLoginLabel = new javax.swing.JLabel();
        RegistrationBtn = new javax.swing.JButton();
        ExitLabel = new javax.swing.JLabel();
        MinimizeLabel = new javax.swing.JLabel();
        BackHomeLabel = new javax.swing.JLabel();
        LeftPanel = new javax.swing.JPanel();
        EarthLabel = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        ErrorShow = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();

        exit.setBackground(new java.awt.Color(74, 31, 61));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ex, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ex, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrationPanel.setBackground(new java.awt.Color(186, 79, 84));
        RegistrationPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GoLoginPanel.setBackground(new java.awt.Color(186, 79, 84));
        GoLoginPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        GoLoginPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GoLoginPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GoLoginPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GoLoginPanelMouseExited(evt);
            }
        });
        GoLoginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Click Here");
        GoLoginPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 70, 36));

        RegistrationPanel.add(GoLoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 100, 40));

        RegisTitleLabel.setFont(new java.awt.Font("Tw Cen MT", 1, 30)); // NOI18N
        RegisTitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        RegisTitleLabel.setText("Registration");
        RegistrationPanel.add(RegisTitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 45, 161, 38));

        EnterName.setBackground(new java.awt.Color(186, 79, 84));
        EnterName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnterName.setForeground(new java.awt.Color(255, 255, 255));
        EnterName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        EnterName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterNameKeyReleased(evt);
            }
        });
        RegistrationPanel.add(EnterName, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 242, 39));

        EnterEmail.setBackground(new java.awt.Color(186, 79, 84));
        EnterEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnterEmail.setForeground(new java.awt.Color(255, 255, 255));
        EnterEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        EnterEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterEmailKeyReleased(evt);
            }
        });
        RegistrationPanel.add(EnterEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 242, 39));

        EnterPassword.setBackground(new java.awt.Color(186, 79, 84));
        EnterPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EnterPassword.setForeground(new java.awt.Color(255, 255, 255));
        EnterPassword.setToolTipText("Enter Password");
        EnterPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        EnterPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnterPasswordKeyReleased(evt);
            }
        });
        RegistrationPanel.add(EnterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 240, 30));

        NameLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameLabel.setForeground(new java.awt.Color(255, 255, 255));
        NameLabel.setText("Name");
        RegistrationPanel.add(NameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 30));

        EmailLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EmailLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmailLabel.setText("Email");
        RegistrationPanel.add(EmailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, 20));

        PasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        PasswordLabel.setText("Password");
        RegistrationPanel.add(PasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 100, 20));
        RegistrationPanel.add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 30, 30));
        RegistrationPanel.add(emai, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 30, 30));
        RegistrationPanel.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 30, 30));

        PassEye.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PassEyeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PassEyeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PassEyeMouseExited(evt);
            }
        });
        RegistrationPanel.add(PassEye, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 20, 20));

        GoLoginLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        GoLoginLabel.setForeground(new java.awt.Color(255, 255, 255));
        GoLoginLabel.setText("Already Register?");
        RegistrationPanel.add(GoLoginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 170, -1));

        RegistrationBtn.setBackground(new java.awt.Color(186, 79, 84));
        RegistrationBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RegistrationBtn.setForeground(new java.awt.Color(255, 255, 255));
        RegistrationBtn.setText("Registration");
        RegistrationBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        RegistrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrationBtnActionPerformed(evt);
            }
        });
        RegistrationPanel.add(RegistrationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 400, 150, 40));

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
        RegistrationPanel.add(ExitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 10, 30, 30));

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
        RegistrationPanel.add(MinimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 30, 30));

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
        RegistrationPanel.add(BackHomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 30));

        getContentPane().add(RegistrationPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 420, 509));

        LeftPanel.setBackground(new java.awt.Color(74, 31, 61));

        EarthLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EarthLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EarthLabelMouseExited(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Fun With Learn");

        ErrorShow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ErrorShow.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(ErrorShow, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(EarthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LogoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(EarthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(ErrorShow, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        getContentPane().add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GoLoginPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoLoginPanelMouseClicked
        LoginPage l = new LoginPage();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_GoLoginPanelMouseClicked

    private void EnterNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterNameKeyReleased
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(EnterName.getText());
        if (!match.matches()) {
            ErrorShow.setText("Name format incorrect");
            EnterEmail.setEditable(false);
            EnterPassword.setEditable(false);
            RegistrationBtn.setEnabled(false);
        } else {
            ErrorShow.setText(null);
            EnterEmail.setEditable(true);
        }
    }//GEN-LAST:event_EnterNameKeyReleased

    private void EarthLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EarthLabelMouseEntered
        ImageIcon ear = new ImageIcon("src/main/java/img/EarthBlackImg.png");
        EarthLabel.setIcon(ear);
    }//GEN-LAST:event_EarthLabelMouseEntered

    private void EarthLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EarthLabelMouseExited
        ImageIcon ear = new ImageIcon("src/main/java/img/EarthRedImg.png");
        EarthLabel.setIcon(ear);
    }//GEN-LAST:event_EarthLabelMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to quit", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        ImageIcon exit1 = new ImageIcon("src/main/java/img/exit4.png");
        ex.setIcon(exit1);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        ImageIcon exit2 = new ImageIcon("src/main/java/img/exit3.png");
        ex.setIcon(exit2);
    }//GEN-LAST:event_exitMouseExited

    private void EnterEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterEmailKeyReleased
        String PATTERN = "^(^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$)";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(EnterEmail.getText());
        if (!match.matches()) {
            ErrorShow.setText("Email format incorrect");
            EnterPassword.setEditable(false);
        } else {
            ErrorShow.setText(null);
            EnterPassword.setEditable(true);
        }
    }//GEN-LAST:event_EnterEmailKeyReleased

    private void EnterPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterPasswordKeyReleased
        String PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(EnterPassword.getText());
        if (!match.matches()) {
            ErrorShow.setText("Not Fulfill Password Condition");
        } else {
            ErrorShow.setText(null);
            RegistrationBtn.setEnabled(true);
        }
    }//GEN-LAST:event_EnterPasswordKeyReleased

    private void RegistrationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrationBtnActionPerformed
        String name = EnterName.getText();
        String uemail = EnterEmail.getText();
        String password = EnterPassword.getText();
        otp = generateOTP();
        String message = otp;
        String subject = "OTP Confirmation For Quiz Desktop Application";
        to = uemail;
        String from = "bhavin.otp2021@gmail.com";
        sendEmail(message, subject, to, from);
        JOptionPane.showMessageDialog(null, "Plz Confirm With Otp for Login");
        new OtpConfirm(otp, to, name, password).setVisible(true);
        dispose();

    }//GEN-LAST:event_RegistrationBtnActionPerformed

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

    private void MinimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseEntered
        ImageIcon ap = new ImageIcon("src/main/java/img/MinimizeBlackImg.png");
        MinimizeLabel.setIcon(ap);
    }//GEN-LAST:event_MinimizeLabelMouseEntered

    private void MinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseClicked
        setState(RegistrationPage.ICONIFIED);
    }//GEN-LAST:event_MinimizeLabelMouseClicked

    private void MinimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseExited
        ImageIcon ap = new ImageIcon("src/main/java/img/MinimizeWhiteImg.png");
        MinimizeLabel.setIcon(ap);
    }//GEN-LAST:event_MinimizeLabelMouseExited

    private void PassEyeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassEyeMouseClicked
        EnterPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_PassEyeMouseClicked

    private void BackHomeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackHomeLabelMouseClicked
        new HomePage().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackHomeLabelMouseClicked

    private void BackHomeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackHomeLabelMouseEntered
        ImageIcon e = new ImageIcon("src/main/java/img/HomeSmallIcon.png");
        BackHomeLabel.setIcon(e);
    }//GEN-LAST:event_BackHomeLabelMouseEntered

    private void BackHomeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackHomeLabelMouseExited
        ImageIcon e = new ImageIcon("src/main/java/img/HomeSmallIcon1.png");
        BackHomeLabel.setIcon(e);
    }//GEN-LAST:event_BackHomeLabelMouseExited

    private void PassEyeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassEyeMouseEntered
        EnterPassword.setEchoChar((char) 0);
    }//GEN-LAST:event_PassEyeMouseEntered

    private void PassEyeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PassEyeMouseExited
        EnterPassword.setEchoChar('*');
    }//GEN-LAST:event_PassEyeMouseExited

    private void GoLoginPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoLoginPanelMouseEntered
        GoLoginPanel.setBackground(new java.awt.Color(74, 31, 61));
        
    }//GEN-LAST:event_GoLoginPanelMouseEntered

    private void GoLoginPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GoLoginPanelMouseExited
        GoLoginPanel.setBackground(new java.awt.Color(186, 79, 84));
    }//GEN-LAST:event_GoLoginPanelMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackHomeLabel;
    private javax.swing.JLabel EarthLabel;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EnterEmail;
    private javax.swing.JTextField EnterName;
    private javax.swing.JPasswordField EnterPassword;
    private javax.swing.JLabel ErrorShow;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JLabel GoLoginLabel;
    private javax.swing.JPanel GoLoginPanel;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JLabel MinimizeLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel PassEye;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel RegisTitleLabel;
    private javax.swing.JButton RegistrationBtn;
    private javax.swing.JPanel RegistrationPanel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel con;
    private javax.swing.JLabel emai;
    private javax.swing.JLabel ex;
    private javax.swing.JPanel exit;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel pass;
    // End of variables declaration//GEN-END:variables
}
