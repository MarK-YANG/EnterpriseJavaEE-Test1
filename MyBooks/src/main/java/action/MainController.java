package action;

import DAO.ManufacturerDAO;
import DAO.ProductCodeDAO;
import entity.Manufacturer;
import entity.ProductCode;

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

@WebServlet(name = "MainController", urlPatterns = "/MainController")
public class MainController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listMainView(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        listMainView(request, response);
    }

    private void listMainView(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductCodeDAO productCodeDAO = new ProductCodeDAO();
        ManufacturerDAO manufacturerDAO = new ManufacturerDAO();

        ArrayList<ProductCode> codes = productCodeDAO.getAll();
        ArrayList<Manufacturer> manufacturers = manufacturerDAO.getAll();

        request.setAttribute("codes", codes);
        request.setAttribute("manufacturers", manufacturers);

        request.getRequestDispatcher("MainView.jsp").forward(request, response);
    }


}
