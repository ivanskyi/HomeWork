package com.ivanskiy.library.service.author;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.model.Book;
import com.ivanskiy.library.repository.AuthorRepository;
import com.ivanskiy.library.repository.BookRepository;
import com.ivanskiy.library.service.book.DefaultBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class DefaultAuthorService implements AuthorService {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final DefaultBookService defaultBookService;

    @Autowired
    public DefaultAuthorService(AuthorRepository authorRepository, BookRepository bookRepository,
                                DefaultBookService defaultBookService) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.defaultBookService = defaultBookService;
    }

    @Override
    public Author createAuthor(Author author) {
        return authorRepository.createAuthor(author);
    }

    @Override
    public void deleteAuthor(int id) {
        authorRepository.removeAuthor(id);
    }

    @Override
    public Author updateAuthor(Author author) {
        return authorRepository.updateAuthor(author);
    }

    @Override
    public Author addBookToAuthor(int authorId, Book book) {
        Author author = getAuthorById(authorId);
        long newBookId = bookRepository.createBook(book).getId();
        author.addBook(newBookId);
        authorRepository.updateAuthor(author);
        return author;
    }

    @Override
    public Author getAuthorById(int id) {
        for(Author someAuthor : authorRepository.getAuthors()) {
            if (someAuthor.getId() == id) {
                return someAuthor;
            }
        }
        return null;
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.getAuthors();
    }

    @Override
    public Author getById(long id) {
        return authorRepository.getById(id);
    }
}
