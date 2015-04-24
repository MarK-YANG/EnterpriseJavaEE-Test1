package com.mark.java.controller;

import com.mark.java.entity.Books;
import com.mark.java.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by mark on 4/24/15.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private BookService bookService;

    @RequestMapping("")
    public String index(Model model){
        List<Books> list = bookService.getAllBooks();
        model.addAttribute("books", list);
        return  "BookList";
    }

    @RequestMapping(value = "/find", method = RequestMethod.POST)
    public String find(@RequestParam("title") String title, Model model){
        List<Books> list = bookService.find(title);
        model.addAttribute("books", list);
        return  "BookList";
    }

    @RequestMapping(value = "/author")
    public String author(@RequestParam("author") String author, Model model){
        List<Books> list = bookService.getByAuthor(author);
        model.addAttribute("books", list);
        return  "BookList";
    }

    @RequestMapping(value = "/publisher")
    public String publisher(@RequestParam("publisher") String publisher, Model model){
        List<Books> list = bookService.getByPublisher(publisher);
        model.addAttribute("books", list);
        return  "BookList";
    }

    @RequestMapping("/list")
    public String list(Model model){
        List<Books> list = bookService.getAllBooks();
        model.addAttribute("books", list);
        return  "BookList";
    }
}
