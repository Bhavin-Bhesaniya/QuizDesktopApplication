package AdminPanel;

import Database.DatabaseConnection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AllUserResult extends javax.swing.JFrame {
    public AllUserResult() {
        initComponents();
        try {
            Connection con = DatabaseConnection.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select register.id,register.name,register.email,quizmarks.id,quizmarks.user_id,quizmarks.marks,quizmarks.date,quizmarks.language  from register inner join quizmarks on register.id=quizmarks.user_id ");
            while (rs.next()) {
                String id = String.valueOf(rs.getInt("id"));
                String name = rs.getString("name");
                String email = rs.getString("email");
                String marks = rs.getString("marks");
                String lang = rs.getString("language");
                String date = rs.getString("date");
                String tbData[] = {id, name, email, marks, lang, date};
                DefaultTableModel tblmodel = (DefaultTableModel) ResultTable.getModel();
                tblmodel.addRow(tbData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HeaderPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        TabelPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ResultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(340, 180));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeaderPanel.setBackground(new java.awt.Color(74, 31, 61));
        HeaderPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(51, 51, 51)));
        HeaderPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("All User Result");
        HeaderPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 250, 50));

        BackBtn.setBackground(new java.awt.Color(0, 0, 0));
        BackBtn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 255, 255));
        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        HeaderPanel.add(BackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, -1, 35));

        getContentPane().add(HeaderPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 100));

        TabelPanel.setBackground(new java.awt.Color(0, 0, 0));
        TabelPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 1, new java.awt.Color(255, 204, 51)));
        TabelPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ResultTable.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        ResultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Email", "Marks", "Language", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(ResultTable);
        if (ResultTable.getColumnModel().getColumnCount() > 0) {
            ResultTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            ResultTable.getColumnModel().getColumn(0).setMaxWidth(50);
            ResultTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            ResultTable.getColumnModel().getColumn(1).setMaxWidth(200);
            ResultTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            ResultTable.getColumnModel().getColumn(3).setMaxWidth(70);
            ResultTable.getColumnModel().getColumn(4).setPreferredWidth(130);
            ResultTable.getColumnModel().getColumn(4).setMaxWidth(130);
            ResultTable.getColumnModel().getColumn(5).setPreferredWidth(120);
            ResultTable.getColumnModel().getColumn(5).setMaxWidth(120);
        }

        TabelPanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 330));

        getContentPane().add(TabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        try {
            new AdminHome().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AllUserResult.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_BackBtnActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllUserResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JPanel HeaderPanel;
    private javax.swing.JTable ResultTable;
    private javax.swing.JPanel TabelPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
