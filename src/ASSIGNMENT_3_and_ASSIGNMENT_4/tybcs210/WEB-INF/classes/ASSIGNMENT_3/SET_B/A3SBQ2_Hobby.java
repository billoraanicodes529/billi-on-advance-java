/*
    BQ2: Design an HTML page containing 4 option buttons (Painting, Drawing, Singing and swimming) and 2
    buttons reset and submit. When the user clicks submit, the server responds by adding a cookie
    containing the selected hobby and sends a message back to the client. Program should not allow
    duplicate cookies to be written.
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class A3SBQ2_Hobby extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();

        String str = req.getParameter("in");
        Cookie ck[] = req.getCookies();

        if (ck != null) {
            out.println("Existing Cookies Are: <br>");

            for (int i = 0; i < ck.length; i++) {
                String name = ck[i].getName();

                out.println("Name " + name + "<br>");
            }

            for (int i = 0; i < ck.length; i++) {
                if (ck[i].getName().equals("A3SBQ2_Hobby")) {
                    out.println("<br>Cookie Is Present");
                    return;
                }
            }
        }

        Cookie ck1 = new Cookie("A3SBQ2_Hobby", str);

        res.addCookie(ck1);

        out.println("Cookie Created.");
    }
}