package AdminPanel;

import java.sql.*;
import javax.swing.JOptionPane;
import Database.DatabaseConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class AllQuestion extends javax.swing.JFrame {

    public AllQuestion() {
        initComponents();
        try {
            Connection con = DatabaseConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from quizquestion");
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String Question = rs.getString("question");
                String answer = rs.getString("answer");
                String lang = rs.getString("language");
                String tbData[] = {id, Question, answer, lang};
                DefaultTableModel tblmodel = (DefaultTableModel) AllQuestionTable.getModel();
                tblmodel.addRow(tbData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AllQuestionTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(400, 140));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(74, 31, 61));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALL QUESTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 280, 70));

        BackBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, 80, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, -1));

        AllQuestionTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        AllQuestionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Question", "Answer", "Language"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllQuestionTable.setShowVerticalLines(false);
        jScrollPane2.setViewportView(AllQuestionTable);
        if (AllQuestionTable.getColumnModel().getColumnCount() > 0) {
            AllQuestionTable.getColumnModel().getColumn(0).setPreferredWidth(30);
            AllQuestionTable.getColumnModel().getColumn(0).setMaxWidth(30);
            AllQuestionTable.getColumnModel().getColumn(2).setMinWidth(125);
            AllQuestionTable.getColumnModel().getColumn(2).setPreferredWidth(180);
            AllQuestionTable.getColumnModel().getColumn(2).setMaxWidth(190);
            AllQuestionTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            AllQuestionTable.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 820, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        try {
            new AdminHome().setVisible(true);
            dispose();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_BackBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllQuestionTable;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
