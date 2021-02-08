package com.ivanskiy.library.database;

import com.ivanskiy.library.service.object.Author;
import java.util.ArrayList;
import java.util.List;

public class AuthorStorage {
    private List<Author> allAuthor = new ArrayList<>();

    public void addAuthor(Author author) {
        allAuthor.add(author);
    }
}
