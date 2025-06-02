package App;

import Form.connect;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.*;

public class DetailTransaksi extends JDialog {

    private JTable tabelDetail;
    private DefaultTableModel model;

    public DetailTransaksi(Frame parent, String idTransaksi) {
        super(parent, "Detail Transaksi - " + idTransaksi, true);
        setSize(700, 400);
        setLocationRelativeTo(parent);
        setLayout(new BorderLayout());

        // Initialize the table model
        model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("ID Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("Subtotal");

        tabelDetail = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(tabelDetail);

        add(scrollPane, BorderLayout.CENTER);
        loadDetailTransaksi(idTransaksi);
    }

    private void loadDetailTransaksi(String idTransaksi) {
        try {
            Connection conn = connect.getConnection(); 
            String sql = "SELECT ID_Barang, Qty, Subtotal FROM detail_transaksi WHERE ID_Transaksi = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, idTransaksi);
            ResultSet rs = pst.executeQuery();

            int no = 1;
            while (rs.next()) {
                // Here, adjust according to the actual names in the 'barang' table
                String idBarang = rs.getString("ID_Barang");
                
                // You may need to execute a second query to get the name of the item
                String namaBarang = getNamaBarang(conn, idBarang);
                double subtotal = rs.getDouble("Subtotal");
                int qty = rs.getInt("Qty");
                
                model.addRow(new Object[]{
                        no++,
                        idBarang,
                        namaBarang,
                        qty,
                        subtotal
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat detail transaksi: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private String getNamaBarang(Connection conn, String idBarang) throws SQLException {
        String namaBarang = "";
        String sql = "SELECT Nama_Barang FROM barang WHERE ID_Barang = ?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, idBarang);
        ResultSet rs = pst.executeQuery();
        if (rs.next()) {
            namaBarang = rs.getString("Nama_Barang");
        }
        
        return namaBarang;
    }
}
