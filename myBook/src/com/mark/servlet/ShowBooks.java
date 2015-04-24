package com.mark.servlet;

import com.mark.Beans.Books;
import com.mark.DBUtil.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by mark on 4/13/15.
 */
@WebServlet(name = "ShowBooks", urlPatterns = "/ShowBooks")
public class ShowBooks extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "find":
                String title = request.getParameter("title");
                if (title != null) {
                    findBooks(title, request, response);
                } else {
                    listAllBooks(request, response);
                }
                break;
            case "author":
                String author = request.getParameter("author");
                if (author != null) {
                    searchAuthor(author, request, response);
                } else {
                    listAllBooks(request, response);
                }
                break;
            case "publisher":
                String publisher = request.getParameter("publisher");
                if (publisher != null) {
                    searchPublisher(publisher, request, response);
                } else {
                    listAllBooks(request, response);
                }
                break;
            case "list":
            default:
                listAllBooks(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "find":
                String title = request.getParameter("title");
                if (title != null) {
                    findBooks(title, request, response);
                } else {
                    listAllBooks(request, response);
                }
                break;
            case "author":
                String author = request.getParameter("author");
                if (author != null) {
                    searchAuthor(author, request, response);
                } else {
                    listAllBooks(request, response);
                }
                break;
            case "publisher":
                String publisher = request.getParameter("publisher");
                if (publisher != null) {
                    searchPublisher(publisher, request, response);
                } else {
                    listAllBooks(request, response);
                }
                break;
            case "list":
            default:
                listAllBooks(request, response);
                break;
        }
    }

    private void searchPublisher(String publisher, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DBUtil util = new DBUtil();
        Connection connection = util.getCon();
        String sql = "SELECT * FROM Books WHERE publisher_name = ?";
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, publisher);
            ArrayList<Books> books = new ArrayList<>();
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Books myBook = new Books();
                myBook.setIsbn(rs.getString(1));
                myBook.setAuthor_name(rs.getString(2));
                myBook.setTitle(rs.getString(3));
                myBook.setPublisher_name(rs.getString(4));
                myBook.setPublication_year(rs.getInt(5));
                myBook.setBinding(rs.getString(6));
                myBook.setSource_numb(rs.getInt(7));
                myBook.setRetail_price(rs.getDouble(8));
                myBook.setNumber_on_hand(rs.getInt(9));
                books.add(myBook);
            }
            System.out.println(books.size());
            request.setAttribute("books", books);
            request.getRequestDispatcher("BookList.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        util.closeCon();
    }

    private void searchAuthor(String author, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DBUtil util = new DBUtil();
        Connection connection = util.getCon();
        String sql = "SELECT * FROM Books WHERE author_name = ?";
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, author);
            ArrayList<Books> books = new ArrayList<>();
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Books myBook = new Books();
                myBook.setIsbn(rs.getString(1));
                myBook.setAuthor_name(rs.getString(2));
                myBook.setTitle(rs.getString(3));
                myBook.setPublisher_name(rs.getString(4));
                myBook.setPublication_year(rs.getInt(5));
                myBook.setBinding(rs.getString(6));
                myBook.setSource_numb(rs.getInt(7));
                myBook.setRetail_price(rs.getDouble(8));
                myBook.setNumber_on_hand(rs.getInt(9));
                books.add(myBook);
            }

            request.setAttribute("books", books);
            request.getRequestDispatcher("BookList.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        util.closeCon();

    }

    private void findBooks(String title, HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DBUtil util = new DBUtil();
        Connection connection = util.getCon();
        String sql = "SELECT * FROM Books WHERE title LIKE ?";
        ArrayList<Books> books = new ArrayList<>();
        try {
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, "%" + title + "%");

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Books myBook = new Books();
                myBook.setIsbn(rs.getString(1));
                myBook.setAuthor_name(rs.getString(2));
                myBook.setTitle(rs.getString(3));
                myBook.setPublisher_name(rs.getString(4));
                myBook.setPublication_year(rs.getInt(5));
                myBook.setBinding(rs.getString(6));
                myBook.setSource_numb(rs.getInt(7));
                myBook.setRetail_price(rs.getDouble(8));
                myBook.setNumber_on_hand(rs.getInt(9));
                books.add(myBook);
            }

            request.setAttribute("books", books);
            request.getRequestDispatcher("BookList.jsp").forward(request, response);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        util.closeCon();
    }

    private void listAllBooks(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DBUtil util = new DBUtil();
        Connection connection = util.getCon();

        ArrayList<Books> books = new ArrayList<>();

        try {
            Statement stmt = connection.createStatement();
            String sql = "SELECT * FROM Books";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                Books myBook = new Books();
                myBook.setIsbn(rs.getString(1));
                myBook.setAuthor_name(rs.getString(2));
                myBook.setTitle(rs.getString(3));
                myBook.setPublisher_name(rs.getString(4));
                myBook.setPublication_year(rs.getInt(5));
                myBook.setBinding(rs.getString(6));
                myBook.setSource_numb(rs.getInt(7));
                myBook.setRetail_price(rs.getDouble(8));
                myBook.setNumber_on_hand(rs.getInt(9));
                books.add(myBook);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        util.closeCon();

        request.setAttribute("books", books);
        request.getRequestDispatcher("BookList.jsp").forward(request, response);
    }
}
