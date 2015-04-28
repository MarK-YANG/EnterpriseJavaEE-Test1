package DAO;

import DBUtil.DBUtil;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
import entity.Books;
import entity.Sources;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by mark on 4/28/15.
 */
public class SourcesDAO {

    public ArrayList<Sources> getAllSources(){
        DBUtil util = new DBUtil();
        ArrayList<Sources> result = new ArrayList<Sources>();
        String sql = "SELECT * FROM Sources";
        Connection con = util.getCon();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                Sources sources = new Sources();
                sources.setSource_numb(rs.getInt(1));
                sources.setSource_name(rs.getString(2));
                sources.setSource_street(rs.getString(3));
                sources.setSource_city(rs.getString(4));
                sources.setSource_state(rs.getString(5));
                sources.setSource_zip(rs.getString(6));
                sources.setSource_phone(rs.getString(7));
                result.add(sources);
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
