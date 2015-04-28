package action;

import DAO.ProductDAO;
import entity.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by mark on 4/28/15.
 */

@WebServlet(name = "ShowProductsController", urlPatterns = "/ShowProducts")
public class ShowProductsController extends HttpServlet {

    private ProductDAO dao = new ProductDAO();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null){
            action = "all";
        }

        System.out.println(action);

        switch (action){
            case "code":
                String code = request.getParameter("code");
                if (code == null){
                    ListAllProduct(request, response);
                }else{
                    ListByCode(code, request, response);
                }
                break;
            case "manu":
                String manu = request.getParameter("manu");
                if (manu == null){
                    ListAllProduct(request, response);
                }else{
                    ListByManu(manu, request, response);
                }
                break;
            case "all":
            default:
                ListAllProduct(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action == null){
            action = "all";
        }

        switch (action){
            case "code":
                String code = request.getParameter("code");
                if (code == null){
                    ListAllProduct(request, response);
                }else{
                    ListByCode(code, request, response);
                }
                break;
            case "manu":
                String manu = request.getParameter("manu");
                if (manu == null){
                    ListAllProduct(request, response);
                }else{
                    ListByManu(manu, request, response);
                }
                break;
            case "all":
            default:
                ListAllProduct(request, response);
                break;
        }

    }

    private void ListAllProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Product> list = dao.getAll();
        request.setAttribute("list", list);
        System.out.println(list.size());
        request.getRequestDispatcher("ProductListView.jsp").forward(request, response);
    }

    private void ListByCode(String _code, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Product> list = dao.getByCode(_code);
        request.setAttribute("list", list);
        System.out.println(list.size());
        request.getRequestDispatcher("ProductListView.jsp").forward(request, response);
    }

    private void ListByManu(String _manu, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Product> list = dao.getByCode(_manu);
        request.setAttribute("list", list);
        System.out.println(list.size());
        request.getRequestDispatcher("ProductListView.jsp").forward(request, response);
    }
}
