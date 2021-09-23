package AdminPanel;

import Database.DatabaseConnection;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UpdateDeleteQuestion extends javax.swing.JFrame {

    public UpdateDeleteQuestion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NewQuestion = new javax.swing.JTextField();
        Option1 = new javax.swing.JTextField();
        Option3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Option2 = new javax.swing.JTextField();
        Option4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        RightAnswer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UpdateBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        SearchBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 130));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewQuestion.setBackground(new java.awt.Color(0, 102, 102));
        NewQuestion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NewQuestion.setForeground(new java.awt.Color(255, 255, 255));
        NewQuestion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(NewQuestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 152, 900, 53));

        Option1.setBackground(new java.awt.Color(0, 102, 102));
        Option1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Option1.setForeground(new java.awt.Color(255, 255, 255));
        Option1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(Option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 267, 370, 40));

        Option3.setBackground(new java.awt.Color(0, 102, 102));
        Option3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Option3.setForeground(new java.awt.Color(255, 255, 255));
        Option3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(Option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 341, 370, 42));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("A.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 25, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("B.");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 21, -1));

        Option2.setBackground(new java.awt.Color(0, 102, 102));
        Option2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Option2.setForeground(new java.awt.Color(255, 255, 255));
        Option2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(Option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, 370, 40));

        Option4.setBackground(new java.awt.Color(0, 102, 102));
        Option4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Option4.setForeground(new java.awt.Color(255, 255, 255));
        Option4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(Option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(611, 341, 370, 42));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("C.");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 25, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("D.");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 25, -1));

        RightAnswer.setBackground(new java.awt.Color(0, 102, 102));
        RightAnswer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RightAnswer.setForeground(new java.awt.Color(255, 255, 255));
        RightAnswer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(RightAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 520, 43));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answer");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, 30));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Update/Delete  Question");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 250, 37));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jSeparator1.setPreferredSize(new java.awt.Dimension(5, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 65, 171, 3));

        UpdateBtn.setBackground(new java.awt.Color(0, 102, 102));
        UpdateBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBtn.setText("Update");
        UpdateBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        jPanel1.add(UpdateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 100, 40));

        BackBtn.setBackground(new java.awt.Color(0, 102, 102));
        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back");
        BackBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 100, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Enter Question No :-");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        SearchField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(SearchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 60, 40));

        SearchBtn.setBackground(new java.awt.Color(0, 102, 102));
        SearchBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SearchBtn.setForeground(new java.awt.Color(255, 255, 255));
        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 110, 110, 40));

        DeleteBtn.setBackground(new java.awt.Color(0, 102, 102));
        DeleteBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBtn.setText("Delete");
        DeleteBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DeleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 530, 100, 40));

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

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        String id = SearchField.getText();
        String question = NewQuestion.getText();
        String opt1 = Option1.getText();
        String opt2 = Option2.getText();
        String opt3 = Option3.getText();
        String opt4 = Option4.getText();
        String answer = RightAnswer.getText();
        try {
            Connection con = DatabaseConnection.getCon();
            PreparedStatement pst = con.prepareStatement("update quizquestion set question=?,opt1=?,opt2=?,opt3=?,opt4=?,answer=? where id=?");
            pst.setString(1, question);
            pst.setString(2, opt1);
            pst.setString(3, opt2);
            pst.setString(4, opt3);
            pst.setString(5, opt4);
            pst.setString(6, answer);
            pst.setString(7, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully updated");
            dispose();
            new UpdateDeleteQuestion().setVisible(true);

        } catch (HeadlessException | SecurityException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        try {
            new AdminHome().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateDeleteQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        String id = SearchField.getText();
        try {
            Connection con = DatabaseConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from quizquestion where id = '" + id + "'");
            if (rs.next()) {
                NewQuestion.setText(rs.getString(2));
                Option1.setText(rs.getString(3));
                Option2.setText(rs.getString(4));
                Option3.setText(rs.getString(5));
                Option4.setText(rs.getString(6));
                RightAnswer.setText(rs.getString(7));
                SearchField.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(null, "Question id not exist");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SearchBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        String id = SearchField.getText();
        try {
            Connection con = DatabaseConnection.getCon();
            PreparedStatement pst = con.prepareStatement("delete from quizquestion where id = ?");
            pst.setString(1, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successfully Deleted");
            dispose();
            new UpdateDeleteQuestion().setVisible(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateDeleteQuestion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField NewQuestion;
    private javax.swing.JTextField Option1;
    private javax.swing.JTextField Option2;
    private javax.swing.JTextField Option3;
    private javax.swing.JTextField Option4;
    private javax.swing.JTextField RightAnswer;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
