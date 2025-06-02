package App;

import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    
    public Login() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        svg.setIcon(new FlatSVGIcon(getClass().getResource("/Design/Login-Fix (1).svg")));
        user.setIcon(new FlatSVGIcon(getClass().getResource("/Design/user.svg")));
        lock.setIcon(new FlatSVGIcon(getClass().getResource("/Design/lock.svg")));
        
        Username.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                checkRFID();
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
            }

            public void changedUpdate(javax.swing.event.DocumentEvent e) {
            }

            private void checkRFID() {
                String input = Username.getText().trim();
                if (input.matches("^\\d{8,}$")) {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        java.sql.Connection con = DriverManager.getConnection(
                                "jdbc:mysql://localhost:3306/kasirkoperasismada", "root", "");

                        String query = "SELECT * FROM users WHERE rfid = ?";
                        PreparedStatement ps = con.prepareStatement(query);
                        ps.setString(1, input);

                        ResultSet rs = ps.executeQuery();

                        if (rs.next()) {
                            String userFromDB = rs.getString("Username");
                            String passFromDB = rs.getString("Password");

                            Username.setText(userFromDB);
                            TxtPassword.setText(passFromDB);
                        }

                        con.close();
                    } catch (Exception ex) {
                        System.out.println("RFID lookup error: " + ex.getMessage());
                    }
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lock = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Username = new javax.swing.JTextField();
        TxtPassword = new javax.swing.JPasswordField();
        svg = new javax.swing.JLabel();
        png = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lock, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 439, 24, 23));
        getContentPane().add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 372, 29, 29));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 514, 307, 51));

        Username.setBackground(new java.awt.Color(3, 98, 111));
        Username.setFont(new java.awt.Font("Poppins SemiBold", 1, 14)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Username.setAlignmentX(0.0F);
        Username.setAlignmentY(0.0F);
        Username.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                UsernameFocusLost(evt);
            }
        });
        getContentPane().add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 364, 300, 45));

        TxtPassword.setBackground(new java.awt.Color(3, 98, 111));
        TxtPassword.setForeground(new java.awt.Color(255, 255, 255));
        TxtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        TxtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TxtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TxtPasswordFocusLost(evt);
            }
        });
        TxtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(TxtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 429, 300, 45));
        getContentPane().add(svg, new org.netbeans.lib.awtextra.AbsoluteConstraints(1372, 774, -1, -1));

        png.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design/Login-Fix (1).png"))); // NOI18N
        getContentPane().add(png, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String inputUser, password, passDB, roleDB, query;
        int idUserDB;
        String SUrl, SUser, SPass;

        SUrl = "jdbc:mysql://localhost:3306/kasirkoperasismada";
        SUser = "root";
        SPass = "";

        inputUser = Username.getText();
        password = TxtPassword.getText();

        if ("".equals(inputUser)) {
            JOptionPane.showMessageDialog(new JFrame(), "Username atau UID RFID diperlukan", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection(SUrl, SUser, SPass);

            PreparedStatement s;
            ResultSet rs;

            boolean isRFID = inputUser.matches("^\\d{8,}$");
            if (isRFID) {
                query = "SELECT * FROM users WHERE rfid = ?";
                s = con.prepareStatement(query);
                s.setString(1, inputUser);
            } else {
                if ("".equals(password)) {
                    JOptionPane.showMessageDialog(new JFrame(), "Password diperlukan", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                query = "SELECT * FROM users WHERE Username = ?";
                s = con.prepareStatement(query);
                s.setString(1, inputUser);
            }

            rs = s.executeQuery();

            if (rs.next()) {
                passDB = rs.getString("Password");
                roleDB = rs.getString("Role");
                idUserDB = rs.getInt("ID_User");
                String dbUsername = rs.getString("Username");

                boolean loginSuccess = false;

                if (isRFID) {
                    loginSuccess = true;
                    inputUser = dbUsername;
                } else if (password.equals(passDB)) {
                    loginSuccess = true;
                }

                if (loginSuccess) {
                    Session.idUser = idUserDB;
                    Session.username = inputUser;
                    Session.role = roleDB;

                    System.out.println("Login berhasil sebagai: " + Session.role);
                    System.out.println("ID User: " + Session.idUser);

                    if ("admin".equalsIgnoreCase(roleDB)) {
                        Dashboard a = new Dashboard();
                        a.setVisible(true);
                        a.pack();
                        a.setLocationRelativeTo(null);
                    } else if ("kasir".equalsIgnoreCase(roleDB)) {
                        Kasir kasirFrame = new Kasir();
                        kasirFrame.setVisible(true);
                        kasirFrame.pack();
                        kasirFrame.setLocationRelativeTo(null);
                    } else {
                        JOptionPane.showMessageDialog(new JFrame(), "Role tidak dikenali", "Error", JOptionPane.ERROR_MESSAGE);
                        con.close();
                        return;
                    }

                    this.dispose();

                } else {
                    JOptionPane.showMessageDialog(new JFrame(), "Password salah", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(new JFrame(), "Akun tidak ditemukan", "Error", JOptionPane.ERROR_MESSAGE);
            }

            con.close();
            TxtPassword.setText("");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(new JFrame(), "Terjadi kesalahan saat login", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusGained
        if (Username.getText().equals("Username")) {
            Username.setText("");
        }
    }//GEN-LAST:event_UsernameFocusGained

    private void UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsernameFocusLost
        if (Username.getText().isEmpty()) {
            Username.setText("Username");
        }    }//GEN-LAST:event_UsernameFocusLost

    private void TxtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPasswordActionPerformed

    private void TxtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPasswordFocusLost

    }//GEN-LAST:event_TxtPasswordFocusLost

    private void TxtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TxtPasswordFocusGained

    }//GEN-LAST:event_TxtPasswordFocusGained

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TxtPassword;
    private javax.swing.JTextField Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lock;
    private javax.swing.JLabel png;
    private javax.swing.JLabel svg;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
