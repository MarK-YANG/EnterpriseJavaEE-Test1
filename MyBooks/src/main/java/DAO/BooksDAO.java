package DAO;

import DBUtil.DBUtil;
import entity.Books;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mark on 4/27/15.
 */
public class BooksDAO {

    public ArrayList<Books> getAllBooks(){
        DBUtil util = new DBUtil();
        ArrayList<Books> result = new ArrayList<Books>();
//        Map<Books, String> result = new HashMap<Books, String>();
//        String sql = "SELECT * FROM Books INNER JOIN Sources ON Books.source_numb = Sources.source_numb";
        String sql = "SELECT * FROM Books";
        Connection con = util.getCon();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                Books book = new Books();
                book.setIsbn(rs.getString(1));
                book.setAuthor_name(rs.getString(2));
                book.setTitle(rs.getString(3));
                book.setPublisher_name(rs.getString(4));
                book.setPublication_year(rs.getInt(5));
                book.setBinding(rs.getString(6));
                book.setSource_numb(rs.getInt(7));
                book.setRetail_price(rs.getDouble(8));
                book.setNumber_on_hand(rs.getInt(9));
                //result.put(book, rs.getString("source_name"));
                result.add(book);
            }

            rs.close();
            stmt.close();
            util.closeCon();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;

    }

}
