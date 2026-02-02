/*
    Q1a: Write a servlet program to create a shopping mall. User must be allowed to do purchase from two
    pages. Each page should have a page total. The third page should display a bill, which consists of a
    page total of whatever the purchase has been done and print the total. (Use HttpSession)
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class A3SBQ1a extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        int sum = 0;

        String values[] = req.getParameterValues("item");

        if (values != null) {
            for (int i = 0; i < values.length; i++) {
                sum = sum + Integer.parseInt(values[i]);
            }
        }

        HttpSession hts = req.getSession(true);

        hts.setAttribute("A3SBQ1a", sum);

        res.sendRedirect("A3SBQ1b.html");

    }
}