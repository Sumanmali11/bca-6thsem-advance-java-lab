import java.sql.*;

public class StudentDAO {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(2);
        student.setName("Bob");
        student.setAge(25);

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, student.getId());
            statement.setString(2, student.getName());
            statement.setInt(3, student.getAge());
            int rowsInserted = statement.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
