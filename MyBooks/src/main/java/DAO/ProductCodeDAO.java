package DAO;

import DBUtil.DBUtil;
import entity.Product;
import entity.ProductCode;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Created by mark on 4/28/15.
 */
public class ProductCodeDAO {

    public ArrayList<ProductCode> getAll(){
        DBUtil util = new DBUtil();
        Connection con = util.getCon();
        ArrayList<ProductCode> code = new ArrayList<>();

        String sql = "SELECT * FROM PRODUCT_CODE";
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                ProductCode product = new ProductCode();
                product.setPROD_CODE(rs.getString(1));
                product.setDISCOUNT_CODE(rs.getString(2));
                product.setDESCRIPTION(rs.getString(3));

                code.add(product);
            }

            rs.close();
            stmt.close();
            util.closeCon();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return code;
    }
}
