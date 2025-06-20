package App;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import javax.swing.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;
import java.awt.Frame;
import java.sql.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;

public class RiwayatPembelian extends javax.swing.JFrame {

    public RiwayatPembelian() {
        initComponents();

        svg.setIcon(new FlatSVGIcon(getClass().getResource("/Design/Kasir-Fix.svg")));

        tampilkanData();
    }

    private void tampilkanData() {
        DefaultTableModel model = (DefaultTableModel) TblLaporan.getModel();
        model.setColumnIdentifiers(new String[]{
            "No", "ID Transaksi", "Total Harga", "Bayar", "Kembalian", "Tanggal", "Kasir"
        });
        model.setRowCount(0);

        String sql = "SELECT t.ID_Transaksi, t.Jumlah_Harga AS Total_Harga, t.Pembayaran AS Bayar, "
                + "t.Kembalian, t.Tanggal, u.Username AS Kasir "
                + "FROM transaksi t "
                + "JOIN users u ON t.ID_User = u.ID_User";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasirkoperasismada", "root", ""); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            DecimalFormat tanpaKoma = new DecimalFormat("#,###");
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setGroupingSeparator('.');
            formatRp.setMonetaryDecimalSeparator(',');
            tanpaKoma.setDecimalFormatSymbols(formatRp);
            tanpaKoma.setMaximumFractionDigits(0);

            int no = 1;
            while (rs.next()) {
                model.addRow(new Object[]{
                    no++,
                    rs.getString("ID_Transaksi"),
                    "Rp. " + tanpaKoma.format(rs.getDouble("Total_Harga")),
                    "Rp. " + tanpaKoma.format(rs.getDouble("Bayar")),
                    "Rp. " + tanpaKoma.format(rs.getDouble("Kembalian")),
                    rs.getDate("Tanggal"),
                    rs.getString("Kasir")
                });
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mengambil data: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        TblLaporan = new javax.swing.JTable();
        BtnDetail = new javax.swing.JButton();
        BtnBarang = new javax.swing.JLabel();
        BtnDashboard = new javax.swing.JLabel();
        BtnKasir = new javax.swing.JLabel();
        BtnUser = new javax.swing.JLabel();
        BtnLogout = new javax.swing.JLabel();
        Tam = new com.toedter.calendar.JDateChooser();
        Sampai = new javax.swing.JLabel();
        Dari = new javax.swing.JLabel();
        sam = new com.toedter.calendar.JDateChooser();
        BtnCek = new javax.swing.JButton();
        svg = new javax.swing.JLabel();
        png = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TblLaporan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TblLaporan);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 1030, -1));

        BtnDetail.setText("Detail");
        BtnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDetailActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 640, 150, 45));

        BtnBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnBarangMouseClicked(evt);
            }
        });
        getContentPane().add(BtnBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 213, 192, 58));

        BtnDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnDashboardMouseClicked(evt);
            }
        });
        getContentPane().add(BtnDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 35, 192, 58));

        BtnKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnKasirMouseClicked(evt);
            }
        });
        getContentPane().add(BtnKasir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 125, 192, 58));

        BtnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnUserMouseClicked(evt);
            }
        });
        getContentPane().add(BtnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 192, 58));

        BtnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLogoutMouseClicked(evt);
            }
        });
        getContentPane().add(BtnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 647, 192, 58));
        getContentPane().add(Tam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 60, 190, 35));

        Sampai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Sampai.setForeground(new java.awt.Color(255, 255, 255));
        Sampai.setText("Sampai Tanggal");
        getContentPane().add(Sampai, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 100, -1, -1));

        Dari.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Dari.setForeground(new java.awt.Color(255, 255, 255));
        Dari.setText("Dari Tanggal");
        getContentPane().add(Dari, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, -1, -1));
        getContentPane().add(sam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 130, 190, 35));

        BtnCek.setText("Cek Laporan");
        BtnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCekActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 150, 45));
        getContentPane().add(svg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Laporan.png"))); // NOI18N
        getContentPane().add(png, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCekActionPerformed
        java.util.Date dariTanggal = Tam.getDate();
        java.util.Date sampaiTanggal = sam.getDate();

        if (dariTanggal == null || sampaiTanggal == null) {
            JOptionPane.showMessageDialog(this, "Silakan pilih kedua tanggal terlebih dahulu!");
            return;
        }

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String dari = sdf.format(dariTanggal);
        String sampai = sdf.format(sampaiTanggal);

        DefaultTableModel model = (DefaultTableModel) TblLaporan.getModel();
        model.setRowCount(0); // Clear previous data

        String sql = "SELECT t.ID_Transaksi, t.Jumlah_Harga AS Total_Harga, t.Pembayaran AS Bayar, "
                + "t.Kembalian, t.Tanggal, u.Username AS Kasir "
                + "FROM transaksi t "
                + "JOIN users u ON t.ID_User = u.ID_User "
                + "WHERE t.Tanggal BETWEEN ? AND ?";

        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kasirkoperasismada", "root", ""); PreparedStatement pst = conn.prepareStatement(sql)) {

            pst.setString(1, dari);
            pst.setString(2, sampai);

            ResultSet rs = pst.executeQuery();
            int no = 1;

            DecimalFormat tanpaKoma = new DecimalFormat("#,###");
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setGroupingSeparator('.');
            formatRp.setMonetaryDecimalSeparator(',');
            tanpaKoma.setDecimalFormatSymbols(formatRp);
            tanpaKoma.setMaximumFractionDigits(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    no++,
                    rs.getString("ID_Transaksi"),
                    "Rp. " + tanpaKoma.format(rs.getDouble("Total_Harga")),
                    "Rp. " + tanpaKoma.format(rs.getDouble("Bayar")),
                    "Rp. " + tanpaKoma.format(rs.getDouble("Kembalian")),
                    rs.getDate("Tanggal"),
                    rs.getString("Kasir")
                });
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal mengambil data: " + e.getMessage());
        }

    }//GEN-LAST:event_BtnCekActionPerformed

    private void BtnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDetailActionPerformed
        int selectedRow = TblLaporan.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih transaksi terlebih dahulu!");
            return;
        }

        String idTransaksi = TblLaporan.getValueAt(selectedRow, 1).toString(); // kolom 1 = IDTransaksi
        new DetailTransaksi((Frame) SwingUtilities.getWindowAncestor(this), idTransaksi).setVisible(true);
    }//GEN-LAST:event_BtnDetailActionPerformed

    private void BtnKasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnKasirMouseClicked
        Kasir k = new Kasir();
        k.setVisible(true);
        k.pack();
        k.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnKasirMouseClicked

    private void BtnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUserMouseClicked
        User u = new User();
        u.setVisible(true);
        u.pack();
        u.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnUserMouseClicked

    private void BtnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDashboardMouseClicked
        Dashboard d = new Dashboard();
        d.setVisible(true);
        d.pack();
        d.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnDashboardMouseClicked

    private void BtnBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBarangMouseClicked
        DataBarang db = new DataBarang();
        db.setVisible(true);
        db.pack();
        db.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnBarangMouseClicked

    private void BtnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLogoutMouseClicked
        Login l = new Login();
        l.setVisible(true);
        l.pack();
        l.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(RiwayatPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RiwayatPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RiwayatPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RiwayatPembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RiwayatPembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnBarang;
    private javax.swing.JButton BtnCek;
    private javax.swing.JLabel BtnDashboard;
    private javax.swing.JButton BtnDetail;
    private javax.swing.JLabel BtnKasir;
    private javax.swing.JLabel BtnLogout;
    private javax.swing.JLabel BtnUser;
    private javax.swing.JLabel Dari;
    private javax.swing.JLabel Sampai;
    private com.toedter.calendar.JDateChooser Tam;
    private javax.swing.JTable TblLaporan;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel png;
    private com.toedter.calendar.JDateChooser sam;
    private javax.swing.JLabel svg;
    // End of variables declaration//GEN-END:variables
}
