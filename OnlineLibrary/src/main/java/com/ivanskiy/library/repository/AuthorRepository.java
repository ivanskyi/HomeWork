package com.ivanskiy.library.repository;

import com.ivanskiy.library.model.Author;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorRepository {

    private List<Author> authors = new ArrayList<>();

    public void createAauthor(Author author) {
        authors.add(author);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void updateAuthor(int index, Author author) {
        authors.set(index, author);
    }

    public void removeAuthor(int index) {
        authors.remove(index);
    }
}
