package com.ivanskiy.rest.controller;

import com.ivanskiy.rest.model.User;
import com.ivanskiy.rest.repository.UsersRepository;
import com.ivanskiy.rest.service.user.DefaultUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserController {

    private User user;
    private UsersRepository usersRepository;
    private DefaultUserService defaultUserService;

    public UserController(final User user, final UsersRepository usersRepository,
                          final DefaultUserService defaultUserService) {
        this.user = user;
        this.usersRepository = usersRepository;
        this.defaultUserService = defaultUserService;
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public User getUserInfoByEmail(String email) {
        return defaultUserService.findUserByEmail(email);
    }

    @RequestMapping(value = "/new", method = RequestMethod.POST)
    public ResponseEntity addUser(String name, String surname, String lastLoginDate, String email, String homework) throws IOException {
        return defaultUserService.createUser(name, surname, lastLoginDate, email, homework);
    }
}
