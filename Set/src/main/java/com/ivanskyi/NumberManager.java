package com.ivanskyi;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class NumberManager {
    static SortByPairsAndGrowth sortByPairsAndGrowth =
            new SortByPairsAndGrowth();
    static Set<Integer> footballPlayer = new TreeSet<>(sortByPairsAndGrowth);

    public static void startSort() {
        footballPlayer.add(2);
        footballPlayer.add(1);
        footballPlayer.add(4);
        footballPlayer.add(3);
        footballPlayer.add(5);
        footballPlayer.add(7);
        footballPlayer.add(6);

        System.out.println("Sorted result : ");
        for(Integer number : footballPlayer) {
            System.out.print(number + " ");
        }
    }
}

class SortByPairsAndGrowth implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        if (o1 % 2 == 0) {
            if (o2 % 2 == 0) {
                if (o1 < o2) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                return -1;
            }
        }

        else {
            if (o2 % 2 != 0) {
                if (o1 < o2) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                return 1;
            }
        }
    }
}
