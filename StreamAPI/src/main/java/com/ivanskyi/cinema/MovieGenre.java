package com.ivanskyi.cinema;

public enum MovieGenre {
    DOCUMENTARY_MOVIES("Documentary"),
    COMEDY_MOVIE("Comedy");

    String name;

    MovieGenre(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
