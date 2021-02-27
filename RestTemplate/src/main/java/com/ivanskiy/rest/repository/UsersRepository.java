package com.ivanskiy.rest.repository;

import com.ivanskiy.rest.model.User;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepository {

    static List<User> usersList;

    static {
        usersList = new ArrayList<>();
        UsersRepository usersRepository = new UsersRepository();
        User secondUser = new User();
        secondUser.setName("Alex");
        secondUser.setSurname("Makedonskiy");
        secondUser.setLastLoginDate(LocalDate.of(1212, 03, 17));
        secondUser.setEmail("alex@site.com");
        secondUser.addHomeworkToHomeworkToIsDone(HomeworsRepository.INTRO.toString(), false);
        secondUser.addHomeworkToHomeworkToIsDone(HomeworsRepository.ARRAYS.toString(), true);
        usersRepository.addUser(secondUser);

        User firstUser = new User();
        firstUser.setName("Oleh");
        firstUser.setSurname("Ivanskiy");
        firstUser.setLastLoginDate(LocalDate.of(1990, 11, 1));
        firstUser.setEmail("oleh@site.com");
        firstUser.addHomeworkToHomeworkToIsDone(HomeworsRepository.INTRO.toString(), true);
        firstUser.addHomeworkToHomeworkToIsDone(HomeworsRepository.ARRAYS.toString(), false);
        usersRepository.addUser(firstUser);
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
