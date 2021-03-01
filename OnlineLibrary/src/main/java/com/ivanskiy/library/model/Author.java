package com.ivanskiy.library.model;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private long id;
    private String fName;
    private String lName;
    private final List<Long> booksId = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public List<Long> getBooksId() {
        return booksId;
    }

    public void addBook(Long book) {
        this.booksId.add(book);
    }
}
