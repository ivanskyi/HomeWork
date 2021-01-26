package com.ivanskyi;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 > 0 && o2 % 2 > 0) {
                    return 1;
                } else if(o1 % 2 == 0) {
                    if(o2 % 2 == 0 ) {
                        return 1;
                        
                    }
                    return -1;
                } else {
                    return 1;
                }
            }
        };

        Set<Integer> myTreeSet = new TreeSet<>(comparator);
        int[] values = {1,2,34,4,3,5,7,6,77};
        for(int value : values){
            myTreeSet.add(value);
        }
        System.out.println("After sort TreeSet we have following sequence of elements : " + myTreeSet);
    }
}