package UserPack;

public class StartProject extends javax.swing.JFrame {

    public StartProject() {
        initComponents();
        //Create Thread
        Thread t;
        t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    try {
                        ProgressBar.setValue(i);
                        PercentageLabel.setText(Integer.toString(i) + " %");
                        Thread.sleep(6);  //MiliSecond
                        if (i == 99) {
                            new HomePage().setVisible(true);
                            dispose();
                        }
                    } catch (InterruptedException ex) {
                        System.out.print(ex);
                    }
                }
            }
        });
        //Thread Start
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ProgressBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        PercentageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(450, 280));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProgressBar.setBackground(new java.awt.Color(0, 102, 102));
        ProgressBar.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.add(ProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 280, 44));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please wait  ........");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 169, 120, 30));

        PercentageLabel.setBackground(new java.awt.Color(0, 204, 204));
        PercentageLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PercentageLabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(PercentageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 40, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartProject().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PercentageLabel;
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
