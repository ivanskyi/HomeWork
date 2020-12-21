package com.ivanskyi;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BooksLibrary {
    private final Map<Date, String> books = new HashMap<>();
    private final DateManager dateManager = new DateManager();

    public void takeBook(String bookName) {
        books.put(dateManager.getCurrentDate(), bookName);
    }

    public void takeBook(String date, String bookName) throws ParseException {
        Date dateWhenBookTaken = dateManager.getDateByText(date);
        books.put(dateWhenBookTaken,bookName);
    }

    public void getLibraryLogs() {
        takeBook("Bino");
        for (String book : books.values()){
            System.out.println(book);
        }
    }
}










