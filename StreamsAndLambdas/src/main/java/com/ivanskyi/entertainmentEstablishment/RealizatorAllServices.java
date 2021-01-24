package com.ivanskyi.entertainmentEstablishment;

import com.ivanskyi.cinema.Movie;
import com.ivanskyi.cinema.MovieGenre;
import com.ivanskyi.customFunctionalInterfaces.MergererForNameWithSurname;
import com.ivanskyi.post.PackagingDepartment;
import com.ivanskyi.post.Protector;
import com.ivanskyi.post.Thing;
import com.ivanskyi.post.ThingStatus;
import com.ivanskyi.webChat.DateInstance;
import com.ivanskyi.webChat.Team;
import com.ivanskyi.webChat.User;

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
                + fullName.merge("Oleh", "Sunmen") + "\n");
    }

    public void doVisitorsManager() {
        User first = new User("first@user.com",
                new DateInstance("19/01/2021"), Team.URANIAN);
        User second = new User("second@user.com",
                new DateInstance("21/01/2021"), Team.MARSIAN);
        User third = new User("thid@user.com",
                new DateInstance("21/01/2021"), Team.PLUTONIAN);
        User fourth = new User("fourth@user.com",
                new DateInstance("01/01/2021"), Team.URANIAN);
        User fiveth = new User("fiveth@user.com",
                new DateInstance("22/01/2021"), Team.MARSIAN);

        List<User> users = new ArrayList<>();
        users.add(first);
        users.add(second);
        users.add(third);
        users.add(fourth);
        users.add(fiveth);

        Date currentDate = new Date();
        final long QTY_MS_IN_FIVE_DAYS = 604800000;
        Map<Team, List<User>> recentUsers = users.stream()
                .filter(user -> currentDate.getTime() - user.getLoginDate()
                        .getDate().getTime() < QTY_MS_IN_FIVE_DAYS)
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
        final double LOW_COST_FOR_MOVIE = 1.99;
        final double MIDDLE_COST_FOR_MOVIE = 1.99;
        final double HIGH_COST_FOR_MOVIE = 1.99;
        movies.add(new Movie("American Factory",
                MovieGenre.DOCUMENTARY_MOVIES, LOW_COST_FOR_MOVIE));
        movies.add(new Movie("Tell Me Who I Am",
                MovieGenre.DOCUMENTARY_MOVIES, HIGH_COST_FOR_MOVIE));
        movies.add(new Movie("A Life On Our Planet",
                MovieGenre.COMEDY_MOVIE, MIDDLE_COST_FOR_MOVIE));
        movies.add(new Movie("The Big Lebowski",
                MovieGenre.DOCUMENTARY_MOVIES, LOW_COST_FOR_MOVIE));

        List<Movie> movies2 = new ArrayList<>();
        movies.add(new Movie("Kiss the Ground",
                MovieGenre.DOCUMENTARY_MOVIES, MIDDLE_COST_FOR_MOVIE));
        movies.add(new Movie("13th",
                MovieGenre.DOCUMENTARY_MOVIES, HIGH_COST_FOR_MOVIE));
        movies.add(new Movie("Life Of Brian",
                MovieGenre.DOCUMENTARY_MOVIES, MIDDLE_COST_FOR_MOVIE));
        movies.add(new Movie("The Hangover",
                MovieGenre.COMEDY_MOVIE, HIGH_COST_FOR_MOVIE));

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
        final int QTY_THINGS_IN_BOX = 5;
        List<List<Thing>> fewBox = new ArrayList<>();
        List<Thing> firstBox = packagingDepartment
                .getThingsCollection(QTY_THINGS_IN_BOX);
        List<Thing> secondBox = packagingDepartment
                .getThingsCollection(QTY_THINGS_IN_BOX);
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
