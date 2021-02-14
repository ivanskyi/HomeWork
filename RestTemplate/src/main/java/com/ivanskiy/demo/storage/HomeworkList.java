package com.ivanskiy.demo.storage;

public enum HomeworkList {
    INTRO("Intro"),
    ARRAYS("Arrays"),
    OBJECTS("Objects"),
    OOP("OOP"),
    GENERICS("Generics");

    String fullname;

    HomeworkList(String fullname) {
        this.fullname = fullname;
    }
}
