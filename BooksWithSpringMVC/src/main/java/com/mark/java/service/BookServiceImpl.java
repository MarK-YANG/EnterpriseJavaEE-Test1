package com.mark.java.service;

import com.mark.java.DAO.BooksDAO;
import com.mark.java.DAO.BooksDAOImpl;
import com.mark.java.entity.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mark on 4/24/15.
 */

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BooksDAO booksDAO;

    public List<Books> getAllBooks() {
        return booksDAO.getAllBooks();
    }

    public List<Books> getByAuthor(String _author) {
        return booksDAO.getByAuthor(_author);
    }

    public List<Books> getByPublisher(String _publisher) {
        return booksDAO.getByPublisher(_publisher);
    }

    public List<Books> find(String _title) {
        return booksDAO.find(_title);
    }
}
