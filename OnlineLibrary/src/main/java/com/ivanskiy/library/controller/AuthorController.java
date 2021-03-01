package com.ivanskiy.library.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.model.Book;
import com.ivanskiy.library.service.author.DefaultAuthorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    private final DefaultAuthorService defaultAuthorService;

    public AuthorController(DefaultAuthorService defaultAuthorService) {
        this.defaultAuthorService = defaultAuthorService;
    }

    @PostMapping("/create")
    public Author createAuthor(@RequestBody Author author) {
        return defaultAuthorService.createAuthor(author);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAuthor(@PathVariable int id) {
        defaultAuthorService.deleteAuthor(id);
        return "Author with id: " + id + " is successfully deleted";
    }

    @GetMapping("/getById/{id}")
    public Author getById(@PathVariable long id) {
        return defaultAuthorService.getById(id);
    }

    @PutMapping("/update")
    public Author updateAuthor(@RequestBody Author author) {
        return defaultAuthorService.updateAuthor(author);
    }

    @PostMapping("/addBook/{id}")
    public Author addBookToAuthor(@RequestBody ObjectNode json) throws JsonProcessingException {
        Book book = new ObjectMapper().readValue(json.get("book").toString(), Book.class);
        return defaultAuthorService.addBookToAuthor(json.get("authorID").asInt(), book);
    }

    @GetMapping("/getAll")
    public List<Author> getAll() {
        return defaultAuthorService.getAll();
    }
}
