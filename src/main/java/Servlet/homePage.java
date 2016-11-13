package Servlet;

import javax.servlet.RequestDispatcher;
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
@WebServlet("/homePage")
public class homePage extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.setAttribute("name", session.getAttribute("name"));
        request.setAttribute("id", session.getAttribute("id"));
        request.setAttribute("Date", session.getAttribute("Date"));
        if(session.getAttribute("authorized")!="ok"){
            response.sendRedirect("/Login");
        }else{
            Boolean bol = (Boolean) session.getAttribute("priority");
            if (bol){
                response.sendRedirect("/admin");
            }else {
                request.getRequestDispatcher("/jsp/homePage.jsp").forward(request, response);
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
