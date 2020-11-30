package com.ivanskyi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListFunctional {

    public List createArrayList(int range){
        long start;
        long end;
        start = System.currentTimeMillis();
        List<Integer> mylist = new ArrayList<>();
        for (int i = 0; i <range ; i++) {
            mylist.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end-start + " - Is used time for create ArraList with  " + range + " range" );
        return mylist;
    }

    public List createLinkedList(int range){
        long start, end;
        start = System.currentTimeMillis();
        List<Integer> mylist = new LinkedList<>();
        for (int i = 0; i <range ; i++) {
            mylist.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println(end-start + " - Is used time for create LinkedList with  " + range + " range" );
        return mylist;
    }

    public List addElement(int index, List myList){
        long start, end;
        start = System.currentTimeMillis();
        myList.remove(index);
        end = System.currentTimeMillis();
        long userTime = end-start;
        System.out.println("Time for add element in index : " + index +" inside " + myList.getClass().getSimpleName() +" " + myList.size() +" is : " + userTime) ;
        return myList;
    }

    public List deleteElemnt(int index, List myList){
        long start, end;
        start = System.currentTimeMillis();
        myList.set(index,54735678);
        end = System.currentTimeMillis();
        long userTime = end-start;
        System.out.println("Time for delete element in index : " + index +" inside " + myList.getClass().getSimpleName() +""+ myList.size() +" is : " + userTime) ;
        return myList;
    }
}