package com.ivanskyi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws ParseException {
       Terminal terminal = new Terminal();
       BooksLibrary booksLibrary = new BooksLibrary();
        booksLibrary.takeBook("12-12-2012 21:32:12","Lito");
        booksLibrary.takeBook("12-12-2012 21:32:14","PEs");
        booksLibrary.takeBook("12-12-2012 21:32:43","Kit");

        booksLibrary.getLibraryLogs();
/// add some book





        terminal.start();
    }
}