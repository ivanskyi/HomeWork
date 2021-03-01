package com.ivanskiy.library.controller;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.model.Book;
import com.ivanskiy.library.service.book.DefaultBookService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    private final DefaultBookService defaultBookService;

    public BookController(DefaultBookService defaultBookService) {
        this.defaultBookService = defaultBookService;
    }

    @PostMapping("/create")
    public Book createBook(@RequestBody Book book) {
        return defaultBookService.createBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable int id) {
        defaultBookService.deleteBook(id);
    }

    @GetMapping("/getAll")
    public List<Book> getAll() {
        return defaultBookService.getAll();
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book) {
        return defaultBookService.updateBook(book);
    }

    @GetMapping("/sort/genre")
    public List<Book> sortBookByGenre() {
        return defaultBookService.sortBookByGenre();
    }

    @GetMapping("/sort/author")
    public List<Author> sortBookByAuthor() {
        return defaultBookService.sortBookByAuthor();
    }
}
