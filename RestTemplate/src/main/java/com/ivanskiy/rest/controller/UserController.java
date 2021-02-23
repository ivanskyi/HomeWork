package com.ivanskiy.rest.controller;

import com.ivanskiy.rest.repository.entity.User;
import com.ivanskiy.rest.service.SearchForUsers;
import com.ivanskiy.rest.service.UserJSONWriter;
import com.ivanskiy.rest.repository.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@RestController
public class UserController {

    @Autowired
    User user;

    @Autowired
    UserDatabase userDatabase;

    @Autowired
    SearchForUsers searchForUsers;

    @Autowired
    UserJSONWriter userJSONWriter;

    @RequestMapping(value = "find/user/email", method = RequestMethod.GET)
    public User getUserInfoByEmail(String email) {
        return searchForUsers.findUserByEmail(email);
    }

    @RequestMapping(value = "/new/user", method = RequestMethod.GET)
    public int addUser(String name, String surname, String email, String homework) throws IOException {
        return userJSONWriter.createUser(name, surname, email, homework);
    }
}
