package com.ivanskyi;

import java.util.ArrayList;

public class SimpleArrayList {
    ArrayList<Integer> list = new ArrayList<>();

    public SimpleArrayList(int... values) {
        for(Integer value : values){
            this.add(value);
        }
    }

    public void add(int value){
        this.list.add(value);
    }

    public void deleteElementsWhichDivideOnThree() {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 3 == 0){
                list.remove(i);
                i--;
            }
        }
    }

    public ArrayList<Integer> getListWhereElementNotDivideOnThree() {
        this.deleteElementsWhichDivideOnThree();
        return list;
    }
}