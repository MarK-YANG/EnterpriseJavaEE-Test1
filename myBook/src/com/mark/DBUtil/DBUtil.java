package com.mark.DBUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by mark on 4/13/15.
 */
public class DBUtil {

    private final String DB_URL = "jdbc:mysql://localhost:3306/bookstore?useUnicode=true&characterEncoding=utf8";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "yang";
    private Connection con;

    public DBUtil(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
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
}
