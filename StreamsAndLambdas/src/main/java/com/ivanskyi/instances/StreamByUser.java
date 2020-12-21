package com.ivanskyi.instances;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamByUser {

    public static void main(String[] args) {
    List<User> users = buildUserList();
        List<User> userStream = users.stream().filter(user -> user.getLoginDate()<7).collect(Collectors.toList());

for(User user : users){
    System.out.println(user.getLoginDate());
    System.out.println(user.getEmail());
}





        System.out.println(users);


    }

    private static List<User> buildUserList(){
        List<User> users = new ArrayList<>();
        User petro = new User("petrobulba@ukr.net",6,Team.CENTER);
        User nazar = new User("nazarburak@ukr.net",1,Team.LEVANDIVKA);
        User ivan = new User("ivanpetrushka@ukr.net",9,Team.SUHIV);
        users.add(petro);
        users.add(nazar);
        users.add(ivan);
        return users;
    }
}
