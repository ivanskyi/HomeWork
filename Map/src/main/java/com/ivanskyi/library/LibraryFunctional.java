package com.ivanskyi.library;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class LibraryFunctional {

    private final Map<Date, String> books = new HashMap<>();
    private final DateManager dateManager = new DateManager();

    public void takeBook(String bookName) {
        Date date = new Date();
        String currentDateWithoutSecond = dateManager
                .getDateInTextViewWithoutSecond(date);
        Date dateWhenBookTaken = dateManager
                .getDateHowText(currentDateWithoutSecond);
        books.put(dateWhenBookTaken, bookName);
    }

    public void takeBook(String date, String bookName) {
        Date dateWhenBookTaken = dateManager.getDateHowText(date);
        books.put(dateWhenBookTaken, bookName);
    }

    public void watchLogsWithTakenBooks() {
        System.out.println(TextTamplates.SEARCH_BOOKS_SUCCESS_RESULT.getText());
        int count = 1;
        for (Date date : books.keySet()) {
            System.out.println(count++ + ". " + books.get(date)
                    + " - " + dateManager.getDateInTextViewWithSecond(date));
        }
    }

    public String getBookNameByDate(String date) {
        Date dateWhenBookWasTaken = dateManager.getDateHowText(date);
        try {
            return books.get(dateWhenBookWasTaken)
                    .isEmpty() ? TextTamplates.LOG_WITH_TAKEN_BOOKS_IS_EMPTY
                    .getText() : books.get(dateWhenBookWasTaken);
        } catch (NullPointerException e) {
            System.out.println(TextTamplates.NOT_FOUND_BOOK_BY_DATE_ERROR
                    .getText());
            return null;
        }
    }
}
