package com.ivanskiy.library.service.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {
    private long id;
    private String title;
    private String description;
    private int rate;
}

