package App;

import static App.Session.role;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JFrame;
import javax.swing.SwingConstants;

public class TambahUser extends javax.swing.JFrame {

    public TambahUser() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        svg.setIcon(new FlatSVGIcon(getClass().getResource("/Design/Supplier (1).svg")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TxtNomer1 = new javax.swing.JTextField();
        TxtNomer = new javax.swing.JTextField();
        TxtUsername = new javax.swing.JTextField();
        RoleCombo = new javax.swing.JComboBox<>();
        TxtNama = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JTextField();
        BtnTambah = new javax.swing.JButton();
        BtnKembali = new javax.swing.JButton();
        svg = new javax.swing.JLabel();
        png = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Poppins ExtraBold", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tambah User");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 220, 50));

        TxtNomer1.setBackground(new java.awt.Color(255, 255, 255));
        TxtNomer1.setFont(new java.awt.Font("Poppins ExtraBold", 2, 12)); // NOI18N
        TxtNomer1.setForeground(new java.awt.Color(0, 0, 0));
        TxtNomer1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNomer1.setText("Input RFID");
        TxtNomer1.setBorder(null);
        TxtNomer1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNomer1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNomer1FocusLost(evt);
            }
        });
        getContentPane().add(TxtNomer1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, 620, 40));

        TxtNomer.setBackground(new java.awt.Color(255, 255, 255));
        TxtNomer.setFont(new java.awt.Font("Poppins ExtraBold", 2, 12)); // NOI18N
        TxtNomer.setForeground(new java.awt.Color(0, 0, 0));
        TxtNomer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNomer.setText("Input Nomer");
        TxtNomer.setBorder(null);
        TxtNomer.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNomerFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNomerFocusLost(evt);
            }
        });
        getContentPane().add(TxtNomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 620, 40));

        TxtUsername.setBackground(new java.awt.Color(255, 255, 255));
        TxtUsername.setFont(new java.awt.Font("Poppins ExtraBold", 2, 12)); // NOI18N
        TxtUsername.setForeground(new java.awt.Color(0, 0, 0));
        TxtUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtUsername.setText("Input Username");
        TxtUsername.setBorder(null);
        TxtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtUsernameFocusLost(evt);
            }
        });
        getContentPane().add(TxtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 620, 40));

        RoleCombo.setBackground(new java.awt.Color(255, 255, 255));
        RoleCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasir", "Admin" }));
        RoleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RoleComboActionPerformed(evt);
            }
        });
        getContentPane().add(RoleCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 540, 630, 40));

        TxtNama.setBackground(new java.awt.Color(255, 255, 255));
        TxtNama.setFont(new java.awt.Font("Poppins ExtraBold", 2, 12)); // NOI18N
        TxtNama.setForeground(new java.awt.Color(0, 0, 0));
        TxtNama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtNama.setText("Input Nama");
        TxtNama.setBorder(null);
        TxtNama.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtNamaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtNamaFocusLost(evt);
            }
        });
        TxtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 620, 40));

        TxtPassword.setBackground(new java.awt.Color(255, 255, 255));
        TxtPassword.setFont(new java.awt.Font("Poppins ExtraBold", 2, 12)); // NOI18N
        TxtPassword.setForeground(new java.awt.Color(0, 0, 0));
        TxtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPassword.setText("Input Password");
        TxtPassword.setBorder(null);
        TxtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPasswordFocusLost(evt);
            }
        });
        getContentPane().add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 620, 40));

        BtnTambah.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        BtnTambah.setText("Tambah User");
        BtnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(BtnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 621, 315, 55));

        BtnKembali.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        BtnKembali.setText("Kembali");
        BtnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(BtnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 680, 315, 51));
        getContentPane().add(svg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1372, 786, -1, -1));

        png.setForeground(new java.awt.Color(102, 102, 102));
        png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Supplier (1).png"))); // NOI18N
        getContentPane().add(png, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTambahActionPerformed
        String nama = TxtNama.getText().trim();
        String username = TxtUsername.getText().trim();
        String password = TxtPassword.getText().trim();
        String nomer = TxtNomer.getText().trim();
        String role = RoleCombo.getSelectedItem().toString();
        String rfid = TxtNomer1.getText().trim();

        if (nama.isEmpty() || username.isEmpty() || password.isEmpty() || nomer.isEmpty() || role.equals("Pilih Role")) {
            JOptionPane.showMessageDialog(this, "Semua field harus diisi dan role harus dipilih!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Long.parseLong(nomer);

            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/kasirkoperasismada", "root", "")) {

                String cekSql = "SELECT * FROM users WHERE Username = ?";
                try (PreparedStatement cekStmt = conn.prepareStatement(cekSql)) {
                    cekStmt.setString(1, username);
                    ResultSet rs = cekStmt.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "Username sudah digunakan!", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }
                }

                // Simpan user baru
                String insertSql = "INSERT INTO users (Nama, Username, Password, No_Telp, Role, RFID) VALUES (?, ?, ?, ?, ?, ?)";
                try (PreparedStatement insertStmt = conn.prepareStatement(insertSql)) {
                    insertStmt.setString(1, nama);
                    insertStmt.setString(2, username);
                    insertStmt.setString(3, password);
                    insertStmt.setString(4, nomer);
                    insertStmt.setString(5, role);
                    insertStmt.setString(6, rfid);
                    insertStmt.executeUpdate();
                }

                JOptionPane.showMessageDialog(this, "User berhasil ditambahkan.");

                // Reset form
                TxtNama.setText("Input Nama");
                TxtUsername.setText("Input Username");
                TxtPassword.setText("Input Password");
                TxtNomer.setText("Input Nomer Telepon");
                RoleCombo.setSelectedIndex(0);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Nomer hanya boleh berisi angka!", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan user: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnTambahActionPerformed

    private void TxtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaActionPerformed

    private void TxtNamaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNamaFocusGained
        if (TxtNama.getText().equals("Input Nama")) {
            TxtNama.setText("");
        }

    }//GEN-LAST:event_TxtNamaFocusGained

    private void TxtNamaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNamaFocusLost
        if (TxtNama.getText().isEmpty()) {
            TxtNama.setText("Input Nama");
        }
    }//GEN-LAST:event_TxtNamaFocusLost

    private void BtnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnKembaliActionPerformed
        Dashboard d = new Dashboard();
        d.setVisible(true);
        d.pack();
        d.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_BtnKembaliActionPerformed

    private void TxtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsernameFocusGained
        if (TxtUsername.getText().equals("Input Username")) {
            TxtUsername.setText("");
        }
    }//GEN-LAST:event_TxtUsernameFocusGained

    private void TxtUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtUsernameFocusLost
        if (TxtUsername.getText().isEmpty()) {
            TxtUsername.setText("Input Username");
        }    }//GEN-LAST:event_TxtUsernameFocusLost

    private void TxtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPasswordFocusGained
        if (TxtPassword.getText().equals("Input Password")) {
            TxtPassword.setText("");
        }    }//GEN-LAST:event_TxtPasswordFocusGained

    private void TxtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPasswordFocusLost
        if (TxtPassword.getText().isEmpty()) {
            TxtPassword.setText("Input Password");
        }    }//GEN-LAST:event_TxtPasswordFocusLost

    private void TxtNomerFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNomerFocusGained
        if (TxtNomer.getText().equals("Input Nomer")) {
            TxtNomer.setText("");
        }
    }//GEN-LAST:event_TxtNomerFocusGained

    private void TxtNomerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNomerFocusLost
        if (TxtNomer.getText().isEmpty()) {
            TxtNomer.setText("Input Nomer");
        }
    }//GEN-LAST:event_TxtNomerFocusLost

    private void TxtNomer1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNomer1FocusGained
        if (TxtNomer1.getText().equals("Input RFID")) {
            TxtNomer1.setText("");
        }    }//GEN-LAST:event_TxtNomer1FocusGained

    private void TxtNomer1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtNomer1FocusLost
        if (TxtNomer1.getText().isEmpty()) {
            TxtNomer1.setText("Input RFID");
        }    }//GEN-LAST:event_TxtNomer1FocusLost

    private void RoleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RoleComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RoleComboActionPerformed

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
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnKembali;
    private javax.swing.JButton BtnTambah;
    private javax.swing.JComboBox<String> RoleCombo;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtNomer;
    private javax.swing.JTextField TxtNomer1;
    private javax.swing.JTextField TxtPassword;
    private javax.swing.JTextField TxtUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel png;
    private javax.swing.JLabel svg;
    // End of variables declaration//GEN-END:variables
}
