package com.ivanskiy.library.service.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Author {
    private long id;
    private String firstName;
    private String secondName;
    private Book book;
}
