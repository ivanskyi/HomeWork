package com.ivanskyi;

import java.text.ParseException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws ParseException {

        BookCollection bookCollection = new BookCollection();
        BookDateManager bookDateManager = new BookDateManager();

        bookCollection.addBook(bookDateManager.add("2020-05-04"),"Martin Iden");
        bookCollection.addBook(bookDateManager.add("2016-07-25"),"Giperion");
        bookCollection.addBook(bookDateManager.add("2018-03-19"),"Hobbit");
        bookCollection.addBook(bookDateManager.add("2019-06-06"),"Пригоди Франчішко або як зробити із нічого муляж жирафа");

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введіть дату коли ви брали книгу. Дату слід прописати відповідно до шаблону [Рік-Місяць-День]");
        String dateFromScanner = myScanner.nextLine();
        System.out.println(bookCollection.getBooks(dateFromScanner));
    }
}