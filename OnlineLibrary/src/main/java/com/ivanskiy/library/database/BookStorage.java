package com.ivanskiy.library.database;

import com.ivanskiy.library.service.object.Book;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
public class BookStorage {
    private  final List<Book> allBooks = new ArrayList<>();

    public void addBook(Book book) {
        allBooks.add(book);
    }

    public List<Book> getAllBooks() {
        return allBooks;
    }
}
