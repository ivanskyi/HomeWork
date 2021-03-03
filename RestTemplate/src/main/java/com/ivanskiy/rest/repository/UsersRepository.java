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
        firstUser.addHomeworkToHomeworkToIsDone(HomeworksRepository.INTRO.toString(), false);
        firstUser.addHomeworkToHomeworkToIsDone(HomeworksRepository.ARRAYS.toString(), true);
        usersRepository.addUser(firstUser);

        User secondUser = new User();
        secondUser.setName("Oleh");
        secondUser.setSurname("Ivanskiy");
        secondUser.setLastLoginDate(LocalDate.of(1990, 11, 1));
        secondUser.setEmail("oleh@site.com");
        secondUser.addHomeworkToHomeworkToIsDone(HomeworksRepository.INTRO.toString(), true);
        secondUser.addHomeworkToHomeworkToIsDone(HomeworksRepository.ARRAYS.toString(), false);
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

    public User findUserByEmail(String email) {
        return users.stream()
                .filter(a->a.getEmail().equals(email))
                .findAny()
                .orElse(new User());
    }

}
