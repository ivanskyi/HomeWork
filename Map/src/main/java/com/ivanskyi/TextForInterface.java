package com.ivanskyi;

public enum TextForInterface {

    MainMenu("1- watch library log, 2 -take book, 3 -get name by date, 4- exit"),
    takeBookItem("Please write book name");


    String text;
    TextForInterface(String text) {
    this.text = text;
    }

    public String getText() {
        return text;
    }
}
