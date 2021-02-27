package com.ivanskiy.rest.service.user;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ivanskiy.rest.model.User;
import com.ivanskiy.rest.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;

@Service
public class DefaultUserService implements UserService {

    private UsersRepository usersRepository;
    private ObjectMapper objectMapper;

    @Autowired
    public DefaultUserService(final UsersRepository usersRepository, final ObjectMapper objectMapper) {
        this.usersRepository = usersRepository;
        this.objectMapper = objectMapper;
    }

    @Override
    public User findUserByEmail(String email) {
        User user = usersRepository.getAllUsers().stream()
                .filter(a->a.getEmail().equals(email))
                .findAny()
                .orElse(new User());
        return user;
    }

    @Override
    public ResponseEntity createUser(String name, String surname, String lastLoginDate,
                                     String email, String homeworkList) throws IOException {

        if(name.length() > 0 && surname.length() > 0 && lastLoginDate.length() > 0 && email.length() > 0) {
            User customUser = new User(name, surname, LocalDate.parse(lastLoginDate), email);
            customUser.addHomeworkToHomeworkToIsDone(homeworkList, true);
            customUser.setAccessId(generateAccessId());
            saveUserinJson(customUser);
            usersRepository.addUser(customUser);
            if (checkIfUserFileIsSaved(customUser)) {
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
