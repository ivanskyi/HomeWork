package com.ivanskyi;

import java.text.ParseException;

public class Application {

    public static void main(String[] args) throws ParseException {
        Terminal terminal = new Terminal();
        BooksLibrary booksLibrary = new BooksLibrary();

        booksLibrary.takeBook("12-12-2012 21:32:12","Taras Bulba");
        booksLibrary.takeBook("12-12-2012 21:32:14","Postamp");
        booksLibrary.takeBook("12-12-2012 21:32:43","Atlantyda");

        booksLibrary.getLibraryLogs();
        booksLibrary.getBookNameByDate("12-12-2012 21:32:14");
        terminal.start();
    }
}