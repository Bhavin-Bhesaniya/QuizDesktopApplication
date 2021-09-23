package UserPack;

import Database.DatabaseConnection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ExamPage extends javax.swing.JFrame {

    public int questionId = 0;
    public String answer;
    public int min = 0, sec = 0, marks = 0;
    static String selectedLanguage;
    int counter = 0;
    static int userId;

    public void answerCheck() {
        String studentAnswer;
        if (Opt1RadioBtn.isSelected()) {
            studentAnswer = Opt1RadioBtn.getText();
        } else if (Opt2RadioBtn.isSelected()) {
            studentAnswer = Opt2RadioBtn.getText();
        } else if (Opt3RadioBtn.isSelected()) {
            studentAnswer = Opt3RadioBtn.getText();
        } else {
            studentAnswer = Opt4RadioBtn.getText();
        }

        //Checking Marks
        if (studentAnswer.equals(answer)) {
            marks = marks + 1;
        }

        //clear jradio button
        Opt1RadioBtn.setSelected(false);
        Opt2RadioBtn.setSelected(false);
        Opt3RadioBtn.setSelected(false);
        Opt4RadioBtn.setSelected(false);

        //lastquestion hide button show Submit button
        if (counter == 9) {
            NextQuestionBtn.setVisible(false);
            SubmitBtn.setVisible(true);
        }
    }

    public void question() {
        try {
            Connection con = DatabaseConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rsl = st.executeQuery("select * from quizquestion where id > " + questionId + " AND language = '" + selectedLanguage + "' LIMIT 1");
            while (rsl.next()) {
                counter++;
                questionId = Integer.parseInt(rsl.getString(1));
                QuestionNoUpdate.setText(String.valueOf(counter));
                QuestionLabel.setText(rsl.getString(2));
                Opt1RadioBtn.setText(rsl.getString(3));
                Opt2RadioBtn.setText(rsl.getString(4));
                Opt3RadioBtn.setText(rsl.getString(5));
                Opt4RadioBtn.setText(rsl.getString(6));
                answer = rsl.getString(7);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void submit() {
        answerCheck();
        try {

            Connection con = DatabaseConnection.getCon();
            PreparedStatement pst = con.prepareStatement("insert into quizmarks (user_id,marks,language) values(" + userId + "," + marks + ",'" + selectedLanguage + "')");
            pst.executeUpdate();
            String marks1 = String.valueOf(marks);
            JOptionPane.showMessageDialog(null, "Your Total Marks Is : " + marks1, "Select", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            new QuizHome(userId).setVisible(true);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    Timer time;

    public ExamPage(String language, int uid) {
        initComponents();
        Opt1RadioBtn.setSelected(false);
        Opt2RadioBtn.setSelected(false);
        Opt3RadioBtn.setSelected(false);
        Opt4RadioBtn.setSelected(false);
        ImageIcon exitlogp = new ImageIcon("src/main/java/img/exit3.png");
        LabelExit.setIcon(exitlogp);
        ImageIcon minip = new ImageIcon("src/main/java/img/des.png");
        MinimizeLabel.setIcon(minip);
        selectedLanguage = language;
        QuizTitle.setText(selectedLanguage);
        userId = uid;
        SubmitBtn.setVisible(false);

        question();
        
        //timerprogramm
        setLocationRelativeTo(this);
        time = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecondLabel.setText(String.valueOf(sec));
                MinuteLabel.setText(String.valueOf(min));
                if (sec == 60) {
                    sec = 0;
                    min++;
                    if (min == 10) {
                        time.stop();
                        answerCheck();
                        submit();
                    }
                }
                sec++;
            }
        });
        time.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        TotalTimeLabel = new javax.swing.JLabel();
        TotalLabelTime = new javax.swing.JLabel();
        TimeTakenLabel = new javax.swing.JLabel();
        MinuteLabel = new javax.swing.JLabel();
        SecondLabel = new javax.swing.JLabel();
        QuizTitle = new javax.swing.JLabel();
        TotalQuestionLabel = new javax.swing.JLabel();
        TotalQuestionNoLabel = new javax.swing.JLabel();
        QuestionNoLabel = new javax.swing.JLabel();
        QuestionNoUpdate = new javax.swing.JLabel();
        MinimizeLabel = new javax.swing.JLabel();
        LabelExit = new javax.swing.JLabel();
        BodyPanel = new javax.swing.JPanel();
        QuestionLabel = new javax.swing.JLabel();
        Opt1RadioBtn = new javax.swing.JRadioButton();
        Opt2RadioBtn = new javax.swing.JRadioButton();
        Opt3RadioBtn = new javax.swing.JRadioButton();
        Opt4RadioBtn = new javax.swing.JRadioButton();
        NextQuestionBtn = new javax.swing.JButton();
        SubmitBtn = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 120));
        setMinimumSize(new java.awt.Dimension(1129, 600));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(0, 102, 102));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TotalTimeLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TotalTimeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalTimeLabel.setText("Total Time :-");
        HeaderPanel.add(TotalTimeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, -1));

        TotalLabelTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TotalLabelTime.setForeground(new java.awt.Color(255, 255, 255));
        TotalLabelTime.setText("10 Min");
        HeaderPanel.add(TotalLabelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 70, -1));

        TimeTakenLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TimeTakenLabel.setForeground(new java.awt.Color(255, 255, 255));
        TimeTakenLabel.setText("Time Taken :-");
        HeaderPanel.add(TimeTakenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 70, -1, -1));

        MinuteLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        MinuteLabel.setForeground(new java.awt.Color(255, 255, 255));
        MinuteLabel.setText("00 :");
        HeaderPanel.add(MinuteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, -1, -1));

        SecondLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        SecondLabel.setForeground(new java.awt.Color(255, 255, 255));
        SecondLabel.setText("00");
        HeaderPanel.add(SecondLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 70, 31, -1));

        QuizTitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        QuizTitle.setForeground(new java.awt.Color(255, 255, 255));
        QuizTitle.setText("Quiz ");
        HeaderPanel.add(QuizTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 320, 68));

        TotalQuestionLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TotalQuestionLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalQuestionLabel.setText("Total Question :-");
        HeaderPanel.add(TotalQuestionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 180, -1));

        TotalQuestionNoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TotalQuestionNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        TotalQuestionNoLabel.setText("10");
        HeaderPanel.add(TotalQuestionNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 31, -1));

        QuestionNoLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        QuestionNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuestionNoLabel.setText("Question No    :-");
        HeaderPanel.add(QuestionNoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 180, -1));

        QuestionNoUpdate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        QuestionNoUpdate.setForeground(new java.awt.Color(255, 255, 255));
        QuestionNoUpdate.setText("00");
        HeaderPanel.add(QuestionNoUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 31, -1));

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
        HeaderPanel.add(MinimizeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 30, 30));

        LabelExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LabelExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LabelExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LabelExitMouseExited(evt);
            }
        });
        HeaderPanel.add(LabelExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 30, 30));

        getContentPane().add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 110));

        BodyPanel.setBackground(new java.awt.Color(0, 102, 102));
        BodyPanel.setMinimumSize(new java.awt.Dimension(1128, 387));
        BodyPanel.setPreferredSize(new java.awt.Dimension(1128, 470));
        BodyPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        QuestionLabel.setBackground(new java.awt.Color(0, 102, 102));
        QuestionLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        QuestionLabel.setForeground(new java.awt.Color(255, 255, 255));
        QuestionLabel.setText("Quesion");
        BodyPanel.add(QuestionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 29, 1010, 50));

        Opt1RadioBtn.setBackground(new java.awt.Color(0, 102, 102));
        Opt1RadioBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Opt1RadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        Opt1RadioBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Opt1RadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opt1RadioBtnActionPerformed(evt);
            }
        });
        BodyPanel.add(Opt1RadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 440, 40));

        Opt2RadioBtn.setBackground(new java.awt.Color(0, 102, 102));
        Opt2RadioBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Opt2RadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        Opt2RadioBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Opt2RadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opt2RadioBtnActionPerformed(evt);
            }
        });
        BodyPanel.add(Opt2RadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 510, 40));

        Opt3RadioBtn.setBackground(new java.awt.Color(0, 102, 102));
        Opt3RadioBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Opt3RadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        Opt3RadioBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Opt3RadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opt3RadioBtnActionPerformed(evt);
            }
        });
        BodyPanel.add(Opt3RadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 440, 40));

        Opt4RadioBtn.setBackground(new java.awt.Color(0, 102, 102));
        Opt4RadioBtn.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Opt4RadioBtn.setForeground(new java.awt.Color(255, 255, 255));
        Opt4RadioBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        Opt4RadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Opt4RadioBtnActionPerformed(evt);
            }
        });
        BodyPanel.add(Opt4RadioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 510, 40));

        NextQuestionBtn.setBackground(new java.awt.Color(0, 102, 102));
        NextQuestionBtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        NextQuestionBtn.setForeground(new java.awt.Color(255, 255, 255));
        NextQuestionBtn.setText("Next");
        NextQuestionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextQuestionBtnActionPerformed(evt);
            }
        });
        BodyPanel.add(NextQuestionBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 120, 40));

        SubmitBtn.setBackground(new java.awt.Color(0, 102, 102));
        SubmitBtn.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        BodyPanel.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, 120, 40));
        BodyPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1130, -1));

        getContentPane().add(BodyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1130, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NextQuestionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextQuestionBtnActionPerformed
        answerCheck();
        question();
    }//GEN-LAST:event_NextQuestionBtnActionPerformed

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to submit", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            answerCheck();
            submit();
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void Opt1RadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opt1RadioBtnActionPerformed
        if (Opt1RadioBtn.isSelected()) {
            Opt2RadioBtn.setSelected(false);
            Opt3RadioBtn.setSelected(false);
            Opt4RadioBtn.setSelected(false);
        }
    }//GEN-LAST:event_Opt1RadioBtnActionPerformed

    private void Opt2RadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opt2RadioBtnActionPerformed
        if (Opt2RadioBtn.isSelected()) {
            Opt1RadioBtn.setSelected(false);
            Opt3RadioBtn.setSelected(false);
            Opt4RadioBtn.setSelected(false);
        }
    }//GEN-LAST:event_Opt2RadioBtnActionPerformed

    private void Opt3RadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opt3RadioBtnActionPerformed
        if (Opt3RadioBtn.isSelected()) {
            Opt2RadioBtn.setSelected(false);
            Opt1RadioBtn.setSelected(false);
            Opt4RadioBtn.setSelected(false);
        }
    }//GEN-LAST:event_Opt3RadioBtnActionPerformed

    private void Opt4RadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Opt4RadioBtnActionPerformed
        if (Opt4RadioBtn.isSelected()) {
            Opt2RadioBtn.setSelected(false);
            Opt3RadioBtn.setSelected(false);
            Opt1RadioBtn.setSelected(false);
        }
    }//GEN-LAST:event_Opt4RadioBtnActionPerformed

    private void MinimizeLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseClicked
        setState(RegistrationPage.ICONIFIED);
    }//GEN-LAST:event_MinimizeLabelMouseClicked

    private void MinimizeLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseEntered
        ImageIcon ap = new ImageIcon("src/main/java/img/des1.png");
        MinimizeLabel.setIcon(ap);
    }//GEN-LAST:event_MinimizeLabelMouseEntered

    private void MinimizeLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeLabelMouseExited
        ImageIcon ap = new ImageIcon("src/main/java/img/des.png");
        MinimizeLabel.setIcon(ap);
    }//GEN-LAST:event_MinimizeLabelMouseExited

    private void LabelExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseClicked
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to quit", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        } else {
            int b = JOptionPane.showConfirmDialog(null, "Leave Us A Review", "Select", JOptionPane.YES_NO_OPTION);
            {   if (b == 0) {
                    new FeedBackForm(userId).setVisible(true);
                } else {
                    System.exit(0);
                }
            }
        }
    }//GEN-LAST:event_LabelExitMouseClicked

    private void LabelExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseEntered
        ImageIcon exit1 = new ImageIcon("src/main/java/img/exit1.png");
        LabelExit.setIcon(exit1);
    }//GEN-LAST:event_LabelExitMouseEntered

    private void LabelExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LabelExitMouseExited
        ImageIcon exit2 = new ImageIcon("src/main/java/img/exit.png");
        LabelExit.setIcon(exit2);
    }//GEN-LAST:event_LabelExitMouseExited

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExamPage(selectedLanguage, userId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BodyPanel;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JLabel LabelExit;
    private javax.swing.JLabel MinimizeLabel;
    private javax.swing.JLabel MinuteLabel;
    private javax.swing.JButton NextQuestionBtn;
    private javax.swing.JRadioButton Opt1RadioBtn;
    private javax.swing.JRadioButton Opt2RadioBtn;
    private javax.swing.JRadioButton Opt3RadioBtn;
    private javax.swing.JRadioButton Opt4RadioBtn;
    private javax.swing.JLabel QuestionLabel;
    private javax.swing.JLabel QuestionNoLabel;
    private javax.swing.JLabel QuestionNoUpdate;
    private javax.swing.JLabel QuizTitle;
    private javax.swing.JLabel SecondLabel;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel TimeTakenLabel;
    private javax.swing.JLabel TotalLabelTime;
    private javax.swing.JLabel TotalQuestionLabel;
    private javax.swing.JLabel TotalQuestionNoLabel;
    private javax.swing.JLabel TotalTimeLabel;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
