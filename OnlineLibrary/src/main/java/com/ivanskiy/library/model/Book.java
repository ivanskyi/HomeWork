package com.ivanskiy.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Book {
    private long id;
    private String title;
    private String genre;
    private String description;
    private int rate;
}
