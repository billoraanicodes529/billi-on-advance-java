/*
Q4: Design a servlet that provides information about a HTTP request from a client, such as IP address and browser type. The Servlet
also provides information about server on which the servlet is running, such as the operating system type, and the names of currently
loaded servlets.
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class A3SAQ4 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        out.println("<html>");
        out.println("<body>");
        out.println("<b>Server Name: " + req.getServerName() + "</b><br>");
        out.println("<b>Remote Address: " + req.getRemoteAddr() + "</b><br>");
        out.println("<b>Remote User: " + req.getRemoteUser() + "</b><br>");
        out.println("<b>Server Port: " + req.getServerPort() + "</b><br>");
        out.println("<b>Remote Host: " + req.getRemoteHost() + "</b><br>");
        out.println("<b>Local Name: " + req.getLocalName() + "</b><br>");
        out.println("<b>Servlet Name: " + this.getServletName() + "</b><br>");
        out.println("</body>");
        out.println("</html>");
    }
}
