package com.ivanskiy.rest.service;

import com.ivanskiy.rest.entity.User;
import com.ivanskiy.rest.storage.SchoolDB;
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
                result = schoolDB.getUser(i);
            }
        }
        return result;
    }
}
