// Q3: Write a Java Servlet to accept a user name and greet the user.

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class A3SAQ3 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");

        PrintWriter out = res.getWriter();

        String a = req.getParameter("n1");

        out.println("Hello And Welcome " + a);
    }
}
