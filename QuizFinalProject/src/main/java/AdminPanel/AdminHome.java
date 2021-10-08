package AdminPanel;

import UserPack.LoginPage;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class AdminHome extends javax.swing.JFrame {

    public AdminHome() throws ClassNotFoundException {
        initComponents();
        ImageIcon ap = new ImageIcon("src/main/java/img/CloseWhiteImg.png");
        ExitLabel.setIcon(ap);
        ImageIcon ao = new ImageIcon("src/main/java/img/MinimizeWhiteImg.png");
        MinimizeLabel.setIcon(ao);
        ImageIcon a = new ImageIcon("src/main/java/img/youtube.png");
        BodyPanelLabel.setIcon(a);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        AdminPanelLabel = new javax.swing.JLabel();
        AllUserPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        AllQuestionPanel = new javax.swing.JPanel();
        AllQuestionLabel = new javax.swing.JLabel();
        InsertQuestionPanel = new javax.swing.JPanel();
        sinup = new javax.swing.JLabel();
        UpdateDeleteQuestionPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AllResultPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ExitLabel = new javax.swing.JLabel();
        MinimizeLabel = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        BodyPanelLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(180, 120));
        setMaximumSize(new java.awt.Dimension(1090, 530));
        setMinimumSize(new java.awt.Dimension(1080, 530));
        setName("AdminFrame"); // NOI18N
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(74, 31, 61));
        HeaderPanel.setMaximumSize(new java.awt.Dimension(1080, 80));
        HeaderPanel.setMinimumSize(new java.awt.Dimension(1080, 80));
        HeaderPanel.setName(""); // NOI18N
        HeaderPanel.setPreferredSize(new java.awt.Dimension(1080, 80));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AdminPanelLabel.setFont(new java.awt.Font("Calisto MT", 1, 24)); // NOI18N
        AdminPanelLabel.setForeground(new java.awt.Color(255, 255, 255));
        AdminPanelLabel.setText("Admin Panel");
        HeaderPanel.add(AdminPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, 64));

        AllUserPanel.setBackground(new java.awt.Color(74, 31, 61));
        AllUserPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllUserPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AllUserPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AllUserPanelMouseExited(evt);
            }
        });
        AllUserPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("All User");
        AllUserPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 60, 20));

        HeaderPanel.add(AllUserPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 60, 70));

        AllQuestionPanel.setBackground(new java.awt.Color(74, 31, 61));
        AllQuestionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllQuestionPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AllQuestionPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AllQuestionPanelMouseExited(evt);
            }
        });
        AllQuestionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AllQuestionLabel.setBackground(new java.awt.Color(74, 31, 61));
        AllQuestionLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        AllQuestionLabel.setForeground(new java.awt.Color(255, 255, 255));
        AllQuestionLabel.setText("All Question");
        AllQuestionPanel.add(AllQuestionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 90, 20));

        HeaderPanel.add(AllQuestionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 90, 70));

        InsertQuestionPanel.setBackground(new java.awt.Color(74, 31, 61));
        InsertQuestionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertQuestionPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                InsertQuestionPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                InsertQuestionPanelMouseExited(evt);
            }
        });
        InsertQuestionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sinup.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sinup.setForeground(new java.awt.Color(255, 255, 255));
        sinup.setText("Insert Question");
        InsertQuestionPanel.add(sinup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 29, 110, 20));

        HeaderPanel.add(InsertQuestionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, 70));

        UpdateDeleteQuestionPanel.setBackground(new java.awt.Color(74, 31, 61));
        UpdateDeleteQuestionPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateDeleteQuestionPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateDeleteQuestionPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateDeleteQuestionPanelMouseExited(evt);
            }
        });
        UpdateDeleteQuestionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Update/Delete Question");
        UpdateDeleteQuestionPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 160, -1));

        HeaderPanel.add(UpdateDeleteQuestionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 160, 70));

        AllResultPanel.setBackground(new java.awt.Color(74, 31, 61));
        AllResultPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AllResultPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AllResultPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AllResultPanelMouseExited(evt);
            }
        });
        AllResultPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User Result");
        AllResultPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 20));

        HeaderPanel.add(AllResultPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 80, 70));

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
        HeaderPanel.add(ExitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 20, 30, 30));

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
        HeaderPanel.add(MinimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 20, 30, 30));

        Logout.setBackground(new java.awt.Color(74, 31, 61));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogoutMouseExited(evt);
            }
        });
        Logout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Logout");
        Logout.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 20));

        HeaderPanel.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 70, 60));

        getContentPane().add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 100));

        BodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BodyPanel.add(BodyPanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 540, 290));

        getContentPane().add(BodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1080, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AllUserPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllUserPanelMouseEntered
        AllUserPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
    }//GEN-LAST:event_AllUserPanelMouseEntered

    private void AllUserPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllUserPanelMouseExited
        AllUserPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
    }//GEN-LAST:event_AllUserPanelMouseExited

    private void AllQuestionPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllQuestionPanelMouseEntered
        AllQuestionPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
    }//GEN-LAST:event_AllQuestionPanelMouseEntered

    private void AllQuestionPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllQuestionPanelMouseExited
        AllQuestionPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
    }//GEN-LAST:event_AllQuestionPanelMouseExited

    private void InsertQuestionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertQuestionPanelMouseClicked
        new InsertQuestion().setVisible(true);
        dispose();
    }//GEN-LAST:event_InsertQuestionPanelMouseClicked

    private void InsertQuestionPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertQuestionPanelMouseEntered
        InsertQuestionPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
    }//GEN-LAST:event_InsertQuestionPanelMouseEntered

    private void InsertQuestionPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertQuestionPanelMouseExited
        InsertQuestionPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
    }//GEN-LAST:event_InsertQuestionPanelMouseExited

    private void UpdateDeleteQuestionPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateDeleteQuestionPanelMouseExited
        UpdateDeleteQuestionPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
    }//GEN-LAST:event_UpdateDeleteQuestionPanelMouseExited

    private void UpdateDeleteQuestionPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateDeleteQuestionPanelMouseEntered
        UpdateDeleteQuestionPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
    }//GEN-LAST:event_UpdateDeleteQuestionPanelMouseEntered

    private void UpdateDeleteQuestionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateDeleteQuestionPanelMouseClicked
        new UpdateDeleteQuestion().setVisible(true);
        dispose();
    }//GEN-LAST:event_UpdateDeleteQuestionPanelMouseClicked

    private void AllResultPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllResultPanelMouseEntered
        AllResultPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
    }//GEN-LAST:event_AllResultPanelMouseEntered

    private void AllResultPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllResultPanelMouseExited
        AllResultPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
    }//GEN-LAST:event_AllResultPanelMouseExited

    private void AllResultPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllResultPanelMouseClicked
        new AllUserResult().setVisible(true);
        dispose();
    }//GEN-LAST:event_AllResultPanelMouseClicked

    private void AllQuestionPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllQuestionPanelMouseClicked
        new AllQuestion().setVisible(true);
        dispose();
    }//GEN-LAST:event_AllQuestionPanelMouseClicked

    private void AllUserPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AllUserPanelMouseClicked
        new AllUser().setVisible(true);
        dispose();
    }//GEN-LAST:event_AllUserPanelMouseClicked

    private void MinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseClicked
        setState(AdminHome.ICONIFIED);
    }//GEN-LAST:event_MinimizeLabelMouseClicked

    private void MinimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseEntered
        ImageIcon ap = new ImageIcon("src/main/java/img/MinimizeBlackImg.png");
        MinimizeLabel.setIcon(ap);
    }//GEN-LAST:event_MinimizeLabelMouseEntered

    private void MinimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseExited
        ImageIcon ap = new ImageIcon("src/main/java/img/MinimizeWhiteImg.png");
        MinimizeLabel.setIcon(ap);
    }//GEN-LAST:event_MinimizeLabelMouseExited

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

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        new LoginPage().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogoutMouseClicked

    private void LogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseEntered
        Logout.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, Color.red));
    }//GEN-LAST:event_LogoutMouseEntered

    private void LogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseExited
        Logout.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.red));
    }//GEN-LAST:event_LogoutMouseExited
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdminHome obj = new AdminHome();
                    obj.setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdminHome.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminPanelLabel;
    private javax.swing.JLabel AllQuestionLabel;
    private javax.swing.JPanel AllQuestionPanel;
    private javax.swing.JPanel AllResultPanel;
    private javax.swing.JPanel AllUserPanel;
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JLabel BodyPanelLabel;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JPanel InsertQuestionPanel;
    private javax.swing.JPanel Logout;
    private javax.swing.JLabel MinimizeLabel;
    private javax.swing.JPanel UpdateDeleteQuestionPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel sinup;
    // End of variables declaration//GEN-END:variables
}
