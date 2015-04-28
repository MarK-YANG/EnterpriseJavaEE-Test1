package DAO;

import DBUtil.DBUtil;
import entity.Manufacturer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by mark on 4/28/15.
 */
public class ManufacturerDAO {

    public ArrayList<Manufacturer> getAll(){
        DBUtil util = new DBUtil();
        Connection con = util.getCon();
        ArrayList<Manufacturer> manufacturers = new ArrayList<>();

        String sql = "SELECT * FROM MANUFACTURER";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                Manufacturer m = new Manufacturer();
                m.setMANUFACTURER_ID(rs.getInt(1));
                m.setNAME(rs.getString(2));
                m.setADDRESSLINE1(rs.getString(3));
                m.setADDRESSLINE2(rs.getString(4));
                m.setCITY(rs.getString(5));
                m.setSTATE(rs.getString(6));
                m.setZIP(rs.getString(7));
                m.setPHONE(rs.getString(8));
                m.setEMAIL(rs.getString(9));
                m.setREP(rs.getString(10));

                manufacturers.add(m);
            }

            rs.close();
            stmt.close();
            util.closeCon();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return manufacturers;
    }
}
