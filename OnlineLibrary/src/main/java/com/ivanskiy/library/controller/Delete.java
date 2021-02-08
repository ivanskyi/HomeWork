package com.ivanskiy.library.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/delete")
public class Delete {

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String deleteBook() {
        return "We deleted book";
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public String deleteAuthor() {
        return "Deleted author";
    }
}
