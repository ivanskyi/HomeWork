package com.ivanskiy.rest.repository;

import com.ivanskiy.rest.model.User;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsersRepository {

    static List<User> users;

    static {
        users = new ArrayList<>();
        UsersRepository usersRepository = new UsersRepository();
        User firstUser = new User();
        firstUser.setName("Alex");
        firstUser.setSurname("Makedonskiy");
        firstUser.setLastLoginDate(LocalDate.of(1212, 03, 17));
        firstUser.setEmail("alex@site.com");
        firstUser.addHomeworkToHomeworkToIsDone(HomeworsRepository.INTRO.toString(), false);
        firstUser.addHomeworkToHomeworkToIsDone(HomeworsRepository.ARRAYS.toString(), true);
        usersRepository.addUser(firstUser);

        User secondUser = new User();
        secondUser.setName("Oleh");
        secondUser.setSurname("Ivanskiy");
        secondUser.setLastLoginDate(LocalDate.of(1990, 11, 1));
        secondUser.setEmail("oleh@site.com");
        secondUser.addHomeworkToHomeworkToIsDone(HomeworsRepository.INTRO.toString(), true);
        secondUser.addHomeworkToHomeworkToIsDone(HomeworsRepository.ARRAYS.toString(), false);
        usersRepository.addUser(secondUser);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User getUser(int i) {
        return users.get(0);
    }

    public List<User> getAllUsers() {
        return users;
    }
}
