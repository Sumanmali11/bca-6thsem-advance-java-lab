import java.sql.*;

public class InsertData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbName";
        String user = "user";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // INsert with prepared statement
            String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, 9);
            statement.setString(2, "David Doe New");
            statement.setInt(3, 22);
            int rowsInserted = statement.executeUpdate();

            // Insert directly
            String sql1 = "INSERT INTO students (id,name,age) VALUES (10,'New', 20)";
            Statement stmt = conn.createStatement();
            stmt.execute(sql1);
            System.out.println(rowsInserted + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
