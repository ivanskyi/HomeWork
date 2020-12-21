package com.ivanskyi;

import com.ivanskyi.instances.Team;
import com.ivanskyi.instances.User;
import com.ivanskyi.interfaces.Year;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Application{
    public static void main( String[] args ) {


        ///1.Exercise
        Year year = day -> day * 3600;
        System.out.println(year.howManyHoursInYear(365));

        //2 Exercise
        ArrayList<User> visitors = new ArrayList<>();
        User tania = new User("tania@mandyburka.com",7, Team.CENTER);
        User igor = new User("igor@kartoplia.com",3, Team.LEVANDIVKA);
        User olia = new User("tania@barabolia.com",8, Team.SUHIV);
        User nazar = new User("nazar@bylba.com",8, Team.CENTER);
        visitors.add(tania);
        visitors.add(igor);
        visitors.add(olia);
        visitors.add(nazar);


        List<User> namesWhichDoInThisWeek = visitors.stream()
                .flatMap(user -> user.getLoginDate()).filter(a->a<7)
                .collect(Collectors.toList());

        for (User useric : namesWhichDoInThisWeek){
            System.out.println(useric.getEmail());
        }

    }
}
