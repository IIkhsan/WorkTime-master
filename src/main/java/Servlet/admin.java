package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by iikhsn on 06.11.16.
 */
@WebServlet("/admin")
public class admin extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getParameter("exit") != null) {
            HttpSession session = request.getSession();
            session.invalidate();
            response.sendRedirect("/Login");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.getAttribute("authorized")!="ok"){
            response.sendRedirect("/Login");
        }else{
            request.getRequestDispatcher("/jsp/adminPage.jsp").forward(request, response);
        }

    }
}
