// Q2: Write a Java Servlet to accept two numbers from user and perform their addition

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class A3SAQ2 extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        int a = Integer.parseInt(req.getParameter("n1"));
        int b = Integer.parseInt(req.getParameter("n2"));

        int sum = (a + b);
        out.println("<h1>Sum is: " + sum + "</h1>");
    }
}
