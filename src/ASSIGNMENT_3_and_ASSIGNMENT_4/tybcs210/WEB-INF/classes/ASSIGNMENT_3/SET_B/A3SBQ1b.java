/*
    BQ1b: Write a servlet program to create a shopping mall. User must be allowed to do purchase from two
    pages. Each page should have a page total. The third page should display a bill, which consists of a
    page total of whatever the purchase has been done and print the total. (Use HttpSession)
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class A3SBQ1b extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();

        int sum2 = 0;

        String values[] = req.getParameterValues("item");

        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                sum2 = sum2 + Integer.parseInt(values[i]);
            }
        }

        HttpSession hts = req.getSession();

        int sum1 = ((Integer)hts.getAttribute("A3SBQ1a")).intValue();

        out.println("<html>" + 
                "<title>Summary</title>" +
                "<body>" +
                "<p>Total Of Page 1: " + sum1 + "</p>" +
                "<p>Total Of Page 2: " + sum2 + "</p>");
        
        int total = sum1 + sum2;

        out.println("<p>Total Bill = " + total + "</p>" + 
                    "</body>" + 
                    "</html>");
    }
}