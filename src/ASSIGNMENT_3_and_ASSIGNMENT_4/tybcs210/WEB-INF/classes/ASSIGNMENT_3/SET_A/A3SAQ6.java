/*
    Q6: Write a java servlet which accepts a font name and background color from user and display the
    text in specified font with background color.
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class A3SAQ6 extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();

        String fontName = req.getParameter("fontName");
        String background = req.getParameter("background");

        out.println("<html>");
        out.println("<body style='background-color: " + background + "; font-family: " + fontName + ";'>");
        out.println("</body>");
        out.println("</html>");
    }
}