// Q1: Write a Java Servlet to display Hello World.

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class A3SAQ1 extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<h1>Hello World</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
