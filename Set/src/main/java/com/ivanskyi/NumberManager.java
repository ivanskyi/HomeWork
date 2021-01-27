package com.ivanskyi;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class NumberManager {
    static SortByPairsAndGrowth sortByPairsAndGrowth =
            new SortByPairsAndGrowth();
    static Set<Integer> treeSet = new TreeSet<>(sortByPairsAndGrowth);

    public static void startSort() {
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(6);

        System.out.println("Sorted result : ");
        for(Integer number : treeSet) {
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
