package com.ivanskiy.springboot.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@EqualsAndHashCode
@ToString(exclude = "{age, address}")
@Slf4j
public class Person {
    private String name;
    private String secondName;
    private Long age;
    private String address;

    public void getNameByAddress(String address) {
        log.info("Person have name {}", name);
    }
}
