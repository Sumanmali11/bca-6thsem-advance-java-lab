import java.sql.*;

public class UpdateData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbName";
        String user = "user";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Update with prepared statement
            String sql = "UPDATE students SET name = ? WHERE id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Data Update New");
            statement.setInt(2, 2);
            int rowsUpdateed = statement.executeUpdate();

            // Update directly
            String sql1 = "UPDATE students SET name = 'WOW' WHERE id = 4";
            Statement stmt = conn.createStatement();
            stmt.execute(sql1);
            System.out.println(rowsUpdateed + " row(s) updated.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
