package com.ivanskyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListManager {

    public List<Integer> createArrayList(int range){
        long start;
        long end;
        start = System.currentTimeMillis();
        List<Integer> mylist = new ArrayList<>();
        for (int i = 0; i <range ; i++) {
            mylist.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end-start + " - Time which we used by create   " + range + " range" );
        return mylist;
    }

    public List<Integer> createLinkedList(int range){
        long start, end;
        start = System.currentTimeMillis();
        List<Integer> myList = new LinkedList<>();
        for (int i = 0; i < range ; i++) {
            myList.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end - start + " - Is used time for create LinkedList with  " + range + " range" );
        return myList;
    }

    public void addElement(int index, List<Integer> myList){
        long start, end;
        start = System.currentTimeMillis();
        myList.remove(index);
        end = System.currentTimeMillis();
        long userTime = end - start;
        System.out.println("Time for add element in index : " + index + " inside " + myList.getClass().getSimpleName()
                + " " + myList.size() + " is : " + userTime) ;
    }

    public void deleteElement(int index, List<Integer> myList){
        long start, end;
        start = System.currentTimeMillis();
        myList.set(index,54735678);
        end = System.currentTimeMillis();
        long userTime = end - start;
        System.out.println("Time for delete element in index : " + index + " inside "
                + myList.getClass().getSimpleName() + " " + myList.size() + " is : " + userTime) ;
    }
}