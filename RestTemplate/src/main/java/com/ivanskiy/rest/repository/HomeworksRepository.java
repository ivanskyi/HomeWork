package com.ivanskiy.rest.repository;

public enum HomeworksRepository {
    INTRO("Intro"),
    ARRAYS("Arrays"),
    OBJECTS("Objects"),
    OOP("OOP"),
    GENERICS("Generics");

    String fullname;

    HomeworksRepository(String fullname) {
        this.fullname = fullname;
    }
}
