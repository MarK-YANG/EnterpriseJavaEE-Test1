package com.mark.java.DAO;

import com.mark.java.entity.Books;

import java.util.List;

/**
 * Created by mark on 4/24/15.
 */
public interface BooksDAO {

    public List<Books> getAllBooks();
    public List<Books> getByAuthor(String _author);
    public List<Books> getByPublisher(String _publisher);
    public List<Books> find(String _title);
}
