package App;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.io.InputStream;
import java.sql.Connection;
import javax.swing.JFrame;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import net.sf.jasperreports.view.JasperViewer;

public class Kasir extends javax.swing.JFrame {

    public Kasir() {
        initComponents();

        // Fokus otomatis ke textfield
        barcodeTextField.addHierarchyListener(e -> {
            if ((e.getChangeFlags() & java.awt.event.HierarchyEvent.SHOWING_CHANGED) != 0) {
                javax.swing.SwingUtilities.invokeLater(() -> barcodeTextField.requestFocusInWindow());
            }
        });

        svg.setIcon(new FlatSVGIcon(getClass().getResource("/Design/Kasir-Fix.svg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TotalHargaSeluruh2 = new javax.swing.JTextField();
        JBarang3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        BtnBarang = new javax.swing.JLabel();
        BtnDashboard = new javax.swing.JLabel();
        BtnLaporan = new javax.swing.JLabel();
        BtnUser = new javax.swing.JLabel();
        barcodeTextField = new javax.swing.JTextField();
        TxtKembalian = new javax.swing.JTextField();
        TxtTotalHarga1 = new javax.swing.JTextField();
        TxtBayar1 = new javax.swing.JTextField();
        BtnBayar = new javax.swing.JButton();
        svg = new javax.swing.JLabel();
        png = new javax.swing.JLabel();

        TotalHargaSeluruh2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalHargaSeluruh2ActionPerformed(evt);
            }
        });

        JBarang3.setForeground(new java.awt.Color(255, 255, 255));
        JBarang3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JBarang3.setText("Jumlah Bayar");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel3.setText("Kembali");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 470, 180, 30));

        jLabel2.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel2.setText("Tunai");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 340, 180, 30));

        jLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        jLabel1.setText("Total");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 210, 180, 30));

        table.setForeground(new java.awt.Color(204, 204, 204));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Harga", "Qty", "Subtotal"
            }
        ));
        table.setGridColor(new java.awt.Color(255, 255, 255));
        table.setPreferredSize(new java.awt.Dimension(876, 485));
        table.getTableHeader().setResizingAllowed(false);
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 890, 520));

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

        BtnLaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnLaporanMouseClicked(evt);
            }
        });
        getContentPane().add(BtnLaporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 302, 192, 58));

        BtnUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BtnUserFocusGained(evt);
            }
        });
        BtnUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnUserMouseClicked(evt);
            }
        });
        getContentPane().add(BtnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 391, 192, 58));

        barcodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                barcodeTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(barcodeTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 890, 40));

        TxtKembalian.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtKembalian.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtKembalianFocusGained(evt);
            }
        });
        TxtKembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtKembalianActionPerformed(evt);
            }
        });
        getContentPane().add(TxtKembalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 499, 180, 60));

        TxtTotalHarga1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtTotalHarga1.setBorder(null);
        getContentPane().add(TxtTotalHarga1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 250, 180, 60));

        TxtBayar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtBayar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBayar1ActionPerformed(evt);
            }
        });
        getContentPane().add(TxtBayar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 370, 180, 60));

        BtnBayar.setText("Bayar");
        BtnBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBayarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 610, 180, 60));
        getContentPane().add(svg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        png.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Kasir-Fix.png"))); // NOI18N
        getContentPane().add(png, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TotalHargaSeluruh2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalHargaSeluruh2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalHargaSeluruh2ActionPerformed

    private void barcodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_barcodeTextFieldActionPerformed

        String barcode = barcodeTextField.getText().trim();

        try {
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/kasirkoperasismada", "root", "")) {
                PreparedStatement ps = conn.prepareStatement("SELECT nama_barang, harga FROM barang WHERE barcode = ?");
                ps.setString(1, barcode);
                ResultSet rs = ps.executeQuery();

                if (rs.next()) {
                    String nama = rs.getString("nama_barang");
                    double harga = rs.getDouble("harga");

                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    boolean found = false;

                    for (int i = 0; i < model.getRowCount(); i++) {
                        if (model.getValueAt(i, 0).equals(nama)) {
                            int qty = (int) model.getValueAt(i, 2) + 1;
                            double subtotal = harga * qty;
                            model.setValueAt(qty, i, 2);
                            model.setValueAt(subtotal, i, 3);
                            updateTotalHarga(); // Panggil metode untuk memperbarui total harga
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        int qty = 1;
                        double subtotal = harga * qty;
                        model.addRow(new Object[]{nama, harga, qty, subtotal});
                        updateTotalHarga(); // Panggil metode untuk memperbarui total harga
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Barang tidak ditemukan!");
                }

                barcodeTextField.setText("");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Gagal mengambil data dari database.");
        }

    }//GEN-LAST:event_barcodeTextFieldActionPerformed

    private void TxtKembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtKembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtKembalianActionPerformed

    private void TxtBayar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBayar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBayar1ActionPerformed

    private void BtnBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBayarActionPerformed
if (TxtTotalHarga1.getText().isEmpty() || TxtBayar1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Total harga dan Pembayaran tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            // Ambil total harga dan jumlah pembayaran
            double totalHarga = Double.parseDouble(TxtTotalHarga1.getText().substring(4).trim());
            double jumlahBayar = Double.parseDouble(TxtBayar1.getText().trim());

            if (jumlahBayar < totalHarga) {
                JOptionPane.showMessageDialog(this, "Jumlah pembayaran tidak cukup!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double kembalian = jumlahBayar - totalHarga;
            TxtKembalian.setText("Rp. " + kembalian);

            int idTransaksi;
            // Simpan transaksi ke tabel penjualan
            try (Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kasirkoperasismada",
                    "root",
                    ""
            )) {
                // Simpan transaksi ke tabel penjualan
                String insertQuery = "INSERT INTO transaksi (Jumlah_Harga, Pembayaran, Kembalian, ID_User) VALUES (?, ?, ?, ?)";
                PreparedStatement transaksiStatement = connection.prepareStatement(insertQuery, Statement.RETURN_GENERATED_KEYS);
                transaksiStatement.setDouble(1, totalHarga);    // Jumlah_Harga
                transaksiStatement.setDouble(2, jumlahBayar);   // Pembayaran
                transaksiStatement.setDouble(3, kembalian);     // Kembalian
                transaksiStatement.setInt(4, Session.idUser); // Ambil dari sesi login
                transaksiStatement.executeUpdate();
                ResultSet generatedKeys = transaksiStatement.getGeneratedKeys();
                idTransaksi = 0;
                if (generatedKeys.next()) {
                    idTransaksi = generatedKeys.getInt(1);
                }   DefaultTableModel tbl = (DefaultTableModel) table.getModel();
                for (int i = 0; i < tbl.getRowCount(); i++) {
                    String namaBarang = tbl.getValueAt(i, 0).toString();
                    double hargaBarang = Double.parseDouble(tbl.getValueAt(i, 1).toString());
                    int jumlahBarang = Integer.parseInt(tbl.getValueAt(i, 2).toString());
                    double totalPenjualan = Double.parseDouble(tbl.getValueAt(i, 3).toString());
                    // Get barang info including current stock
                    String getBarangQuery = "SELECT ID_Barang, Stok FROM barang WHERE Nama_Barang = ?";
                    try (PreparedStatement getBarangStatement = connection.prepareStatement(getBarangQuery)) {
                        getBarangStatement.setString(1, namaBarang);
                        ResultSet barangResult = getBarangStatement.executeQuery();
                        
                        int idBarang = 0;
                        int currentStock = 0;
                        if (barangResult.next()) {
                            idBarang = barangResult.getInt("ID_Barang");
                            currentStock = barangResult.getInt("Stok");
                            
                            // Check if stock is sufficient
                            if (currentStock < jumlahBarang) {
                                JOptionPane.showMessageDialog(this, "Stok tidak mencukupi untuk barang: " + namaBarang, "Error", JOptionPane.ERROR_MESSAGE);
                                return;
                            }
                        }
                        
                        // Insert into detail_transaksi
                        String insertBarangTerjualQuery = "INSERT INTO detail_transaksi (ID_Transaksi, ID_Barang, Qty, Subtotal) VALUES (?, ?, ?, ?)";
                        PreparedStatement barangTerjualStatement = connection.prepareStatement(insertBarangTerjualQuery);
                        
                        barangTerjualStatement.setInt(1, idTransaksi);
                        barangTerjualStatement.setInt(2, idBarang);
                        barangTerjualStatement.setInt(3, jumlahBarang);
                        barangTerjualStatement.setDouble(4, totalPenjualan);
                        barangTerjualStatement.executeUpdate();
                        
                        // Update stock in barang table
                        int newStock = currentStock - jumlahBarang;
                        String updateStockQuery = "UPDATE barang SET Stok = ? WHERE ID_Barang = ?";
                        PreparedStatement updateStockStatement = connection.prepareStatement(updateStockQuery);
                        updateStockStatement.setInt(1, newStock);
                        updateStockStatement.setInt(2, idBarang);
                        updateStockStatement.executeUpdate();
                        
                        // Close statements
                        barangTerjualStatement.close();
                        updateStockStatement.close();
                    }
                }
                transaksiStatement.close();
            }

            JOptionPane.showMessageDialog(this, "Transaksi berhasil disimpan!", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Kosongkan tabel setelah pembayaran
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0);

            // Reset form transaksi
            TxtTotalHarga1.setText("");
            TxtBayar1.setText("");
            TxtKembalian.setText("");

          
            int cetak = JOptionPane.showConfirmDialog(this, "Transaksi berhasil!\nApakah Anda ingin mencetak struk?", "Cetak Struk", JOptionPane.YES_NO_OPTION);

            if (cetak == JOptionPane.YES_OPTION) {
                try {
                // Compile file .jrxml
                String jrxmlPath = "src/Nota/report1.jrxml";
                JasperReport jasperReport = JasperCompileManager.compileReport(jrxmlPath);

                // Siapkan parameter
                Map<String, Object> parameters = new HashMap<>();
                parameters.put("ID_Transaksi", idTransaksi);

                try (Connection connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/kasirkoperasismada",
                        "root",
                        ""
                )) {
                    // Isi dan tampilkan laporan
                    JasperPrint print = JasperFillManager.fillReport(jasperReport, parameters, connection);
                    JasperViewer.viewReport(print, false);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Gagal mencetak struk: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }

            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Jumlah pembayaran harus berupa angka!", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBayarActionPerformed

    private void BtnDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnDashboardMouseClicked
        Dashboard iFrame = new Dashboard();
        iFrame.setVisible(true);
        iFrame.pack();
        iFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnDashboardMouseClicked

    private void BtnBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBarangMouseClicked
        DataBarang abc = new DataBarang();
        abc.setVisible(true);
        abc.pack();
        abc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnBarangMouseClicked

    private void BtnLaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnLaporanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLaporanMouseClicked

    private void BtnUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnUserMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnUserMouseClicked

    private void BtnUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BtnUserFocusGained
        User abc = new User();
        abc.setVisible(true);
        abc.pack();
        abc.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnUserFocusGained

    private void TxtKembalianFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtKembalianFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtKembalianFocusGained
    private void updateTotalHarga() {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        double total = 0;

        for (int i = 0; i < model.getRowCount(); i++) {
            total += (double) model.getValueAt(i, 3); // Ambil subtotal dari kolom 3
        }

        TxtTotalHarga1.setText("Rp. " + total); // Format total harga
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kasir().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnBarang;
    private javax.swing.JButton BtnBayar;
    private javax.swing.JLabel BtnDashboard;
    private javax.swing.JLabel BtnLaporan;
    private javax.swing.JLabel BtnUser;
    private javax.swing.JLabel JBarang3;
    private javax.swing.JTextField TotalHargaSeluruh2;
    private javax.swing.JTextField TxtBayar1;
    private javax.swing.JTextField TxtKembalian;
    private javax.swing.JTextField TxtTotalHarga1;
    private javax.swing.JTextField barcodeTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel png;
    private javax.swing.JLabel svg;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

}
