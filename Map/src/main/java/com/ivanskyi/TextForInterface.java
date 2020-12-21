package com.ivanskyi;

public enum TextForInterface {

    MainMenu("1- watch library log, 2 -take book, 3 -get name by date, 4- exit"),
    takeBookItem("Please write book name"),
    getBookNameByDate("For get book name, please write date when you did take this book.");

    String text;
    TextForInterface(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}