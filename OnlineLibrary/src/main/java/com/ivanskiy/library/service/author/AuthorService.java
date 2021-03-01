package com.ivanskiy.library.service.author;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.model.Book;
import java.util.List;

public interface AuthorService {
    Author createAuthor(Author author);
    void deleteAuthor(int id);
    Author updateAuthor(Author author);
    Author addBookToAuthor(int authorId, Book book);
    Author getAuthorById(int id);
    List<Author> getAll();
    Author getById(long id);
}
