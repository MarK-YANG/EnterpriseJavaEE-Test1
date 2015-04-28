package DAO;

import DBUtil.DBUtil;
import entity.Product;
import entity.ProductCode;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by mark on 4/28/15.
 */
public class ProductDAO {

    public ArrayList<Product> getAll(){
        DBUtil util = new DBUtil();
        Connection con = util.getCon();
        ArrayList<Product> result = new ArrayList<>();

        String sql = "SELECT * From PRODUCT";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                Product p = new Product();
                p.setPRODUCT_ID(rs.getInt(1));
                p.setMANUFACTURER_ID(rs.getInt(2));
                p.setPRODUCT_CODE(rs.getString(3));
                p.setPURCHASE_COST(rs.getDouble(4));
                p.setQUANTITY_ON_HAND(rs.getInt(5));
                p.setMARKUP(rs.getDouble(6));
                p.setAVAILABLE(rs.getString(7));
                p.setDESCRIPTION(rs.getString(8));

                result.add(p);
            }

            rs.close();
            stmt.close();
            util.closeCon();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public ArrayList<Product> getByCode(String _code){
        DBUtil util = new DBUtil();
        Connection con = util.getCon();
        ArrayList<Product> result = new ArrayList<>();

        String sql = "SELECT * From PRODUCT WHERE PRODUCT_CODE = ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, _code);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                Product p = new Product();
                p.setPRODUCT_ID(rs.getInt(1));
                p.setMANUFACTURER_ID(rs.getInt(2));
                p.setPRODUCT_CODE(rs.getString(3));
                p.setPURCHASE_COST(rs.getDouble(4));
                p.setQUANTITY_ON_HAND(rs.getInt(5));
                p.setMARKUP(rs.getDouble(6));
                p.setAVAILABLE(rs.getString(7));
                p.setDESCRIPTION(rs.getString(8));

                result.add(p);
            }

            rs.close();
            pstmt.close();
            util.closeCon();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }

    public ArrayList<Product> getByManu(String _manu){
        DBUtil util = new DBUtil();
        Connection con = util.getCon();
        ArrayList<Product> result = new ArrayList<>();

        String sql = "SELECT * From PRODUCT WHERE MANUFACTURER_ID = ?";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, _manu);
            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                Product p = new Product();
                p.setPRODUCT_ID(rs.getInt(1));
                p.setMANUFACTURER_ID(rs.getInt(2));
                p.setPRODUCT_CODE(rs.getString(3));
                p.setPURCHASE_COST(rs.getDouble(4));
                p.setQUANTITY_ON_HAND(rs.getInt(5));
                p.setMARKUP(rs.getDouble(6));
                p.setAVAILABLE(rs.getString(7));
                p.setDESCRIPTION(rs.getString(8));

                result.add(p);
            }

            rs.close();
            pstmt.close();
            util.closeCon();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return result;
    }
}
