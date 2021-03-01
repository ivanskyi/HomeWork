package com.ivanskiy.library.repository;

import com.ivanskiy.library.model.Author;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorRepository {
    private static int id = 1;

    private final List<Author> authors = new ArrayList<>();

    public Author createAuthor(Author author) {
        author.setId(id++);
        authors.add(author);
        return author;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Author updateAuthor(Author newAuthor) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getId() == newAuthor.getId()) {
                authors.set(i, newAuthor);
            }
        }
        return newAuthor;
    }

    public void removeAuthor(int id) {
        authors.removeIf(author -> author.getId() == id);
    }

    public Author getById(long id) {
        return authors.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("Author with id: " + id + " not found"));
    }
}
