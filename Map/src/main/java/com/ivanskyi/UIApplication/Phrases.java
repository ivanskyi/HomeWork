package com.ivanskyi.UIApplication;

public enum Phrases {

    CHOICEBOOK("Please choice Book which you want take"),
    TAKETHISBOOKNOW("Take this book NOW"),
    YEAR("Put Year"),
    MONTH("Put month"),
    DAY("Put day"),
    TOOKBOOK("Please write date for know which book you took in this date"),
    GETBOOKNAMEBYDATA("Get book name"),
    BOOKTAKERESULT("Today you don't take any book"),
    RESULTSEARCH("SEARCH RESULT");
    String text;

    Phrases(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
