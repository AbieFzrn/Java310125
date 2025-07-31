package mahasiswa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection koneksi;

    public static Connection getConnection() throws SQLException {
        if (koneksi == null || koneksi.isClosed()) {
            try {
                String url = "jdbc:mariadb://localhost:3306/example"; // ganti sesuai DB kamu
                String user = "root";
                String password = "";

                koneksi = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi MariaDB Berhasil!");
            } catch (SQLException e) {
                System.err.println("Koneksi Gagal! " + e.getMessage());
                throw e;
            }
        }
        return koneksi;
    }
}
