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
                String opt1 = rs.getString("opt1");
                String opt2 = rs.getString("opt2");
                String opt3 = rs.getString("opt3");
                String opt4 = rs.getString("opt4");
                String answer = rs.getString("answer");
                String lang = rs.getString("language");

                String tbData[] = {id, Question,opt1,opt2,opt3,opt4,answer,lang};
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
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AllQuestionTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(20, 50));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(74, 31, 61));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ALL QUESTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 30, 280, 70));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 30, 120, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        AllQuestionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Question", "Opt1", "Opt2", "Opt3", "Opt4", "Answer", "Language"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(AllQuestionTable);
        if (AllQuestionTable.getColumnModel().getColumnCount() > 0) {
            AllQuestionTable.getColumnModel().getColumn(0).setMaxWidth(20);
            AllQuestionTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            AllQuestionTable.getColumnModel().getColumn(5).setMaxWidth(150);
            AllQuestionTable.getColumnModel().getColumn(6).setPreferredWidth(200);
            AllQuestionTable.getColumnModel().getColumn(6).setMaxWidth(200);
            AllQuestionTable.getColumnModel().getColumn(7).setPreferredWidth(70);
            AllQuestionTable.getColumnModel().getColumn(7).setMaxWidth(90);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1500, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        try {
            new AdminHome().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AllQuestion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllQuestion().setVisible(true);            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AllQuestionTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

}
