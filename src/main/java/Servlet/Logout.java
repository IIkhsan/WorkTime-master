package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * Created by iikhsn on 09.11.16.
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        Cookie loginCookie = new Cookie("loginField", "");
        Cookie passwordCookie = new Cookie("passwordField", "");
        response.addCookie(loginCookie);
        response.addCookie(passwordCookie);
        response.sendRedirect("/Login");
    }
}
