package com.ivanskiy.rest.repository;

public enum HomeworsRepository {
    INTRO("Intro"),
    ARRAYS("Arrays"),
    OBJECTS("Objects"),
    OOP("OOP"),
    GENERICS("Generics");

    String fullname;

    HomeworsRepository(String fullname) {
        this.fullname = fullname;
    }
}
