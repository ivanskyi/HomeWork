package com.ivanskiy.library.controller;

import com.ivanskiy.library.database.BookStorage;
import com.ivanskiy.library.service.MainFunctionalImplementation;
import com.ivanskiy.library.service.object.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    MainFunctionalImplementation mainFunctionalImplementation;

    @Autowired
    BookStorage bookStorage;
@GetMapping ("/sort")
    @RequestMapping(value = ("book-by-author"), method = RequestMethod.GET)
    public String addBookByAuthor() {
        return mainFunctionalImplementation.addBookToSomeAuthor();
    }


    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public List<Book> createBook(long id, String title, String description, int rate) {
        Book book = new Book(id, title,description,rate);
        bookStorage.addBook(book);

        for (Book books : bookStorage.getAllBooks()) {
            System.out.println(books.getTitle());
        }
        return bookStorage.getAllBooks();
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public String createAuthor() {
        return "We create author";
    }


    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String deleteBook() {
        return "We deleted book";
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public String deleteAuthor() {
        return "Deleted author";
    }


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

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String updateBook() {
        return "Updated Book";
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public String updateAuthor() {
        return "We updated author";
    }


}
