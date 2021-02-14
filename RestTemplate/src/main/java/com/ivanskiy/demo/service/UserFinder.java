package com.ivanskiy.demo.service;

import com.ivanskiy.demo.entity.User;
import com.ivanskiy.demo.storage.SchoolDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserFinder {

    @Autowired
    SchoolDB schoolDB;
    User result;
    public User findUserByEmail(String email) {
        result = null;
        for (int i = 0; i < schoolDB.getAllUsers().size(); i++) {
            if (email.equals(schoolDB.getAllUsers().get(i).getEmail())) {
                System.out.println("We find it ");
                result = schoolDB.getUser(i);
            }
        }
        return result;
    }
}
