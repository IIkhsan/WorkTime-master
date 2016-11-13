import DataBase.DBWorker;

import java.sql.SQLException;

/**
 * Created by iikhsn on 06.11.16.
 */
public class test {
    public static void main(String [] args){
        String login = "1";
        try {
            login = DBWorker.id(login);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(login);
    }
}
