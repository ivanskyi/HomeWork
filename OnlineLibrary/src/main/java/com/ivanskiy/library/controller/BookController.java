package com.ivanskiy.library.controller;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.model.Book;
import com.ivanskiy.library.service.BookFunctional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookFunctional bookFunctional;

    @RequestMapping(value = ("book/create"), method = RequestMethod.GET)
    public List<Book> createBook(long id, String title,String genre, String description, int rate) {
        return bookFunctional.createBook(id, title, genre, description, rate);
    }

    @RequestMapping(value = ("book/delete"), method = RequestMethod.GET)
    public List<Book> deleteBook(int id) {
        return bookFunctional.deleteBook(id);
    }

    @RequestMapping(value = ("book/sort/genre"), method = RequestMethod.GET)
    public List<Book> sortBookByGenre() {
        return bookFunctional.sortBookByGenre();
    }

    @RequestMapping(value = ("book/sort/author"), method = RequestMethod.GET)
    public List<Author> sortBookByAuthor() {
        return bookFunctional.sortBookByAuthor();
    }

    @RequestMapping(value = ("book/update"), method = RequestMethod.GET)
    public List<Book> updateBook(int id, String title,String genre, String description, int rate) {
         return bookFunctional.updateBook(id, title, genre, description, rate);
    }
}
