package com.ivanskyi.cinema;

public class Movie {
    private String name;
    private MovieGenre movieGenre;
    private Double price;

    public Movie(String name, MovieGenre movieGenre, Double price) {
        this.name = name;
        this.movieGenre = movieGenre;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieGenre getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(MovieGenre movieGenre) {
        this.movieGenre = movieGenre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
