package com.ivanskiy.library.model;

import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Data
public class Author {
    private long id;
    private String fName;
    private String lName;
    private List<Book> books = new ArrayList<>();

    public Author() {
    }

    public Author(long id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public Author(long id, String fName, String lName, Book book) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.books.add(book);
    }

    public void addBook(Book book) {
        this.books.add(book);
    }
}
