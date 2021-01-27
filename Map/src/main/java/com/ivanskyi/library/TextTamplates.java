package com.ivanskyi.library;

public enum TextTamplates {
    GREETING("We are very glad to see you in our library"),
    MAIN_MENU("\nPlease select the feature number which you want to use "
            + "\n1- watch library log, 2 -take book, 3 -get name by date,"
            + " 4- exit"),
    TAKE_BOOK_ITEM("Please write book name, which you want take and press Enter"),
    GET_BOOK_NAME_BY_DATE("For get book name, please write date when"
            + " you did take this book."),
    SEARCH_BOOKS_SUCCESS_RESULT("Below is list which include all"
            + " books ever taken"),
    LOG_WITH_TAKEN_BOOKS_IS_EMPTY("Log with taken books is empty"),
    BOOK_IS_TAKEN("Book is taken"),
    WORD_IN("In "),
    ANSWER_FOR_SEARCH_BOOK_RESULT(" you taken book with name  : ");

    private String text;

    TextTamplates(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
