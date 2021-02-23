package com.ivanskiy.rest.repository;

import com.ivanskiy.rest.repository.entity.User;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDatabase {

    static List<User> usersList;

    static {
        usersList = new ArrayList<>();
        UserDatabase userDatabase = new UserDatabase();
        User secondUser = new User();
        secondUser.setName("Alex");
        secondUser.setSurname("Makedonskiy");
        secondUser.setLastLoginDate(LocalDate.of(1212, 03, 17));
        secondUser.setEmail("alex@site.com");
        secondUser.addHomeworkToHomeworkToIsDone(HomeworkList.INTRO.toString(), false);
        secondUser.addHomeworkToHomeworkToIsDone(HomeworkList.ARRAYS.toString(), true);
        userDatabase.addUser(secondUser);

        User firstUser = new User();
        firstUser.setName("Oleh");
        firstUser.setSurname("Ivanskiy");
        firstUser.setLastLoginDate(LocalDate.of(1990, 11, 1));
        firstUser.setEmail("oleh@site.com");
        firstUser.addHomeworkToHomeworkToIsDone(HomeworkList.INTRO.toString(), true);
        firstUser.addHomeworkToHomeworkToIsDone(HomeworkList.ARRAYS.toString(), false);
        userDatabase.addUser(firstUser);
    }

    public void addUser(User user) {
        usersList.add(user);
    }

    public User getUser(int i) {
        return usersList.get(0);
    }

    public List<User> getAllUsers() {
        return usersList;
    }
}
