package com.ivanskiy.library.repository;

import com.ivanskiy.library.model.Book;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookRepository {
    private static int id = 1;
    private final List<Book> books = new ArrayList<>();

    public Book createBook(Book book) {
        book.setId(id++);
        this.books.add(book);
        return book;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book updateBook(Book newBook) {
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getId() == newBook.getId()) {
                books.set(i,newBook);
            }
        }
        return newBook;
    }

    public void deleteBook(int id) {
        books.removeIf(book -> book.getId() == id);
    }

    public Book getBookByIndex(int index) {
        return books.get(index);
    }
}
