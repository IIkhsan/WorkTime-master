package DataBase;

import java.sql.*;
import java.util.Properties;

/**
 * Created by iikhsn on 17.10.16.
 */
public class DBWorker {
    private static final String URL = "jdbc:mysql://localhost:3306/WorkTime";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "djkjulf-1";


    //Проверка соответствия данных пользователя
    public static boolean assertUser(String login, String password) {
        Boolean correct = false;
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(
                    "SELECT login, pass FROM userLoginAndPassword");
            System.out.println("Login and password connection");
            while (rs.next()) {

                if (login.equals(rs.getString("login"))) {
                    System.out.println("Login pass");
                    if (password.equals(rs.getString("pass"))) {
                        correct = true;
                        System.out.println("password pass");
                    }
                    connection.close();

                }

            }
        } catch (SQLException selectException) {
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return correct;
    }
    public static String getUserName(String login) throws SQLException, ClassNotFoundException{
        Connection conn = null;
        Statement stmt = null;
        String name = null;
        conn = DriverManager.getConnection(URL,USERNAME, PASSWORD);
        String sql = "SELECT name, lastname, login FROM userLoginAndPassword";
        stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        while (rs.next()){
            if(rs.getString("login").equals(login)){
                    name = rs.getString("name");
            }
            if(rs.getString("login").equals(login)){
                name += rs.getString("lastname");
            }
        }

        return name;
    }

    public static String id(String login) throws  SQLException, ClassNotFoundException{
        Connection connection = null;
        Statement statement = null;
        String str = null;

        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String sql = "SELECT login, id FROM userLoginANDPassword";
        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            if(rs.getString("login").equals(login)){
                str = rs.getString("id");
            }
        }
        return str;
    }

    public static String registrationDate(String login) throws  SQLException, ClassNotFoundException{
        Connection connection = null;
        Statement statement = null;
        String str = null;

        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String sql = "SELECT login, reqDATE FROM userLoginAndPassword";
        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            if(rs.getString("login").equals(login)){
                str = rs.getString("reqDate");
            }
        }
        return str;
    }


    public static  Boolean priority(String login) throws SQLException, ClassNotFoundException{
        Connection connection = null;
        Statement statement = null;
        Boolean bol = false;

        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        String sql = "SELECT login, priority FROM userLoginAndPassword";
        statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            if(rs.getString("login").equals(login)){
                bol = rs.getBoolean("priority");
            }
        }
        return bol;
    }

    public static void addInfoDB(String login,String password,String username,String userlastname,String priority){
        Connection conn = null;
        Statement stmt = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql = "INSERT INTO userLoginAndPassword VALUES (DEFAULT, '"+ login +"', '"+ password +"', DEFAULT , '"+ priority +"', '"+ username+"', '"+ userlastname +"')";

            stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (Exception e) {
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
