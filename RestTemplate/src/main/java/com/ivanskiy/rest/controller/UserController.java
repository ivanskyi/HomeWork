package com.ivanskiy.rest.controller;

import com.ivanskiy.rest.entity.User;
import com.ivanskiy.rest.service.UserFinder;
import com.ivanskiy.rest.service.UserJSONSaverer;
import com.ivanskiy.rest.storage.SchoolDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@RestController
public class UserController {

    @Autowired
    User user;

    @Autowired
    SchoolDB schoolDB;

    @Autowired
    UserFinder userFinder;

    @Autowired
    UserJSONSaverer userJSONSaverer;

    @RequestMapping(value = "find/user/email", method = RequestMethod.GET)
    public User getUserInfoByEmail(String email) {
        return userFinder.findUserByEmail(email);
    }

    @RequestMapping(value = "/new/user", method = RequestMethod.GET)
    public int addUser(String name, String surname, String email, String homework) throws IOException {
        return userJSONSaverer.createUser(name, surname, email, homework);
    }
}
