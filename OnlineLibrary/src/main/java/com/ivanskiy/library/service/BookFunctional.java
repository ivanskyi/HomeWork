package com.ivanskiy.library.service;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.model.Book;
import com.ivanskiy.library.repository.AuthorStorage;
import com.ivanskiy.library.repository.BookStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BookFunctional {

    @Autowired
    private BookStorage bookStorage;

    @Autowired
    private AuthorStorage authorStorage;

    public List<Book> createBook(long id, String title, String genre, String description, int rate) {
        Book book = new Book(id, title, genre, description, rate);
        bookStorage.addBookToStorage(book);
        return bookStorage.getAllBook();
    }

    public List<Book> deleteBook(int id) {
        int index = 0;
        for (int i = 0; i <bookStorage.getAllBook().size(); i++) {
            if(id == bookStorage.getAllBook().get(i).getId()) {
                index = i;
            }
        }
        bookStorage.removeBook(index);
        return bookStorage.getAllBook();
    }

    public List<Book> sortBookByGenre() {
        List<Book> sortedList = bookStorage.getAllBook().stream().sorted((a,b)->a.getGenre().compareTo(b.getGenre())).collect(Collectors.toList());
        return sortedList;
    }

    public List<Author> sortBookByAuthor() {
        List<Author> sortedList = authorStorage.getAllAuthors().stream().sorted((author, author2)->author.getFName().compareTo(author2.getFName())).collect(Collectors.toList());
        return sortedList;
    }

    public List<Book> updateBook(int id, String title,String genre, String description, int rate) {
        Book book = new Book(id,title, genre, description,rate);
        bookStorage.updateBookByIndex(getBookIndexById(id),book);
        return bookStorage.getAllBook();
    }

    public int getBookIndexById(int id) {
        int index = 0 ;
        for (int i = 0; i <bookStorage.getAllBook().size(); i++) {
            if(id == bookStorage.getAllBook().get(i).getId()) {
                index = i;
            }
        }
        return index;
    }
}
