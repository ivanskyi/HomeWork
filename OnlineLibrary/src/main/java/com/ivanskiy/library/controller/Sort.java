package com.ivanskiy.library.controller;

import com.ivanskiy.library.database.BookStorage;
import com.ivanskiy.library.service.object.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/sort-book")
public class Sort {
    BookStorage bookStorage = new BookStorage();

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public String sortByAuthor() {
        StringBuffer stringBuffer = new StringBuffer();

        for (Book book : bookStorage.getAllBooks()) {
            stringBuffer.append(book.getTitle());
        }
        return "List with all books: " + stringBuffer.toString();
    }

    @RequestMapping(value = "/genre", method = RequestMethod.GET)
    public String sortByGenre() {
        return "Sorted by Ganre";
    }
}
