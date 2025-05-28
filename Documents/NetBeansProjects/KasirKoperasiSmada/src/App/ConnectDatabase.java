
package App;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDatabase {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/kasirkoperasismada";
        String user = "root";
        String password = "";

        try {
            // Memuat driver MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Membuka koneksi
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi Berhasil!");

            // Tutup koneksi
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Koneksi gagal: " + e.getMessage());
        }
    }
}

