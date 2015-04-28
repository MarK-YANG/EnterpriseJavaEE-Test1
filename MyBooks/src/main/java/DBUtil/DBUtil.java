package DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by mark on 4/27/15.
 */
public class DBUtil {

    private final String DB_URL = "jdbc:mysql://localhost:3306/test?useUnicode=true&characterEncoding=utf8";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "yang";
    private final String DB_DRIVER = "com.mysql.jdbc.Driver";


    //conn

    private Connection con;

    public DBUtil(){
        try {
            Class.forName(DB_DRIVER);
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getCon(){
        return con;
    }

    public void closeCon(){
        try {
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        DBUtil util = new DBUtil();

        System.out.println(util.getCon());
    }

}
