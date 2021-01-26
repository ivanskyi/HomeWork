package com.ivanskyi.functional;

import com.ivanskyi.cinema.Movie;
import com.ivanskyi.cinema.MovieGenre;
import com.ivanskyi.interfaces.MergererForNameWithSurname;
import com.ivanskyi.post.PackagingDepartment;
import com.ivanskyi.post.Protector;
import com.ivanskyi.post.Thing;
import com.ivanskyi.post.ThingStatus;
import com.ivanskyi.chat.DateInstance;
import com.ivanskyi.chat.Team;
import com.ivanskyi.chat.User;

import java.util.*;
import java.util.stream.Collectors;

public class RealizatorAllServices {

    public void startRealization() {
        doCustomInterface();
        doVisitorsManager();
        doCinemaSimulator();
        doPostSimulator();
    }

    public void doCustomInterface() {
        MergererForNameWithSurname fullName = (a, b) -> a + " " + b;
        System.out.println("We concatenated name and surname "
                + "use Lambda Expression."
                + " And got this result : "
                + fullName.merge("Jack", "Sunmen") + "\n");
    }

    public void doVisitorsManager() {
        User first = new User("first@user.com",
                new DateInstance("19/01/2021"), Team.URANIAN);
        User second = new User("second@user.com",
                new DateInstance("21/01/2021"), Team.MARSIAN);
        User third = new User("thid@user.com",
                new DateInstance("21/01/2021"), Team.PLUTONIAN);
        User fourth = new User("fourth@user.com",
                new DateInstance("22/01/2021"), Team.URANIAN);
        User fiveth = new User("fiveth@user.com",
                new DateInstance("22/01/2021"), Team.MARSIAN);
        User sixth = new User("sixth@user.com",
                new DateInstance("22/01/2021"), Team.URANIAN);
        User seventh = new User("seventh@user.com",
                new DateInstance("01/01/2021"), Team.URANIAN);

        List<User> users = new ArrayList<>();
        users.add(first);
        users.add(second);
        users.add(third);
        users.add(fourth);
        users.add(fiveth);
        users.add(sixth);
        users.add(seventh);

        Date currentDate = new Date();
        final long qtyMSInFiveDays = 604800000;
        Map<Team, List<User>> recentUsers = users.stream()
                .filter(user -> currentDate.getTime() - user.getLoginDate()
                        .getDate().getTime() < qtyMSInFiveDays)
                .collect(Collectors.groupingBy(User::getTeam));

        System.out.println("Users which loginned in chat not late week ago."
                + " They is grouping by team : ");
        for (Team team : Team.values()) {
            System.out.println("User team : " + team);
            for (User user : recentUsers.get(team)) {
                System.out.println(user.getEmail());
            }
      System.out.println("");
        }
    }

    public void doCinemaSimulator() {
        List<Movie> movies = new ArrayList<>();
        final double lessCostForMovie = 1.99;
        final double middleCostForMovie = 1.99;
        final double highCostForMovie = 1.99;
        movies.add(new Movie("American Factory",
                MovieGenre.DOCUMENTARY_MOVIES, lessCostForMovie));
        movies.add(new Movie("Tell Me Who I Am",
                MovieGenre.DOCUMENTARY_MOVIES, highCostForMovie));
        movies.add(new Movie("A Life On Our Planet",
                MovieGenre.COMEDY_MOVIE, middleCostForMovie));
        movies.add(new Movie("The Big Lebowski",
                MovieGenre.DOCUMENTARY_MOVIES, lessCostForMovie));

        List<Movie> movies2 = new ArrayList<>();
        movies.add(new Movie("Kiss the Ground",
                MovieGenre.DOCUMENTARY_MOVIES, middleCostForMovie));
        movies.add(new Movie("13th",
                MovieGenre.DOCUMENTARY_MOVIES, highCostForMovie));
        movies.add(new Movie("Life Of Brian",
                MovieGenre.DOCUMENTARY_MOVIES, middleCostForMovie));
        movies.add(new Movie("The Hangover",
                MovieGenre.COMEDY_MOVIE, highCostForMovie));

        List<List<Movie>> twoCollections = new ArrayList<>();
        twoCollections.add(movies);
        twoCollections.add(movies2);

        System.out.println("Cinema price list information by movies genre: ");

        for (MovieGenre movieGenre : MovieGenre.values()) {
            Optional<Double> costByAllTickets = twoCollections.stream()
                    .flatMap(List::stream)
                    .filter(a -> a.getMovieGenre() == movieGenre)
                    .map(movie -> movie.getPrice())
                    .reduce((a, b) -> a + b);

            long moviesQuantity = twoCollections.stream()
                    .flatMap(List::stream)
                    .filter(a -> a.getMovieGenre() == movieGenre)
                    .count();

            double middleCostForMovies = costByAllTickets.orElse(0.0)
                    / moviesQuantity;
            System.out.println("Genre " + movieGenre.getName() + " have "
                    + moviesQuantity + " movies. "
                    + "Middle cost for ticket on this genre is "
                    + "$" + middleCostForMovies + ".");
        }
    }

    public void doPostSimulator() {
        PackagingDepartment packagingDepartment = new PackagingDepartment();
        final int qtyThingsInBox = 5;
        List<List<Thing>> fewBox = new ArrayList<>();
        List<Thing> firstBox = packagingDepartment
                .getThingsCollection(qtyThingsInBox);
        List<Thing> secondBox = packagingDepartment
                .getThingsCollection(qtyThingsInBox);
        fewBox.add(firstBox);
        fewBox.add(secondBox);

        List<Protector> fragileThings = fewBox.stream()
                .flatMap(Collection::stream)
                .filter(thing -> thing.getThingStatus() == ThingStatus.FRAGILE)
                .map(thing -> new Protector(thing))
                .collect(Collectors.toList());

        System.out.println("\nOn post service we have boxes. "
                + "Ever box consist with few things."
                + "\nBelow considered full list with protected things.");

       for (Protector protector : fragileThings) {
           System.out.println("Fragile thing which is in protector :"
                   + protector.getThing().getName());
       }
    }
}
