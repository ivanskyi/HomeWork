package com.ivanskiy.springboot.model;

import lombok.*;

@Data
@EqualsAndHashCode
@ToString(exclude = "{age, address}")
public class Person {
    private String name;
    private String secondName;
    private Long age;
    private String address;
}
