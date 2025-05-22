import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class CookieExample extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Cookies Received:</h2>");

        // Safely get and print cookies
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
            for (Cookie c : cookies) {
                String name = c.getName();
                String value = c.getValue();
                out.println("<p>" + name + " = " + value + "</p>");
            }
        } else {
            out.println("<p>No cookies found.</p>");
        }

        // Set a cookie if parameters are provided
        String name = request.getParameter("cookieName");
        String value = request.getParameter("cookieValue");

        if (name != null && !name.trim().isEmpty() && value != null) {
            Cookie c = new Cookie(name, value);
            c.setMaxAge(60 * 60 * 24); // 1 day
            response.addCookie(c);
            out.println("<p>Cookie '" + name + "' set with value '" + value + "'</p>");
        }

        // Form to add new cookies
        out.println("<h3>Add a new cookie:</h3>");
        out.println("<form method='get'>");
        out.println("Name: <input type='text' name='cookieName'><br>");
        out.println("Value: <input type='text' name='cookieValue'><br>");
        out.println("<input type='submit' value='Set Cookie'>");
        out.println("</form>");

        out.println("</body></html>");
        out.close();
    }
}
