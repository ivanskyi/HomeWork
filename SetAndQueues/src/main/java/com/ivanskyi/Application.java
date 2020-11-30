package com.ivanskyi;

import java.util.*;

public class Application {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 > 0 && o2 % 2 > 0){
                    return 1;
                }
                else if(o1 % 2 == 0){
                    if(o2 % 2 == 0 ){
                        return 1;
                     }
                    return -1;
                }
                else{
                    return 1;
                }
            }
        };

        Set myTreeSet = new TreeSet<>(comparator);
        myTreeSet.add(2);
        myTreeSet.add(1);
        myTreeSet.add(4);
        myTreeSet.add(3);
        myTreeSet.add(5);
        myTreeSet.add(7);
        myTreeSet.add(6);
        System.out.println("After sort TreeSet we have following sequence of elements : " + myTreeSet);
    }
}