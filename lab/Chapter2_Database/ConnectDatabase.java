import java.sql.*;

public class ConnectDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbName";
        String user = "user";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the database!");

            // Create a table if it doesn't exist
            Statement stmt = conn.createStatement();
            stmt.execute("CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY, name VARCHAR(50), age INT)");
            System.out.println("Table created or already exists.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
