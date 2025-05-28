package App;

import com.formdev.flatlaf.extras.FlatSVGIcon;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        svg.setIcon(new FlatSVGIcon(getClass().getResource("/Design/Dashboard-FIx.svg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnUser = new javax.swing.JLabel();
        BtnLaporan = new javax.swing.JLabel();
        BtnStock = new javax.swing.JLabel();
        BtnKasir = new javax.swing.JLabel();
        svg = new javax.swing.JLabel();
        png = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnUserMouseClicked(evt);
            }
        });
        getContentPane().add(BtnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 393, 330, 140));

        BtnLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLaporanMouseClicked(evt);
            }
        });
        getContentPane().add(BtnLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 393, 330, 140));

        BtnStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnStockMouseClicked(evt);
            }
        });
        getContentPane().add(BtnStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 187, 330, 140));

        BtnKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnKasirMouseClicked(evt);
            }
        });
        getContentPane().add(BtnKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 187, 330, 140));
        getContentPane().add(svg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1372, 0, -1, -1));

        png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Dashboard-FIx.jpg"))); // NOI18N
        png.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pngMouseClicked(evt);
            }
        });
        getContentPane().add(png, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pngMouseClicked

    }//GEN-LAST:event_pngMouseClicked

    private void BtnKasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnKasirMouseClicked
        Kasir abc = new Kasir();
        abc.setVisible(true);
        abc.pack();
        abc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnKasirMouseClicked

    private void BtnStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnStockMouseClicked
        DataBarang abc = new DataBarang();
        abc.setVisible(true);
        abc.pack();
        abc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnStockMouseClicked

    private void BtnLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLaporanMouseClicked
        Laporan abc = new Laporan();
        abc.setVisible(true);
        abc.pack();
        abc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnLaporanMouseClicked

    private void BtnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUserMouseClicked
        User abc = new User();
        abc.setVisible(true);
        abc.pack();
        abc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnUserMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnKasir;
    private javax.swing.JLabel BtnLaporan;
    private javax.swing.JLabel BtnStock;
    private javax.swing.JLabel BtnUser;
    private javax.swing.JLabel png;
    private javax.swing.JLabel svg;
    // End of variables declaration//GEN-END:variables
}
