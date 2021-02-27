package com.ivanskiy.rest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import lombok.Data;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

@Repository
@Data
public class User {

    private String name;
    private String surname;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate lastLoginDate;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int accessId;

    private String email;

    public User() {
    }

    public User(String name, String surname,LocalDate lastLoginDate,String email) {
        this.name = name;
        this.surname = surname;
        this.lastLoginDate = lastLoginDate;
        this.email = email;
    }

    @JsonDeserialize()
    Map<String,Boolean> homeworkToIsDone = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(LocalDate lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public int getAccessId() {
        return accessId;
    }

    public void setAccessId(int accessId) {
        this.accessId = accessId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, Boolean> getListOfHomeworkToIsDone() {
        return homeworkToIsDone;
    }

    public void addHomeworkToHomeworkToIsDone(String subject, boolean isDone) {
      homeworkToIsDone.put(subject,isDone);
    }
}
