package UserPack;

import Database.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class FeedBackForm extends javax.swing.JFrame {

    static int userId;
    String nm;
    String email;

    public FeedBackForm(int uid) {
        initComponents();
        userId = uid;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SubmitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubmitBtn.setBackground(new java.awt.Color(0, 0, 0));
        SubmitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SubmitBtn.setForeground(new java.awt.Color(255, 255, 255));
        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(SubmitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 500, 200));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Feedback :-");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 120, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        try {
            Connection con = DatabaseConnection.getCon();
            Statement st = con.createStatement();
            
            //Retrieve Data From User Id
            ResultSet rs = st.executeQuery("select * from register where id = '" + userId + "' ");
            rs.next();            
            nm = rs.getString(2);
            email = rs.getString(3);
            
            //Take Feedback Data From User Store In FeedBack Table
            String feedtxt = jTextArea1.getText();
            PreparedStatement pst = con.prepareStatement("insert into feedback(name,email,feeds) values ('" + nm + "','" + email + "','" + feedtxt + "')");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Thanks You For Your Valueable FeedBack");
            System.exit(0);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_SubmitBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FeedBackForm(userId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
