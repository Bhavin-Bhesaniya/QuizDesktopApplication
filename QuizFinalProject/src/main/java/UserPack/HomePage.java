package UserPack;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
        ImageIcon ap = new ImageIcon("src/main/java/img/CloseWhiteImg.png");
        ExitLabel.setIcon(ap);
        ImageIcon ao = new ImageIcon("src/main/java/img/MinimizeWhiteImg.png");
        MinimizeLabel.setIcon(ao);
        ImageIcon p = new ImageIcon("src/main/java/img/ProjectLogo.png");
        LogoLabel.setIcon(p);
        ImageIcon instaIc = new ImageIcon("src/main/java/img/instagram.png");
        InstagramLink.setIcon(instaIc);
        ImageIcon yt = new ImageIcon("src/main/java/img/youtube.png");
        youtubeLink.setIcon(yt);
        ImageIcon linkdinIc = new ImageIcon("src/main/java/img/linkedin.png");
        linkdinLink.setIcon(linkdinIc);
        ImageIcon GithubIc = new ImageIcon("src/main/java/img/github.png");
        GithubLink.setIcon(GithubIc);
        ImageIcon instaIcM = new ImageIcon("src/main/java/img/instagram.png");
        InstagramLinkMayur.setIcon(instaIcM);
        ImageIcon ytM = new ImageIcon("src/main/java/img/youtube.png");
        youtubeLinkMayur.setIcon(ytM);
        ImageIcon GithubIcM = new ImageIcon("src/main/java/img/github.png");
        GithubLinkMayur.setIcon(GithubIcM);        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        HomeLabel = new javax.swing.JLabel();
        AboutUsPanel = new javax.swing.JPanel();
        AboutUsLabel = new javax.swing.JLabel();
        SignUpPanel = new javax.swing.JPanel();
        sinup = new javax.swing.JLabel();
        ProjectIconTitle = new javax.swing.JLabel();
        SignInPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        LogoLabel = new javax.swing.JLabel();
        ExitLabel = new javax.swing.JLabel();
        MinimizeLabel = new javax.swing.JLabel();
        MainBodyPanel = new javax.swing.JPanel();
        BodyPanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        StartPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        LoginPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        BodyAboutUs = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        FollowBhavinLb = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        InstagramLink = new javax.swing.JLabel();
        youtubeLink = new javax.swing.JLabel();
        linkdinLink = new javax.swing.JLabel();
        youtubeLinkMayur = new javax.swing.JLabel();
        InstagramLinkMayur = new javax.swing.JLabel();
        FollowMayurLb = new javax.swing.JLabel();
        GithubLink = new javax.swing.JLabel();
        GithubLinkMayur = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 150));
        setUndecorated(true);

        HeaderPanel.setBackground(new java.awt.Color(74, 31, 61));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomePanel.setBackground(new java.awt.Color(74, 31, 61));
        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomePanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomePanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomePanelMouseExited(evt);
            }
        });
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HomeLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        HomeLabel.setForeground(new java.awt.Color(255, 255, 255));
        HomeLabel.setText("    Home");
        HomePanel.add(HomeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 70, 20));

        HeaderPanel.add(HomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, 70));

        AboutUsPanel.setBackground(new java.awt.Color(74, 31, 61));
        AboutUsPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AboutUsPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AboutUsPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AboutUsPanelMouseExited(evt);
            }
        });

        AboutUsLabel.setBackground(new java.awt.Color(74, 31, 61));
        AboutUsLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        AboutUsLabel.setForeground(new java.awt.Color(255, 255, 255));
        AboutUsLabel.setText("About Us");

        javax.swing.GroupLayout AboutUsPanelLayout = new javax.swing.GroupLayout(AboutUsPanel);
        AboutUsPanel.setLayout(AboutUsPanelLayout);
        AboutUsPanelLayout.setHorizontalGroup(
            AboutUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AboutUsPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(AboutUsLabel)
                .addContainerGap())
        );
        AboutUsPanelLayout.setVerticalGroup(
            AboutUsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AboutUsPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(AboutUsLabel)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        HeaderPanel.add(AboutUsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, 70));

        SignUpPanel.setBackground(new java.awt.Color(74, 31, 61));
        SignUpPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignUpPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignUpPanelMouseExited(evt);
            }
        });

        sinup.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sinup.setForeground(new java.awt.Color(255, 255, 255));
        sinup.setText("   Sign Up");

        javax.swing.GroupLayout SignUpPanelLayout = new javax.swing.GroupLayout(SignUpPanel);
        SignUpPanel.setLayout(SignUpPanelLayout);
        SignUpPanelLayout.setHorizontalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sinup, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        SignUpPanelLayout.setVerticalGroup(
            SignUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignUpPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(sinup)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        HeaderPanel.add(SignUpPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, 70));

        ProjectIconTitle.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        ProjectIconTitle.setForeground(new java.awt.Color(255, 255, 255));
        ProjectIconTitle.setText("Fun With Learn");
        HeaderPanel.add(ProjectIconTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 20, 180, 52));

        SignInPanel.setBackground(new java.awt.Color(74, 31, 61));
        SignInPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignInPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignInPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignInPanelMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("   Sign In");

        javax.swing.GroupLayout SignInPanelLayout = new javax.swing.GroupLayout(SignInPanel);
        SignInPanel.setLayout(SignInPanelLayout);
        SignInPanelLayout.setHorizontalGroup(
            SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );
        SignInPanelLayout.setVerticalGroup(
            SignInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SignInPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel6)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        HeaderPanel.add(SignInPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, -1, 70));
        HeaderPanel.add(LogoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 44, 52));

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
        HeaderPanel.add(ExitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 10, 30, 30));

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
        HeaderPanel.add(MinimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 30, 30));

        MainBodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BodyPanel.setBackground(new java.awt.Color(186, 79, 84));
        BodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Welcome to my Quiz Application");
        BodyPanel.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 59, 570, 65));

        jLabel8.setBackground(new java.awt.Color(186, 79, 84));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("A quiz is a form of game or mind sport in which players attempt to answer questions correctly about a certain or variety of subjects");
        BodyPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 196, 906, 32));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("can be used as a brief assessment in education and similar fields to measure growth in knowledge, abilities, or skills. They can also be");
        BodyPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 234, 879, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("televised for entertainment purposes, often in a game show format.");
        BodyPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 270, 817, 24));

        StartPanel.setBackground(new java.awt.Color(186, 79, 84));
        StartPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        StartPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StartPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                StartPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                StartPanelMouseExited(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Start Here ");

        javax.swing.GroupLayout StartPanelLayout = new javax.swing.GroupLayout(StartPanel);
        StartPanel.setLayout(StartPanelLayout);
        StartPanelLayout.setHorizontalGroup(
            StartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StartPanelLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(28, 28, 28))
        );
        StartPanelLayout.setVerticalGroup(
            StartPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        BodyPanel.add(StartPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 359, -1, -1));

        LoginPanel.setBackground(new java.awt.Color(186, 79, 84));
        LoginPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        LoginPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LoginPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LoginPanelMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Login");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel11)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        BodyPanel.add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 359, -1, -1));

        MainBodyPanel.add(BodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 975, 460));

        BodyAboutUs.setBackground(new java.awt.Color(186, 79, 84));
        BodyAboutUs.setMinimumSize(new java.awt.Dimension(955, 359));
        BodyAboutUs.setName(""); // NOI18N
        BodyAboutUs.setPreferredSize(new java.awt.Dimension(975, 408));
        BodyAboutUs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("- We are two individuals with a passion for creativity that  makes us happy.");
        BodyAboutUs.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("    communications,  elevate experiences,engage and inspire people everywhere. ");
        BodyAboutUs.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 840, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("- Let's make something beautiful together.");
        BodyAboutUs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 470, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("- We believe in the transformative power of illustration and   design and their ability to simplify ");
        BodyAboutUs.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 830, 50));

        FollowBhavinLb.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        FollowBhavinLb.setForeground(new java.awt.Color(255, 255, 255));
        FollowBhavinLb.setText("Contact Bhavin :-");
        BodyAboutUs.add(FollowBhavinLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 180, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Developed By :- Bhavin Bhesaniya & Mayur Solanki");
        BodyAboutUs.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 460, 50));

        InstagramLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InstagramLinkMouseClicked(evt);
            }
        });
        BodyAboutUs.add(InstagramLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 30, 30));

        youtubeLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                youtubeLinkMouseClicked(evt);
            }
        });
        BodyAboutUs.add(youtubeLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 30, 30));

        linkdinLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                linkdinLinkMouseClicked(evt);
            }
        });
        BodyAboutUs.add(linkdinLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 30, 30));

        youtubeLinkMayur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                youtubeLinkMayurMouseClicked(evt);
            }
        });
        BodyAboutUs.add(youtubeLinkMayur, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 30, 30));

        InstagramLinkMayur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InstagramLinkMayurMouseClicked(evt);
            }
        });
        BodyAboutUs.add(InstagramLinkMayur, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 30, 30));

        FollowMayurLb.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        FollowMayurLb.setForeground(new java.awt.Color(255, 255, 255));
        FollowMayurLb.setText("Contact  Mayur :-");
        BodyAboutUs.add(FollowMayurLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 180, 40));

        GithubLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GithubLinkMouseClicked(evt);
            }
        });
        BodyAboutUs.add(GithubLink, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 30, 30));

        GithubLinkMayur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GithubLinkMayurMouseClicked(evt);
            }
        });
        BodyAboutUs.add(GithubLinkMayur, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, 30, 30));

        MainBodyPanel.add(BodyAboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainBodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HeaderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HeaderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainBodyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseClicked
        BodyPanel.setVisible(true);
        BodyAboutUs.setVisible(false);
    }//GEN-LAST:event_HomePanelMouseClicked

    private void HomePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseEntered
        HomePanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
    }//GEN-LAST:event_HomePanelMouseEntered

    private void HomePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseExited
        HomePanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
    }//GEN-LAST:event_HomePanelMouseExited

    private void AboutUsPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsPanelMouseClicked
        BodyPanel.setVisible(false);
        BodyAboutUs.setVisible(true);
    }//GEN-LAST:event_AboutUsPanelMouseClicked

    private void SignUpPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpPanelMouseClicked
        RegistrationPage a = new RegistrationPage();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_SignUpPanelMouseClicked

    private void SignInPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInPanelMouseClicked
        LoginPage b = new LoginPage();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_SignInPanelMouseClicked

    private void StartPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartPanelMouseClicked
        RegistrationPage ap = new RegistrationPage();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_StartPanelMouseClicked

    private void LoginPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPanelMouseClicked
        LoginPage b = new LoginPage();
        b.setVisible(true);
        dispose();
    }//GEN-LAST:event_LoginPanelMouseClicked

    private void AboutUsPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsPanelMouseEntered
        AboutUsPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
    }//GEN-LAST:event_AboutUsPanelMouseEntered

    private void AboutUsPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AboutUsPanelMouseExited
        AboutUsPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
    }//GEN-LAST:event_AboutUsPanelMouseExited

    private void SignUpPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpPanelMouseEntered
        SignUpPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
    }//GEN-LAST:event_SignUpPanelMouseEntered

    private void SignInPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInPanelMouseEntered
        SignInPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
    }//GEN-LAST:event_SignInPanelMouseEntered

    private void SignUpPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpPanelMouseExited
        SignUpPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
    }//GEN-LAST:event_SignUpPanelMouseExited

    private void SignInPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignInPanelMouseExited
        SignInPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
    }//GEN-LAST:event_SignInPanelMouseExited

    private void StartPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartPanelMouseEntered
        StartPanel.setBackground(new java.awt.Color(74, 31, 61));
    }//GEN-LAST:event_StartPanelMouseEntered

    private void StartPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StartPanelMouseExited
        StartPanel.setBackground(new java.awt.Color(186, 79, 84));
    }//GEN-LAST:event_StartPanelMouseExited

    private void LoginPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPanelMouseExited
        LoginPanel.setBackground(new java.awt.Color(186, 79, 84));
    }//GEN-LAST:event_LoginPanelMouseExited

    private void LoginPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginPanelMouseEntered
        LoginPanel.setBackground(new java.awt.Color(74, 31, 61));
    }//GEN-LAST:event_LoginPanelMouseEntered

    private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
        System.exit(0);
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

    private void InstagramLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InstagramLinkMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/mr_bhavin_bhesaniya/"));
        } catch (IOException | URISyntaxException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_InstagramLinkMouseClicked

    private void youtubeLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_youtubeLinkMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/channel/UCPlgmuuOFytZh7YeJKxGXtQ"));
        } catch (IOException | URISyntaxException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_youtubeLinkMouseClicked

    private void linkdinLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_linkdinLinkMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://in.linkedin.com/in/bhavin-bhesaniya-48b9a5172"));
        } catch (IOException | URISyntaxException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_linkdinLinkMouseClicked

    private void youtubeLinkMayurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_youtubeLinkMayurMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/c/GujjuCoding"));
        } catch (IOException | URISyntaxException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_youtubeLinkMayurMouseClicked

    private void InstagramLinkMayurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InstagramLinkMayurMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://www.instagram.com/gujju_coding/"));
        } catch (IOException | URISyntaxException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_InstagramLinkMayurMouseClicked

    private void GithubLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GithubLinkMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/Bhavin-Bhesaniya/"));
        } catch (IOException | URISyntaxException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_GithubLinkMouseClicked

    private void GithubLinkMayurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GithubLinkMayurMouseClicked
        try {
            Desktop.getDesktop().browse(new URI("https://github.com/Gujju-Coding/"));
        } catch (IOException | URISyntaxException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_GithubLinkMayurMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AboutUsLabel;
    private javax.swing.JPanel AboutUsPanel;
    private javax.swing.JPanel BodyAboutUs;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JLabel FollowBhavinLb;
    private javax.swing.JLabel FollowMayurLb;
    private javax.swing.JLabel GithubLink;
    private javax.swing.JLabel GithubLinkMayur;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel HomeLabel;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel InstagramLink;
    private javax.swing.JLabel InstagramLinkMayur;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JLabel LogoLabel;
    private javax.swing.JPanel MainBodyPanel;
    private javax.swing.JLabel MinimizeLabel;
    private javax.swing.JLabel ProjectIconTitle;
    private javax.swing.JPanel SignInPanel;
    private javax.swing.JPanel SignUpPanel;
    private javax.swing.JPanel StartPanel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel linkdinLink;
    private javax.swing.JLabel sinup;
    private javax.swing.JLabel youtubeLink;
    private javax.swing.JLabel youtubeLinkMayur;
    // End of variables declaration//GEN-END:variables

}
