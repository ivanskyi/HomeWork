package com.ivanskiy.library.controller;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.model.Book;
import com.ivanskiy.library.service.book.DefaultBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final DefaultBookService defaultBookService;

    @Autowired
    public BookController(final DefaultBookService defaultBookService) {
        this.defaultBookService = defaultBookService;
    }

    @RequestMapping(value = ("/create"), method = RequestMethod.GET)
    public int createBook(String title,String genre, String description, int rate) {
        return defaultBookService.createBook(title, genre, description, rate);
    }

    @RequestMapping(value = ("/delete"), method = RequestMethod.GET)
    public List<Book> deleteBook(int id) {
        return defaultBookService.deleteBook(id);
    }

    @RequestMapping(value = ("/sort/genre"), method = RequestMethod.GET)
    public List<Book> sortBookByGenre() {
        return defaultBookService.sortBookByGenre();
    }

    @RequestMapping(value = ("/sort/author"), method = RequestMethod.GET)
    public List<Author> sortBookByAuthor() {
        return defaultBookService.sortBookByAuthor();
    }

    @RequestMapping(value = ("/update"), method = RequestMethod.GET)
    public int updateBook(int id, String title,String genre, String description, int rate) {
        return defaultBookService.updateBook(id, title, genre, description, rate);
    }
}
