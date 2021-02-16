package com.ivanskiy.library.model;

import lombok.Data;

@Data
public class Author {
    private long id;
    private String fName;
    private String lName;
    private Book book;

    public Author(long id, String fName, String lName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
    }

    public Author(long id, String fName, String lName, Book book) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.book = book;
    }
}
