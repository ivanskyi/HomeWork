package com.ivanskiy.library.service;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.repository.AuthorStorage;
import com.ivanskiy.library.repository.BookStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class AuthorFunctional {

    @Autowired
    private AuthorStorage authorStorage;

    @Autowired
    private BookStorage bookStorage;

    @Autowired
    private BookFunctional bookFunctional;

    public void createAuthor(long id, String fName, String lName) {
        Author author = new Author(id, fName, lName);
        authorStorage.createAauthor(author);
    }

    public List<Author> removeAuthor(int id) {
        authorStorage.removeAuthor(getAuthorIndexById(id));
        return authorStorage.getAllAuthors();
    }

    public void updateAuthor(int id, String fName, String lName) {
        Author author = new Author(id, fName, lName);
        authorStorage.updateAuthor(getAuthorIndexById(id), author);
    }

    public List<Author> addBookToAuthor(int author_id, int book_id) {
        Author author = authorStorage.getAuthorByIndex(getAuthorIndexById(author_id));
        author.setBook(bookStorage.getBookByIndex(bookFunctional.getBookIndexById(book_id)));
        authorStorage.updateAuthor(getAuthorIndexById(author_id), author);
        return authorStorage.getAllAuthors();
    }

    public int getAuthorIndexById(int id) {
        int index = 0;
        for (int i = 0; i < authorStorage.getAllAuthors().size(); i++) {
            if (id == authorStorage.getAllAuthors().get(i).getId()) {
                index = i;
            }
        }
        return index;
    }
}
