import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CConexion {
    private final String url = "jdbc:postgresql://localhost:5432/parkingdb";
    private final String user = "postgres";
    private final String password = "debian";

    public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insertVehiculo(String tipo, boolean ocupado) {
        String SQL = "INSERT INTO Vehiculos(tipo, ocupado) VALUES(?, ?)";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setString(1, tipo);
            pstmt.setBoolean(2, ocupado);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void updateVehiculo(int id, boolean ocupado) {
        String SQL = "UPDATE Vehiculos SET ocupado = ? WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setBoolean(1, ocupado);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void deleteVehiculo(int id) {
        String SQL = "DELETE FROM Vehiculos WHERE id = ?";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL)) {
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void selectAllVehiculos() {
        String SQL = "SELECT id, tipo, ocupado FROM Vehiculos";

        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(SQL);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                        rs.getString("tipo") + "\t" +
                        rs.getBoolean("ocupado"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
