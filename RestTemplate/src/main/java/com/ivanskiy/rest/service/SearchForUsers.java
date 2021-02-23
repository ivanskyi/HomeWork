package com.ivanskiy.rest.service;

import com.ivanskiy.rest.repository.entity.User;
import com.ivanskiy.rest.repository.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SearchForUsers {

    @Autowired
    UserDatabase userDatabase;
    User result;

    public User findUserByEmail(String email) {
        result = null;
        for (int i = 0; i < userDatabase.getAllUsers().size(); i++) {
            if (email.equals(userDatabase.getAllUsers().get(i).getEmail())) {
                result = userDatabase.getUser(i);
            }
        }
        return result;
    }
}
