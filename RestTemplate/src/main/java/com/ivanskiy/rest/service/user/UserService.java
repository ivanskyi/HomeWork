package com.ivanskiy.rest.service.user;

import com.ivanskiy.rest.model.User;
import org.springframework.http.ResponseEntity;
import java.io.IOException;

public interface UserService {
    User findUserByEmail(String email);

    ResponseEntity createUser(User user) throws IOException;

    int generateAccessId();

    void saveUserinJson(User user) throws IOException;

    boolean checkIfUserFileIsSaved(User user) throws IOException;
}
