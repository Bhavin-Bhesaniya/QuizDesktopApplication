package UserPack;

import Database.DatabaseConnection;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class UserProfile extends javax.swing.JFrame {

    static int uId;

    public UserProfile(int userId) {
        initComponents();
        
        uId = userId;
        try {
            Connection con = DatabaseConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from register where id = '" + uId + "' ");
            if (rs.next()) {
                IdField.setText(rs.getString(1));
                NameField.setText(rs.getString(2));
                EmailField.setText(rs.getString(3));
                passField.setText(rs.getString(4));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        //working for attempted quiz

//        try {
//            Connection con = DatabaseConnection.getCon();
//            Statement st = con.createStatement();
//            ResultSet rst = st.executeQuery("select * from quizmarks where user_id = '" + userId + "' ");
//            counter = String.valueOf(rst.getInt("user_id"));
//            AttemptQuiz.setText(counter);
//        } catch (SQLException e) {
//            JOptionPane.showConfirmDialog(null, e);
//        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProfilePanel = new javax.swing.JPanel();
        IdField = new javax.swing.JTextField();
        NameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        passField = new javax.swing.JTextField();
        NameLb = new javax.swing.JLabel();
        EmailLb = new javax.swing.JLabel();
        IdLb = new javax.swing.JLabel();
        DelProfileLb = new javax.swing.JLabel();
        PassWordLb = new javax.swing.JLabel();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        TitleLb = new javax.swing.JLabel();
        UpProfileLb = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        ErrorShow = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        setLocation(new java.awt.Point(380, 150));
        setMinimumSize(new java.awt.Dimension(701, 400));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProfilePanel.setBackground(new java.awt.Color(0, 102, 102));
        ProfilePanel.setMaximumSize(new java.awt.Dimension(701, 430));
        ProfilePanel.setMinimumSize(new java.awt.Dimension(701, 400));
        ProfilePanel.setName(""); // NOI18N
        ProfilePanel.setPreferredSize(new java.awt.Dimension(700, 430));
        ProfilePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IdField.setEditable(false);
        IdField.setBackground(new java.awt.Color(0, 102, 102));
        IdField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IdField.setForeground(new java.awt.Color(255, 255, 255));
        IdField.setToolTipText("Id Can't Update");
        IdField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        IdField.setMinimumSize(new java.awt.Dimension(7, 32));
        ProfilePanel.add(IdField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 250, -1));

        NameField.setBackground(new java.awt.Color(0, 102, 102));
        NameField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameField.setForeground(new java.awt.Color(255, 255, 255));
        NameField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        NameField.setMinimumSize(new java.awt.Dimension(7, 32));
        NameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NameFieldKeyReleased(evt);
            }
        });
        ProfilePanel.add(NameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 143, 300, 30));

        EmailField.setEditable(false);
        EmailField.setBackground(new java.awt.Color(0, 102, 102));
        EmailField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EmailField.setForeground(new java.awt.Color(255, 255, 255));
        EmailField.setToolTipText("Email Can't Update");
        EmailField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        EmailField.setMinimumSize(new java.awt.Dimension(7, 32));
        ProfilePanel.add(EmailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 300, 30));

        passField.setBackground(new java.awt.Color(0, 102, 102));
        passField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        passField.setForeground(new java.awt.Color(255, 255, 255));
        passField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        passField.setMinimumSize(new java.awt.Dimension(7, 32));
        passField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passFieldKeyReleased(evt);
            }
        });
        ProfilePanel.add(passField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 300, -1));

        NameLb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        NameLb.setForeground(new java.awt.Color(255, 255, 255));
        NameLb.setText("Name       :-");
        ProfilePanel.add(NameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 120, 19));

        EmailLb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EmailLb.setForeground(new java.awt.Color(255, 255, 255));
        EmailLb.setText("Email        :-");
        ProfilePanel.add(EmailLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 110, 30));

        IdLb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IdLb.setForeground(new java.awt.Color(255, 255, 255));
        IdLb.setText("Id             :-");
        ProfilePanel.add(IdLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, 19));

        DelProfileLb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DelProfileLb.setForeground(new java.awt.Color(255, 255, 255));
        DelProfileLb.setText("Delete  Profile :-");
        ProfilePanel.add(DelProfileLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 160, 30));

        PassWordLb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PassWordLb.setForeground(new java.awt.Color(255, 255, 255));
        PassWordLb.setText("Password  :-");
        ProfilePanel.add(PassWordLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 120, 30));

        UpdateBtn.setBackground(new java.awt.Color(0, 102, 102));
        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        ProfilePanel.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, -1, 30));

        DeleteBtn.setBackground(new java.awt.Color(0, 102, 102));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        ProfilePanel.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 100, 30));

        TitleLb.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        TitleLb.setForeground(new java.awt.Color(255, 255, 255));
        TitleLb.setText("User Profile");
        ProfilePanel.add(TitleLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        UpProfileLb.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpProfileLb.setForeground(new java.awt.Color(255, 255, 255));
        UpProfileLb.setText("Update Profile :-");
        ProfilePanel.add(UpProfileLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 160, 30));

        BackBtn.setBackground(new java.awt.Color(0, 102, 102));
        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back To Quiz");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        ProfilePanel.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        ErrorShow.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ErrorShow.setForeground(new java.awt.Color(255, 0, 0));
        ProfilePanel.add(ErrorShow, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 210, 30));

        getContentPane().add(ProfilePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        String id = IdField.getText();
        try {
            Connection con = DatabaseConnection.getCon();
            PreparedStatement pst = con.prepareStatement("delete  from register where id = '" + id + "'");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            dispose();
            new RegistrationPage().setVisible(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        String id = IdField.getText();
        String name = NameField.getText();
        String email = EmailField.getText();
        String passwd = passField.getText();
        try {
            Connection con = DatabaseConnection.getCon();
            PreparedStatement pst = con.prepareStatement("update register set name=?,email=?,pass=? where id=?");
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, passwd);
            pst.setString(4, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully updated");
            dispose();
            new UserProfile(uId).setVisible(true);

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        new QuizHome(uId).setVisible(true);
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void passFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passFieldKeyReleased
        String PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(passField.getText());
        if (!match.matches()) {
            ErrorShow.setText("Not Fulfill Password Condition");
            UpdateBtn.setEnabled(false);
        } else {
            ErrorShow.setText(null);
            UpdateBtn.setEnabled(true);
        }

    }//GEN-LAST:event_passFieldKeyReleased

    private void NameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameFieldKeyReleased
        String PATTERN = "^[a-zA-Z]{0,30}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(NameField.getText());
        if (!match.matches()) {
            ErrorShow.setText("Name format incorrect");
            UpdateBtn.setEnabled(false);
        } else {
            ErrorShow.setText(null);            
            UpdateBtn.setEnabled(true);
        }
    }//GEN-LAST:event_NameFieldKeyReleased

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserProfile(uId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel DelProfileLb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLb;
    private javax.swing.JLabel ErrorShow;
    private javax.swing.JTextField IdField;
    private javax.swing.JLabel IdLb;
    private javax.swing.JTextField NameField;
    private javax.swing.JLabel NameLb;
    private javax.swing.JLabel PassWordLb;
    private javax.swing.JPanel ProfilePanel;
    private javax.swing.JLabel TitleLb;
    private javax.swing.JLabel UpProfileLb;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JTextField passField;
    // End of variables declaration//GEN-END:variables
}
