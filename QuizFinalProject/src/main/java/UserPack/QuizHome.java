package UserPack;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class QuizHome extends javax.swing.JFrame {

    static int userId;

    public QuizHome(int userid) {
        userId = userid;
        initComponents();
        ImageIcon p = new ImageIcon("src/main/java/img/ProjectLogo.png");
        TitleIcon.setIcon(p);   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        TitleIcon = new javax.swing.JLabel();
        ProfileBtn = new javax.swing.JButton();
        LogoutBtn = new javax.swing.JButton();
        CloseBtn = new javax.swing.JButton();
        BodyPanel = new javax.swing.JPanel();
        JavaScriptPanel = new javax.swing.JPanel();
        JavascriptBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JavaPanel = new javax.swing.JPanel();
        JavaBtn = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        CplusPanel = new javax.swing.JPanel();
        CplusBtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        PythonPanel = new javax.swing.JPanel();
        PythonBtn = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        AspnetPanel = new javax.swing.JPanel();
        AspnetBtn = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        AndroidPanel = new javax.swing.JPanel();
        AndroidBtn = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(0, 102, 102));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 2, 3, new java.awt.Color(0, 0, 0)));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setText("Fun With Learn");
        HeaderPanel.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 20, 180, 52));
        HeaderPanel.add(TitleIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 20, 44, 52));

        ProfileBtn.setBackground(new java.awt.Color(0, 102, 102));
        ProfileBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        ProfileBtn.setText("Profile");
        ProfileBtn.setToolTipText("");
        ProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProfileBtnActionPerformed(evt);
            }
        });
        HeaderPanel.add(ProfileBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 30, -1, -1));

        LogoutBtn.setBackground(new java.awt.Color(0, 102, 102));
        LogoutBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        LogoutBtn.setText("Logout");
        LogoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutBtnActionPerformed(evt);
            }
        });
        HeaderPanel.add(LogoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 100, 30));

        CloseBtn.setBackground(new java.awt.Color(0, 102, 102));
        CloseBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CloseBtn.setForeground(new java.awt.Color(255, 255, 255));
        CloseBtn.setText("Close");
        CloseBtn.setToolTipText("");
        CloseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseBtnActionPerformed(evt);
            }
        });
        HeaderPanel.add(CloseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 30, -1, -1));

        getContentPane().add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 91));

        BodyPanel.setBackground(new java.awt.Color(0, 102, 102));
        BodyPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        BodyPanel.setMinimumSize(new java.awt.Dimension(936, 500));
        BodyPanel.setPreferredSize(new java.awt.Dimension(990, 426));
        BodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JavaScriptPanel.setBackground(new java.awt.Color(51, 0, 51));
        JavaScriptPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));
        JavaScriptPanel.setToolTipText("");
        JavaScriptPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JavascriptBtn.setBackground(new java.awt.Color(0, 102, 102));
        JavascriptBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JavascriptBtn.setForeground(new java.awt.Color(255, 255, 255));
        JavascriptBtn.setText("JavaScript");
        JavascriptBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        JavascriptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavascriptBtnActionPerformed(evt);
            }
        });
        JavaScriptPanel.add(JavascriptBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 120, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Start Here      :-");
        JavaScriptPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Title               :-");
        JavaScriptPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Developed By :-");
        JavaScriptPanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("JavaScript Programming Language");
        JavaScriptPanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Brendan Eich");
        JavaScriptPanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        BodyPanel.add(JavaScriptPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 480, 140));

        JavaPanel.setBackground(new java.awt.Color(51, 0, 51));
        JavaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));
        JavaPanel.setToolTipText("This is Java Programming Language\n");
        JavaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JavaBtn.setBackground(new java.awt.Color(0, 102, 102));
        JavaBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JavaBtn.setForeground(new java.awt.Color(255, 255, 255));
        JavaBtn.setText("Java");
        JavaBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        JavaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaBtnActionPerformed(evt);
            }
        });
        JavaPanel.add(JavaBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 120, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Start Here      :-");
        JavaPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Title               :-");
        JavaPanel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Developed By :-");
        JavaPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Java Programming Language");
        JavaPanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("James Goshling");
        JavaPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        BodyPanel.add(JavaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 480, 140));

        CplusPanel.setBackground(new java.awt.Color(51, 0, 51));
        CplusPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));
        CplusPanel.setToolTipText("");
        CplusPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CplusBtn.setBackground(new java.awt.Color(0, 102, 102));
        CplusBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CplusBtn.setForeground(new java.awt.Color(255, 255, 255));
        CplusBtn.setText("C++");
        CplusBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        CplusBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CplusBtnActionPerformed(evt);
            }
        });
        CplusPanel.add(CplusBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 120, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Start Here      :-");
        CplusPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Title               :-");
        CplusPanel.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Developed By :-");
        CplusPanel.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("C++ Programming Language");
        CplusPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Bjarne Stroustrup");
        CplusPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        BodyPanel.add(CplusPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 480, 140));

        PythonPanel.setBackground(new java.awt.Color(51, 0, 51));
        PythonPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));
        PythonPanel.setToolTipText("");
        PythonPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PythonBtn.setBackground(new java.awt.Color(0, 102, 102));
        PythonBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PythonBtn.setForeground(new java.awt.Color(255, 255, 255));
        PythonBtn.setText("Python");
        PythonBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        PythonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PythonBtnActionPerformed(evt);
            }
        });
        PythonPanel.add(PythonBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 130, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Start Here      :-");
        PythonPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Title               :-");
        PythonPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Developed By :-");
        PythonPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Python Programming Language");
        PythonPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Guido van Rossum");
        PythonPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        BodyPanel.add(PythonPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 480, 140));

        AspnetPanel.setBackground(new java.awt.Color(51, 0, 51));
        AspnetPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));
        AspnetPanel.setToolTipText("");
        AspnetPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AspnetBtn.setBackground(new java.awt.Color(0, 102, 102));
        AspnetBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AspnetBtn.setForeground(new java.awt.Color(255, 255, 255));
        AspnetBtn.setText("Asp.net");
        AspnetBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        AspnetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AspnetBtnActionPerformed(evt);
            }
        });
        AspnetPanel.add(AspnetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 130, 30));

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Start Here      :-");
        AspnetPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Title               :-");
        AspnetPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Developed By :-");
        AspnetPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Asp.net Programming Language");
        AspnetPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Microsoft Corporation");
        AspnetPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        BodyPanel.add(AspnetPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 480, 140));

        AndroidPanel.setBackground(new java.awt.Color(51, 0, 51));
        AndroidPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 51), 5, true));
        AndroidPanel.setToolTipText("");
        AndroidPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AndroidBtn.setBackground(new java.awt.Color(0, 102, 102));
        AndroidBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        AndroidBtn.setForeground(new java.awt.Color(255, 255, 255));
        AndroidBtn.setText("Andriod");
        AndroidBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        AndroidBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AndroidBtnActionPerformed(evt);
            }
        });
        AndroidPanel.add(AndroidBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, 30));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Start Here      :-");
        AndroidPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 20));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Title               :-");
        AndroidPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Developed By :-");
        AndroidPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Android Operating Systeem");
        AndroidPanel.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Google");
        AndroidPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        BodyPanel.add(AndroidPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, 480, 140));

        getContentPane().add(BodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1060, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProfileBtnActionPerformed
        new UserProfile(userId).setVisible(true);
        dispose();
    }//GEN-LAST:event_ProfileBtnActionPerformed

    private void JavascriptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavascriptBtnActionPerformed
        new ExamPage(JavascriptBtn.getText(), userId).setVisible(true);
        dispose();
    }//GEN-LAST:event_JavascriptBtnActionPerformed

    private void LogoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutBtnActionPerformed
        new LoginPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutBtnActionPerformed

    private void JavaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaBtnActionPerformed
        new ExamPage(JavaBtn.getText(), userId).setVisible(true);
        dispose();
    }//GEN-LAST:event_JavaBtnActionPerformed

    private void CplusBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CplusBtnActionPerformed
        new ExamPage(CplusBtn.getText(), userId).setVisible(true);
        dispose();
    }//GEN-LAST:event_CplusBtnActionPerformed

    private void PythonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PythonBtnActionPerformed
        new ExamPage(PythonBtn.getText(), userId).setVisible(true);
        dispose();
    }//GEN-LAST:event_PythonBtnActionPerformed

    private void AspnetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AspnetBtnActionPerformed
        new ExamPage(AspnetBtn.getText(), userId).setVisible(true);
        dispose();
    }//GEN-LAST:event_AspnetBtnActionPerformed

    private void AndroidBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AndroidBtnActionPerformed
        new ExamPage(AndroidBtn.getText(), userId).setVisible(true);
        dispose();
    }//GEN-LAST:event_AndroidBtnActionPerformed

    private void CloseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to quit", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            int b = JOptionPane.showConfirmDialog(null, "Leave Us A Review", "Select", JOptionPane.YES_NO_OPTION);
            {
                if (b == 0) {
                    new FeedBackForm(userId).setVisible(true);
                } else {
                    System.exit(0);
                }
            }
        } else {
            System.exit(0);
        }
    }//GEN-LAST:event_CloseBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuizHome(userId).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AndroidBtn;
    private javax.swing.JPanel AndroidPanel;
    private javax.swing.JButton AspnetBtn;
    private javax.swing.JPanel AspnetPanel;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JButton CloseBtn;
    private javax.swing.JButton CplusBtn;
    private javax.swing.JPanel CplusPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JButton JavaBtn;
    private javax.swing.JPanel JavaPanel;
    private javax.swing.JPanel JavaScriptPanel;
    private javax.swing.JButton JavascriptBtn;
    private javax.swing.JButton LogoutBtn;
    private javax.swing.JButton ProfileBtn;
    private javax.swing.JButton PythonBtn;
    private javax.swing.JPanel PythonPanel;
    private javax.swing.JLabel TitleIcon;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
