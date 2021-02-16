package com.ivanskiy.library.repository;

import com.ivanskiy.library.model.Author;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorStorage {

    private List<Author> allAuthors = new ArrayList<>();

    public void createAauthor(Author author) {
        allAuthors.add(author);
    }

    public List<Author> getAllAuthors() {
        return allAuthors;
    }

    public void updateAuthor(int index, Author author) {
        allAuthors.set(index, author);
    }

    public void removeAuthor(int index) {
        allAuthors.remove(index);
    }

    public Author getAuthorByIndex(int index) {
        return allAuthors.get(index);
    }
}
