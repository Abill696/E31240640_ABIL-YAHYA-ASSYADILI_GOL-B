package App;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.*;

public class TambahBarang extends javax.swing.JFrame {

    public TambahBarang() {
        initComponents();
        jLabel1.setIcon(new FlatSVGIcon(getClass().getResource("/Design/Tambah Barang (2).svg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TxtBarcode = new javax.swing.JTextField();
        TxtHargaBarang = new javax.swing.JTextField();
        TxtNamaBarang = new javax.swing.JTextField();
        TxtStockBarang = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        BtnKembali = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtBarcode.setBackground(new java.awt.Color(255, 255, 255));
        TxtBarcode.setFont(new java.awt.Font("Poppins ExtraBold", 2, 12)); // NOI18N
        TxtBarcode.setForeground(new java.awt.Color(102, 102, 102));
        TxtBarcode.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtBarcode.setText("Scan Barcode Barang");
        TxtBarcode.setBorder(null);
        TxtBarcode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtBarcodeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtBarcodeFocusLost(evt);
            }
        });
        TxtBarcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBarcodeActionPerformed(evt);
            }
        });
        getContentPane().add(TxtBarcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 512, 680, 71));

        TxtHargaBarang.setBackground(new java.awt.Color(255, 255, 255));
        TxtHargaBarang.setFont(new java.awt.Font("Poppins ExtraBold", 2, 12)); // NOI18N
        TxtHargaBarang.setForeground(new java.awt.Color(102, 102, 102));
        TxtHargaBarang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtHargaBarang.setText("Input Harga Barang");
        TxtHargaBarang.setBorder(null);
        TxtHargaBarang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtHargaBarangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtHargaBarangFocusLost(evt);
            }
        });
        getContentPane().add(TxtHargaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 306, 680, 71));

        TxtNamaBarang.setBackground(new java.awt.Color(255, 255, 255));
        TxtNamaBarang.setFont(new java.awt.Font("Poppins ExtraBold", 2, 12)); // NOI18N
        TxtNamaBarang.setForeground(new java.awt.Color(102, 102, 102));
        TxtNamaBarang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNamaBarang.setText("Input Nama Barang");
        TxtNamaBarang.setBorder(null);
        TxtNamaBarang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNamaBarangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNamaBarangFocusLost(evt);
            }
        });
        TxtNamaBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaBarangActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNamaBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 203, 680, 71));

        TxtStockBarang.setBackground(new java.awt.Color(255, 255, 255));
        TxtStockBarang.setFont(new java.awt.Font("Poppins ExtraBold", 2, 12)); // NOI18N
        TxtStockBarang.setForeground(new java.awt.Color(102, 102, 102));
        TxtStockBarang.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtStockBarang.setText("Input Stock Barang");
        TxtStockBarang.setBorder(null);
        TxtStockBarang.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtStockBarangFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtStockBarangFocusLost(evt);
            }
        });
        getContentPane().add(TxtStockBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(343, 409, 680, 71));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jButton1.setText("Tambah Barang");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 620, 310, 56));

        BtnKembali.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        BtnKembali.setText("Kembali");
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(BtnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 690, 310, 52));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1372, 786, -1, -1));

        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Tambah Barang (3).png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String namaBarang = TxtNamaBarang.getText().trim();
        String stokBarang = TxtStockBarang.getText().trim();
        String hargaBarang = TxtHargaBarang.getText().trim();
        String barcodeBarang = TxtBarcode.getText().trim();

    if (namaBarang.isEmpty() || stokBarang.isEmpty() || hargaBarang.isEmpty() || barcodeBarang.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua field harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        int stokBaru = Integer.parseInt(stokBarang);
        double harga = Double.parseDouble(hargaBarang);

    try (Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/revisidatabase", "root", "");
         PreparedStatement checkStatement = connection.prepareStatement(
                "SELECT Stok, Harga FROM barang WHERE Nama_Barang = ?")) {

        checkStatement.setString(1, namaBarang);

        try (ResultSet resultSet = checkStatement.executeQuery()) {
            if (resultSet.next()) {
                // Barang sudah ada, update stok
                int stokLama = resultSet.getInt("Stok");
                double hargaLama = resultSet.getDouble("Harga");

                if (Double.compare(hargaLama, harga) != 0) {
                    JOptionPane.showMessageDialog(this, "Harga barang tidak sesuai dengan yang ada di database!", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int stokBaruTotal = stokLama + stokBaru;
                try (PreparedStatement updateStatement = connection.prepareStatement(
                        "UPDATE barang SET Stok = ? WHERE Nama_Barang = ?")) {
                    updateStatement.setInt(1, stokBaruTotal);
                    updateStatement.setString(2, namaBarang);
                    updateStatement.executeUpdate();
                }

                JOptionPane.showMessageDialog(this, "Stok barang berhasil diperbarui.");
            } else {
                // Barang belum ada, generate ID_Barang otomatis
                String newIdBarang = "BRG001";
                try (Statement idStmt = connection.createStatement();
                     ResultSet idRs = idStmt.executeQuery("SELECT MAX(ID_Barang) AS max_id FROM barang")) {

                    if (idRs.next() && idRs.getString("max_id") != null) {
                        String maxId = idRs.getString("max_id"); // Misal: "BRG005"
                        int number = Integer.parseInt(maxId.substring(3)) + 1;
                        newIdBarang = String.format("BRG%03d", number);
                    }
                }

                try (PreparedStatement insertStatement = connection.prepareStatement(
                        "INSERT INTO barang (ID_Barang, Nama_Barang, Stok, Harga, Barcode) VALUES (?, ?, ?, ?, ?)")) {
                    insertStatement.setString(1, newIdBarang);
                    insertStatement.setString(2, namaBarang);
                    insertStatement.setInt(3, stokBaru);
                    insertStatement.setDouble(4, harga);
                    insertStatement.setString(5, barcodeBarang);
                    insertStatement.executeUpdate();
                }

                JOptionPane.showMessageDialog(this, "Barang baru berhasil ditambahkan dengan ID: " + newIdBarang);
                }
            }
        }

        TxtNamaBarang.setText("");
        TxtStockBarang.setText("");
        TxtHargaBarang.setText("");
        TxtBarcode.setText("");

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Stok dan harga harus berupa angka!", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TxtNamaBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaBarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaBarangActionPerformed

    private void TxtNamaBarangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNamaBarangFocusGained
        if (TxtNamaBarang.getText().equals("Input Nama Barang")) {
            TxtNamaBarang.setText("");
        }

    }//GEN-LAST:event_TxtNamaBarangFocusGained

    private void TxtNamaBarangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNamaBarangFocusLost
        if (TxtNamaBarang.getText().isEmpty()) {
            TxtNamaBarang.setText("Input Nama Barang");
        }
    }//GEN-LAST:event_TxtNamaBarangFocusLost

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        Dashboard iFrame = new Dashboard();
        iFrame.setVisible(true);
        iFrame.pack();
        iFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void TxtHargaBarangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtHargaBarangFocusGained
        if (TxtHargaBarang.getText().equals("Input Harga Barang")) {
            TxtHargaBarang.setText("");
        }       
    }//GEN-LAST:event_TxtHargaBarangFocusGained

    private void TxtHargaBarangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtHargaBarangFocusLost
        if (TxtHargaBarang.getText().isEmpty()) {
            TxtHargaBarang.setText("Input Harga Barang");
        }    }//GEN-LAST:event_TxtHargaBarangFocusLost

    private void TxtStockBarangFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtStockBarangFocusGained
        if (TxtStockBarang.getText().equals("Input Stock Barang")) {
            TxtStockBarang.setText("");
        }    }//GEN-LAST:event_TxtStockBarangFocusGained

    private void TxtStockBarangFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtStockBarangFocusLost
        if (TxtStockBarang.getText().isEmpty()) {
            TxtStockBarang.setText("Input Stock Barang");
        }    }//GEN-LAST:event_TxtStockBarangFocusLost

    private void TxtBarcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBarcodeActionPerformed
        
    }//GEN-LAST:event_TxtBarcodeActionPerformed

    private void TxtBarcodeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtBarcodeFocusGained
        if (TxtBarcode.getText().equals("Scan Barcode Barang")) {
            TxtBarcode.setText("");
        }    }//GEN-LAST:event_TxtBarcodeFocusGained

    private void TxtBarcodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtBarcodeFocusLost
        if (TxtBarcode.getText().isEmpty()) {
            TxtBarcode.setText("Scan Barcode Barang");}    }//GEN-LAST:event_TxtBarcodeFocusLost

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
            java.util.logging.Logger.getLogger(TambahBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnKembali;
    private javax.swing.JTextField TxtBarcode;
    private javax.swing.JTextField TxtHargaBarang;
    private javax.swing.JTextField TxtNamaBarang;
    private javax.swing.JTextField TxtStockBarang;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
