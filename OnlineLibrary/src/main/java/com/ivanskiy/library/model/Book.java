package com.ivanskiy.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
    private long id;
    private String title;
    private String genre;
    private String description;
    private int rate;

    public Book() {
    }

    public Book(long id, String title) {
        this.id = id;
        this.title = title;
    }
}
