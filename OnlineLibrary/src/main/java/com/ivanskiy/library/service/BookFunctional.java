package com.ivanskiy.library.service;

import com.ivanskiy.library.model.Book;
import com.ivanskiy.library.repository.BookStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class BookFunctional {

    @Autowired
    private BookStorage bookStorage;

    public List<Book> createBook(long id, String title, String description, int rate) {
        Book book = new Book(id, title, description, rate);
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
        return bookStorage.getAllBook();
    }

    public List<Book> sortBookByAuthor() {
        return bookStorage.getAllBook();
    }

    public List<Book> updateBook(int id, String title, String description, int rate) {
        Book book = new Book(id,title,description,rate);
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
