package com.ivanskiy.rest.service.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivanskiy.rest.model.User;
import com.ivanskiy.rest.repository.UsersRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

@Service
public class DefaultUserService implements UserService {

    private final UsersRepository usersRepository;
    private final ObjectMapper objectMapper;

    public DefaultUserService(UsersRepository usersRepository, ObjectMapper objectMapper) {
        this.usersRepository = usersRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public User findUserByEmail(String email) {
        return usersRepository.findUserByEmail(email);
    }

    @Override
    public ResponseEntity createUser(User user) throws IOException {
        if(user.getName() != null && user.getSurname() != null) {
            user.setAccessId(generateAccessId());
            saveUserinJson(user);
            usersRepository.addUser(user);
            if (checkIfUserFileIsSaved(user)) {
                return new ResponseEntity(HttpStatus.OK);
            } else {
                return new ResponseEntity(HttpStatus.METHOD_NOT_ALLOWED);
            }
        } else {
            return new ResponseEntity(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @Override
    public int generateAccessId() {
        Random random = new Random();
        int randomAccessId = Math.abs(random.nextInt());
        boolean existID = usersRepository.getAllUsers().stream()
                .anyMatch(n -> n.getAccessId() == randomAccessId);
        return existID ? generateAccessId() : randomAccessId;
    }

    @Override
    public void saveUserinJson(User user) throws IOException {
        String filePath = "target/" + user.getName() + "file.json";
        objectMapper.writeValue(new FileOutputStream(filePath), user);
    }

    @Override
    public boolean checkIfUserFileIsSaved(User user) throws IOException {
        String filePath = "target/" + user.getName() + "file.json";
        User userCopy = objectMapper.readValue(new FileInputStream(filePath), User.class);
        if (user.getName().equals(userCopy.getName())) {
            return true;
        } else {
            return false;
        }
    }
}
