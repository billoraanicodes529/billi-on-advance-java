/*
    BQ3: Write a java servlet which accept seat number,name of student and college name and display the same.
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class A3SBQ3_College extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();

        String seat = req.getParameter("n1");
        String name = req.getParameter("n2");
        String clgName = req.getParameter("n3");

        out.println("Seat Number is: " + seat + "<br>");
        out.println("Name is: " + name + "<br>");
        out.println("College Name is: " + clgName + "<br>");
    }
}
