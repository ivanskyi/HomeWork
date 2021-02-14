package com.ivanskiy.demo.controller;

import com.ivanskiy.demo.entity.User;
import com.ivanskiy.demo.service.UserJSONSaverer;
import com.ivanskiy.demo.service.UserFinder;
import com.ivanskiy.demo.storage.SchoolDB;
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
    public User getInfoByEmail(String email) {
        System.out.println(userFinder.findUserByEmail(email));
        return userFinder.findUserByEmail(email);
    }

    @RequestMapping(value = "/new/user", method = RequestMethod.GET)
    public int getHomeworks(String name, String surname, String email, String homework) throws IOException {
        return userJSONSaverer.createUser(name, surname, email, homework);
    }
}
