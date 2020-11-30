package com.ivanskyi.UIApplication;

import java.text.SimpleDateFormat;
import java.util.*;

public class ListOfBooks {
    Map<Date,String> books = new HashMap<>();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    public void addStandartBookList(){
        books.put(new Date(),"London");
        books.put(new Date(),"Kostenko");
        books.put(new Date(),"Shevchenko");
        books.put(new Date(),"NeMarko");
    }

    public String[] getAllBooks() {
        addStandartBookList();
        String[] booksNames = new String[books.values().size()];
        return booksNames;
    }
}
