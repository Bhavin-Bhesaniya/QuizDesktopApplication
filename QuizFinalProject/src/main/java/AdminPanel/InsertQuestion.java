package AdminPanel;

import Database.DatabaseConnection;
import java.awt.HeadlessException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InsertQuestion extends javax.swing.JFrame {
    public InsertQuestion() {
        initComponents();
        ImageIcon ap = new ImageIcon("src/main/java/img/exit.png");
        ExitLabel.setIcon(ap);
        ImageIcon ao = new ImageIcon("src/main/java/img/des.png");
        MinimizeLabel.setIcon(ao);
        
        //Set Question In The Label Using Count Method Which Count all question no and return in result set
        try {
            Connection con = DatabaseConnection.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select count(id) from quizquestion");
            if (rs.next()) {
                int id = rs.getInt(1);
                id = id + 1;
                String str = String.valueOf(id);
                QuestionIdLabel.setText(str);
            } else {
                QuestionIdLabel.setText("1");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NewQuestionField = new javax.swing.JTextField();
        Option1 = new javax.swing.JTextField();
        Option3 = new javax.swing.JTextField();
        Option2 = new javax.swing.JTextField();
        Option4 = new javax.swing.JTextField();
        RightAnswer = new javax.swing.JTextField();
        SelectLanguageLabel = new javax.swing.JLabel();
        OptaLabel = new javax.swing.JLabel();
        OptbLabel = new javax.swing.JLabel();
        OptcLabel = new javax.swing.JLabel();
        OptdLabel = new javax.swing.JLabel();
        AnswerLabel = new javax.swing.JLabel();
        FrameTitle = new javax.swing.JLabel();
        EnterQuestionLabel = new javax.swing.JLabel();
        QuestionNoLabel = new javax.swing.JLabel();
        QuestionIdLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ComboBox = new javax.swing.JComboBox<>();
        SubmitBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        MinimizeLabel = new javax.swing.JLabel();
        ExitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 130));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NewQuestionField.setBackground(new java.awt.Color(0, 102, 102));
        NewQuestionField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        NewQuestionField.setForeground(new java.awt.Color(255, 255, 255));
        NewQuestionField.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(NewQuestionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 152, 900, 53));

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

        RightAnswer.setBackground(new java.awt.Color(0, 102, 102));
        RightAnswer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        RightAnswer.setForeground(new java.awt.Color(255, 255, 255));
        RightAnswer.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel1.add(RightAnswer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 520, 43));

        SelectLanguageLabel.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        SelectLanguageLabel.setForeground(new java.awt.Color(255, 255, 255));
        SelectLanguageLabel.setText("Select Language");
        jPanel1.add(SelectLanguageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, -1, -1));

        OptaLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OptaLabel.setForeground(new java.awt.Color(255, 255, 255));
        OptaLabel.setText("A.");
        jPanel1.add(OptaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 25, -1));

        OptbLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OptbLabel.setForeground(new java.awt.Color(255, 255, 255));
        OptbLabel.setText("B.");
        jPanel1.add(OptbLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 21, -1));

        OptcLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OptcLabel.setForeground(new java.awt.Color(255, 255, 255));
        OptcLabel.setText("C.");
        jPanel1.add(OptcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 25, 20));

        OptdLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        OptdLabel.setForeground(new java.awt.Color(255, 255, 255));
        OptdLabel.setText("D.");
        jPanel1.add(OptdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 25, -1));

        AnswerLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        AnswerLabel.setForeground(new java.awt.Color(255, 255, 255));
        AnswerLabel.setText("Answer");
        jPanel1.add(AnswerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, 30));

        FrameTitle.setBackground(new java.awt.Color(255, 255, 255));
        FrameTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FrameTitle.setForeground(new java.awt.Color(255, 255, 255));
        FrameTitle.setText("Insert Question");
        jPanel1.add(FrameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 150, 37));

        EnterQuestionLabel.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        EnterQuestionLabel.setForeground(new java.awt.Color(255, 255, 255));
        EnterQuestionLabel.setText("Question");
        jPanel1.add(EnterQuestionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        QuestionNoLabel.setBackground(new java.awt.Color(0, 0, 0));
        QuestionNoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        QuestionNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuestionNoLabel.setText("Question No :-");
        jPanel1.add(QuestionNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 35));

        QuestionIdLabel.setBackground(new java.awt.Color(0, 0, 0));
        QuestionIdLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        QuestionIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuestionIdLabel.setText("1");
        jPanel1.add(QuestionIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 30, 50, 35));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 65, 171, 3));

        ComboBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ComboBox.setForeground(new java.awt.Color(0, 102, 102));
        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "C++", "Asp.net", "JavaScript", "Python", "Andriod", " " }));
        ComboBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 110, 132, 40));

        SubmitBtn.setBackground(new java.awt.Color(0, 102, 102));
        SubmitBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, 100, 40));

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
        jPanel1.add(MinimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 30, 30));

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
        jPanel1.add(ExitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 30, 30));

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

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        String question = NewQuestionField.getText();
        String opt1 = Option1.getText();
        String opt2 = Option2.getText();
        String opt3 = Option3.getText();
        String opt4 = Option4.getText();
        String answer = RightAnswer.getText();
        String lang = String.valueOf(ComboBox.getSelectedItem());

        try {
            Connection con = DatabaseConnection.getCon();
            PreparedStatement ps = con.prepareStatement("insert into quizquestion (question,opt1,opt2,opt3,opt4,answer,language) values ('" + question + "','" + opt1 + "','" + opt2 + "','" + opt3 + "','" + opt4 + "','" + answer + "','" + lang + "')");
            if ("".equals(question) | "".equals(opt1) | "".equals(opt2) | "".equals(opt3) | "".equals(opt4) | "".equals(answer)) {
                JOptionPane.showMessageDialog(null, "Please Enter All Details");
            } else {
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfully updated");
                dispose();
                new InsertQuestion().setVisible(true);
            }
        } catch (HeadlessException | SecurityException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        try {
            new AdminHome().setVisible(true);
            dispose();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, ex);
        }        
    }//GEN-LAST:event_BackBtnActionPerformed

    private void MinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseClicked
        setState(InsertQuestion.ICONIFIED);
    }//GEN-LAST:event_MinimizeLabelMouseClicked

    private void MinimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseEntered
        ImageIcon ap = new ImageIcon("src/main/java/img/des1.png");
        MinimizeLabel.setIcon(ap);
    }//GEN-LAST:event_MinimizeLabelMouseEntered

    private void MinimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseExited
        ImageIcon ap = new ImageIcon("src/main/java/img/des.png");
        MinimizeLabel.setIcon(ap);
    }//GEN-LAST:event_MinimizeLabelMouseExited

    private void ExitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to quit", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_ExitLabelMouseClicked

    private void ExitLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseEntered
        ImageIcon exit1 = new ImageIcon("src/main/java/img/exit1.png");
        ExitLabel.setIcon(exit1);
    }//GEN-LAST:event_ExitLabelMouseEntered

    private void ExitLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitLabelMouseExited
        ImageIcon exit2 = new ImageIcon("src/main/java/img/exit.png");
        ExitLabel.setIcon(exit2);
    }//GEN-LAST:event_ExitLabelMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AnswerLabel;
    private javax.swing.JButton BackBtn;
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JLabel EnterQuestionLabel;
    private javax.swing.JLabel ExitLabel;
    private javax.swing.JLabel FrameTitle;
    private javax.swing.JLabel MinimizeLabel;
    private javax.swing.JTextField NewQuestionField;
    private javax.swing.JLabel OptaLabel;
    private javax.swing.JLabel OptbLabel;
    private javax.swing.JLabel OptcLabel;
    private javax.swing.JLabel OptdLabel;
    private javax.swing.JTextField Option1;
    private javax.swing.JTextField Option2;
    private javax.swing.JTextField Option3;
    private javax.swing.JTextField Option4;
    private javax.swing.JLabel QuestionIdLabel;
    private javax.swing.JLabel QuestionNoLabel;
    private javax.swing.JTextField RightAnswer;
    private javax.swing.JLabel SelectLanguageLabel;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
