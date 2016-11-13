package Servlet;

import DataBase.DBWorker;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by iikhsn on 07.11.16.
 */
@WebServlet("/newPerson")
public class newPerson extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String login = request.getParameter("loginField");
        String password = request.getParameter("passwordField");
        String username = request.getParameter("name");
        String userlastname = request.getParameter("lastname");
        String[] priority1 = request.getParameterValues("priority");
        String priority = null;
        if (priority1 != null) {
            for (String s : priority1) {
                priority = s;
            }
        } else {
            priority = "0";
        }
        DBWorker.addInfoDB(login, password, username, userlastname, priority);
        String varTextВ = "NEW PERSON ADDED. Register a new account";
        request.setAttribute("correct", varTextВ);
        request.getRequestDispatcher("/jsp/adminPage.jsp").forward(request, response);
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
