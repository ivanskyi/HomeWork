package com.ivanskiy.rest.controller;

import com.ivanskiy.rest.model.User;
import com.ivanskiy.rest.service.user.DefaultUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@RestController
@RequestMapping("/user")
public class UserController {

    private final DefaultUserService defaultUserService;

    public UserController(DefaultUserService defaultUserService) {
        this.defaultUserService = defaultUserService;
    }

    @GetMapping("/search")
    @ResponseBody
    public User getUserInfoByEmail(String email) {
        return defaultUserService.findUserByEmail(email);
    }

    @PostMapping("/create")
    @ResponseBody
    public ResponseEntity addUser(@RequestBody User user) throws IOException {
        return defaultUserService.createUser(user);
    }
}
