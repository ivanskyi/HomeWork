package com.ivanskiy.library.service;

import org.springframework.context.annotation.Bean;

public class MainFunctionalImplementation implements MainFunctional{
    @Override
    public String createBook() {
        return null;
    }

    @Override
    public String createAuthor() {
        return null;
    }

    @Override
    public String deleteBook() {
        return null;
    }

    @Override
    public String deleteAuthor() {
        return null;
    }

    @Override
    public String addBookToSomeAuthor() {
        return "We added book to some author";
    }

    @Override
    public String sortBookByAuthor() {
        return null;
    }

    @Override
    public String sortBookByGenre() {
        return null;
    }

    @Override
    public String updateBook() {
        return null;
    }

    @Override
    public String updateAuthor() {
        return null;
    }
}
