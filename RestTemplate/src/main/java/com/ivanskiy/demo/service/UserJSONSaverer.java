package com.ivanskiy.demo.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivanskiy.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

@Component
public class UserJSONSaverer {

    @Autowired
    ObjectMapper objectMapper;

    public int createUser(String name, String surname, String email, String homeworkList) throws IOException {
        User customUser = new User();
        customUser.setName(name);
        customUser.setSurname(surname);
        customUser.setEmail(email);
        customUser.addHomeworkToHomeworkToIsDone(homeworkList, true);
        customUser.setAccessId(generateAccessId());
        saveUserinJson(customUser);
        return checkIfUserFileIsSaved(customUser);
    }

    public int generateAccessId() {
        Random random = new Random();
        return random.nextInt(100);
    }

    public void saveUserinJson(User user) throws IOException {
        String filePath = "target/" + user.getName() + "file.json";
        objectMapper.writeValue(new FileOutputStream(filePath), user);
    }

    public int checkIfUserFileIsSaved(User user) throws IOException {
        String filePath = "target/" + user.getName() + "file.json";
       User userCopy = objectMapper.readValue(new FileInputStream(filePath), User.class);
       if(user.getName().equals(userCopy.getName())) {
           return 200;
        } else {
           return 0;
       }
    }
}
