package com.ivanskiy.library.service.author;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.repository.AuthorRepository;
import com.ivanskiy.library.repository.BookRepository;
import com.ivanskiy.library.service.book.DefaultBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultAuthorService implements AuthorService {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private DefaultBookService defaultBookService;

    @Autowired
    public DefaultAuthorService(final AuthorRepository authorRepository, final BookRepository bookRepository, final DefaultBookService defaultBookService) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.defaultBookService = defaultBookService;
    }

    @Override
    public int createAuthor(String fName, String lName) {
        Author author = new Author(generateId(), fName, lName);
        authorRepository.createAauthor(author);
        if(authorRepository.getAuthors().contains(author)) {
            return 201;
        } else {
            return 503;
        }
    }

    @Override
    public int deleteAuthor(int id) {
        if(existAuthor(id)) {
            authorRepository.removeAuthor(getAuthorIndexById(id));
            return 200;
        } else {
            return 204;
        }
    }

    @Override
    public int updateAuthor(int id, String fName, String lName) {
        Author author = new Author(id, fName, lName);
        if(existAuthor(id)) {
            authorRepository.updateAuthor(getAuthorIndexById(id), author);
            return 200;
        } else {
            return 501;
        }
    }

    @Override
    public boolean existAuthor(int id) {
        boolean status = false;
        for(Author author : authorRepository.getAuthors()) {
            if(author.getId() == id) {
                status = true;
            } else {
                status =  false;
            }
        }
        return status;
    }

    @Override
    public Author addBookToAuthor(int author_id, int book_id) {
        Author author = getAuthorById(author_id);
        author.addBook(bookRepository.getBookByIndex(defaultBookService.getBookIndexById(book_id)));
        authorRepository.updateAuthor(getAuthorIndexById(author_id), author);
        return author;
    }

    @Override
    public int getAuthorIndexById(int id) {
        int index = 0;
        try {
            for (int i = 0; i < authorRepository.getAuthors().size(); i++) {
                if (id == authorRepository.getAuthors().get(i).getId()) {
                    index = i;
                }
            }
            return index;
        } catch (IndexOutOfBoundsException exception) {
            return 0;
        }
    }

    @Override
    public Author getAuthorById(int id) {
        Author author = null;
        for(Author someAuthor : authorRepository.getAuthors()) {
            if (someAuthor.getId() == id) {
                return someAuthor;
            }
        }
        return null;
    }

    @Override
    public int generateId() {
        int  freeId = 1;
        for (Author author : authorRepository.getAuthors()) {
            if (author.getId() == freeId) {
                freeId ++;
            }
        }
        return freeId;
    }
}
