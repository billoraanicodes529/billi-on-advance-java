/*
    Q5: Write a servlet which counts how many times a user has visited a web page. If the user is visiting the page for the first time,
    display a welcome message. If the user is revisiting the page, display the number of times visited (Use Cookies).
*/

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class A3SAQ5 extends HttpServlet {
    static int i = 0;

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        
        PrintWriter out = res.getWriter();

        String str = String.valueOf(i);
        Cookie ck = new Cookie("visit", str);

        res.addCookie(ck);

        int j = Integer.parseInt(ck.getValue());

        if (j == 1) {
            out.println("Welcome, User");
        } else {
            out.println("You are visiting at [" + i + "] Times");
        }
        i++;
    }

}