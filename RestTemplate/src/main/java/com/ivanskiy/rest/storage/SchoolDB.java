package com.ivanskiy.rest.storage;

import com.ivanskiy.rest.entity.User;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class SchoolDB {

    static List<User> usersList;

    static {
        usersList = new ArrayList<>();
        SchoolDB schoolDB = new SchoolDB();
        User secondUser = new User();
        secondUser.setName("Alex");
        secondUser.setSurname("Makedonskiy");
        secondUser.setLastLoginDate(LocalDate.of(1212, 03, 17));
        secondUser.setEmail("alex@site.com");
        secondUser.addHomeworkToHomeworkToIsDone(HomeworkList.INTRO.toString(), false);
        secondUser.addHomeworkToHomeworkToIsDone(HomeworkList.ARRAYS.toString(), true);
        schoolDB.addUser(secondUser);

        User firstUser = new User();
        firstUser.setName("Oleh");
        firstUser.setSurname("Ivanskiy");
        firstUser.setLastLoginDate(LocalDate.of(1990, 11, 1));
        firstUser.setEmail("oleh@site.com");
        firstUser.addHomeworkToHomeworkToIsDone(HomeworkList.INTRO.toString(), true);
        firstUser.addHomeworkToHomeworkToIsDone(HomeworkList.ARRAYS.toString(), false);
        schoolDB.addUser(firstUser);
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
