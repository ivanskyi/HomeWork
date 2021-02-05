package com.ivanskyi.club;

import com.ivanskyi.club.commands.SortByPairsAndGrowth;

import java.util.Set;
import java.util.TreeSet;

public class FootballTeam {
    static SortByPairsAndGrowth sortByPairsAndGrowth =
            new SortByPairsAndGrowth();
    static Set<Integer> footballPlayer = new TreeSet<>(sortByPairsAndGrowth);

    public static void startSortFootballPlayer() {
        footballPlayer.add(2);
        footballPlayer.add(1);
        footballPlayer.add(4);
        footballPlayer.add(3);
        footballPlayer.add(5);
        footballPlayer.add(7);
        footballPlayer.add(6);

        System.out.println("Sorted result : ");

        for (Integer number : footballPlayer) {
            System.out.print(number + " ");
        }
    }
}


