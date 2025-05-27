import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.*;

public class DbAcess extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try{
            String url = "jdbc:mysql://localhost:3306/dbName";
        String user = "user";
        String password = "password";
        Connection conn = DriverManager.getConnection(url, user, password);
        String sql = "SELECT * FROM students";
        Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sql);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        while (result.next()) {
            out.println("<li>ID: " + result.getInt("id") +
            ", Name: " + result.getString("name") +
            ", Age: " + result.getInt("age") + "</li>");

        }
        result.close();
        statement.close();
        conn.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
}
