import java.io.*;
import jakarta.servlet.*;

public class GenericServlet implements Servlet {

    private ServletConfig config;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
        System.out.println("GenericServlet  initialized");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h2>This is a basic Servlet using the generic Servlet interface.</h2>");
    }

    @Override
    public String getServletInfo() {
        return "GenericServletExample";
    }

    @Override
    public void destroy() {
        System.out.println("GenericServletExample destroyed");
    }
}
