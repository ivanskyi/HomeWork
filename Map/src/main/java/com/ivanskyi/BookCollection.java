package com.ivanskyi;

import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BookCollection {
    Map<Date,String> books = new HashMap<>();
    BookDateManager bookDateManager = new BookDateManager();

    public void  addBook(Date date, String nameBook){
        this.books.put(date,nameBook);
     }

     public String getBooks(String dateWhenGetBook) throws ParseException {
        Date date =  bookDateManager.add(dateWhenGetBook);
        Object book =  books.get(date);
        if (book == null){
            return "В цей період часу не було взято жодної книги.";
        }
        return "У цей період часу вами було взято книгу : " + book.toString();
     }
}