package com.ivanskiy.library.repository;

import com.ivanskiy.library.model.Book;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookStorage {

    private List<Book> allBook = new ArrayList<>();

    public void addBookToStorage(Book book) {
        this.allBook.add(book);
    }

    public List<Book> getAllBook() {
        return allBook;
    }

    public void updateBookByIndex(int id, Book book) {
    allBook.set(id, book);
    }

    public void removeBook(int index) {
        allBook.remove(index);
    }

    public Book getBookByIndex(int index) {
        return allBook.get(index);
    }
}
