package com.ivanskiy.library.controller;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.repository.AuthorRepository;
import com.ivanskiy.library.service.author.DefaultAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    private final AuthorRepository authorRepository;
    private final DefaultAuthorService defaultAuthorService;

    @Autowired
    public AuthorController(final AuthorRepository authorRepository, final DefaultAuthorService defaultAuthorService) {
        this.authorRepository = authorRepository;
        this.defaultAuthorService = defaultAuthorService;
    }

    @RequestMapping(value = ("/create"), method = RequestMethod.GET)
    public int createAuthod(String fName, String lName) {
        return  defaultAuthorService.createAuthor(fName, lName);
    }

    @RequestMapping(value = ("/delete"), method = RequestMethod.GET)
    public int deleteAuthor(int id) {
        return defaultAuthorService.deleteAuthor(id);
    }

    @RequestMapping(value = ("/addBook"), method = RequestMethod.GET)
    public Author addBookToAuthor(int authorID, int bookID) {
        return defaultAuthorService.addBookToAuthor(authorID, bookID);
    }

    @RequestMapping(value = ("/update"), method = RequestMethod.GET)
    public int updateAuthor(int id, String fName, String lName) {
        return defaultAuthorService.updateAuthor(id, fName, lName);
    }
}
