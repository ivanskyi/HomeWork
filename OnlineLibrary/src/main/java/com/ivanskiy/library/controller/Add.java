package com.ivanskiy.library.controller;

import com.ivanskiy.library.service.MainFunctionalImplementation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/library/add")

public class Add {
    MainFunctionalImplementation mainFunctionalImplementation = new MainFunctionalImplementation();

    @RequestMapping(value = ("book-by-author"), method = RequestMethod.GET)
    public String addBookByAuthor() {
        return mainFunctionalImplementation.addBookToSomeAuthor();
    }
}
