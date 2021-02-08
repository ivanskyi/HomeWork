package com.ivanskiy.library.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/update")
public class Update {

    @RequestMapping(value = "/book", method = RequestMethod.GET)
    public String updateBook() {
        return "Updated Book";
    }

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public String updateAuthor() {
        return "We updated author";
    }
}
