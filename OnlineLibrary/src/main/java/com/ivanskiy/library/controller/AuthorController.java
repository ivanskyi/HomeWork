package com.ivanskiy.library.controller;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.repository.AuthorStorage;
import com.ivanskiy.library.service.AuthorFunctional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class AuthorController {
    @Autowired
    private AuthorStorage authorStorage;

    @Autowired
    private AuthorFunctional authorFunctional;

    @RequestMapping(value = ("author/create"), method = RequestMethod.GET)
    public List<Author> createAuthod(int id, String fName, String lName) {
        authorFunctional.createAuthor(id, fName, lName);
        return authorStorage.getAllAuthors();
    }

    @RequestMapping(value = ("author/delete"), method = RequestMethod.GET)
    public List<Author> deleteAuthor(int id) {
        return authorFunctional.removeAuthor(id);
    }

    @RequestMapping(value = ("author/addbook"), method = RequestMethod.GET)
    public List<Author> addBookToAuthor(int authorid, int bookid) {
        return authorFunctional.addBookToAuthor(authorid, bookid);
    }

    @RequestMapping(value = ("author/update"), method = RequestMethod.GET)
    public void updateAuthor(int id, String fName, String lName) {
        authorFunctional.updateAuthor(id, fName, lName);
    }
}
