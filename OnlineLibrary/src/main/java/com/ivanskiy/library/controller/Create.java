package com.ivanskiy.library.controller;

import com.ivanskiy.library.database.BookStorage;
import com.ivanskiy.library.service.object.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/create")
public class Create {

    BookStorage bookStorage = new BookStorage();

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String createBook(long id, String title, String description, int rate) {
        Book book = new Book(id, title,description,rate);
        bookStorage.addBook(book);

        for (Book books : bookStorage.getAllBooks()) {
            System.out.println(books.getTitle());
        }

        return "We got data for create book. This book must have"
                + " \nID: " + book.getId() + ","
                + " \nTitle: " + book.getTitle() + ","
                + " \nDescription: " + book.getDescription() + ","
                + " \nRate: " + book.getRate();
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public String createAuthor() {
        return "We create author";
    }
}
