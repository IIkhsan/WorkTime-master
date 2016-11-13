package Servlet;

import DataBase.DBWorker;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;


/**
 * Created by iikhsn on 09.10.16.
 */

@WebServlet("/Login")
public class loginPage extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String loginField =  request.getParameter("loginField");
        String passwordField =  request.getParameter("passwordField");


        if (!(loginField == null) & !(passwordField == null)) {
            if (DBWorker.assertUser(loginField, passwordField)){
                HttpSession session = request.getSession();
                session.setAttribute("authorized", "ok"); // положить в сессию что то
                session.setAttribute("login", loginField);
                try {
                    session.setAttribute("Date", DBWorker.registrationDate(loginField));
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                try {
                    session.setAttribute("priority", DBWorker.priority(loginField));
                    session.setAttribute("name", DBWorker.getUserName(loginField));
                    session.setAttribute("id", DBWorker.id(loginField));
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                //Cookie add
                Cookie loginCookie = new Cookie("loginField", loginField);
                Cookie passwordCookie = new Cookie("passwordField", passwordField);

                loginCookie.setMaxAge(60*60*24);
                passwordCookie.setMaxAge(60*60*24);

                response.addCookie(loginCookie);
                response.addCookie(passwordCookie);
                //--Cookie add
                System.out.println("Выполнен вход в учетную запись и в сессию загружена информация");
                response.sendRedirect("/homePage");
            }
            else{
                System.out.println("вход не выполнен");
                String varTextВ = "PLEASE SEND CORRECT PASSWORD/LOGIN";
                request.setAttribute("incorrect", varTextВ);
                request.getRequestDispatcher("/jsp/index.jsp").forward(request,response);
            }
        } else {
            request.getRequestDispatcher("/jsp/index.jsp").forward(request,response);
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if(session.getAttribute("authorized")!="ok"){
            Cookie[] cookies = request.getCookies();

            String loginGo = null;
            for(Cookie cookie : cookies){
                if("loginField".equals(cookie.getName())){
                    loginGo = cookie.getValue();
                }
            }
            String passwordGo = null;
            for(Cookie cookie: cookies){
                if("passwordField".equals(cookie.getName())){
                    passwordGo = cookie.getValue();
                }
            }
            if((!loginGo.equals("")) & (!passwordGo.equals(""))){
                if (DBWorker.assertUser(loginGo, passwordGo)){
                    System.out.println("Выполнен вход в учетную запись и в сессию загружена информация");
                    session = request.getSession();
                    session.setAttribute("authorized", "ok"); // положить в сессию что то
                    session.setAttribute("login", loginGo);
                    try {
                        session.setAttribute("Date", DBWorker.registrationDate(loginGo));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    try {
                        session.setAttribute("priority", DBWorker.priority(loginGo));
                        session.setAttribute("name", DBWorker.getUserName(loginGo));
                        session.setAttribute("id", DBWorker.id(loginGo));
                    } catch (SQLException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                    response.sendRedirect("/homePage");
                }
            }else {
                request.getRequestDispatcher("/jsp/index.jsp").forward(request, response);
            }
        }
        else {
            response.sendRedirect("/homePage");
        }
    }
}
