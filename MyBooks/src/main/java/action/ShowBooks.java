package action;

import DAO.BooksDAO;
import DAO.SourcesDAO;
import entity.Books;
import entity.Sources;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by mark on 4/27/15.
 */

@WebServlet(name = "ShowBooks", urlPatterns = "/ShowBooks")
public class ShowBooks extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if(action == null){
            action = "list";
        }

        if(action.equals("find")){

        }else if (action.equals("author")){

        }else if (action.equals("publisher")){

        }else{
            listAllBooks(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");

        if(action == null){
            action = "list";
        }

        if(action.equals("find")){

        }else if (action.equals("author")){

        }else if (action.equals("publisher")){

        }else{
            listAllBooks(request, response);
        }

    }

    private void listAllBooks(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BooksDAO dao = new BooksDAO();
        SourcesDAO sourcesDAO = new SourcesDAO();
        ArrayList<Books> list = dao.getAllBooks();
        ArrayList<Sources> sources = sourcesDAO.getAllSources();
//        Map<Books, String> list = dao.getAllBooks();
        request.setAttribute("books", list);
        request.setAttribute("source", sources);
        request.getRequestDispatcher("BookList.jsp").forward(request, response);
    }
}
