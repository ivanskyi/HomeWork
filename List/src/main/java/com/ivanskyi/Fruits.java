package com.ivanskyi;

import java.util.ArrayList;
import java.util.List;

public class Fruits {
    List<String> fruits = new ArrayList<>();

    public Fruits(String... fruits) {
        for(String fruit : fruits){
            this.add(fruit);
        }
    }

    public void add(String value){
        fruits.add(value);
    }

    public void replaceFruiteToAnotherFruite(String fruitWhichIs, String fruiteWhichWillBe){
        for (int i = 0; i <fruits.size() ; i++) {
            if (fruits.get(i).equals(fruitWhichIs)){
                fruits.set(i,fruiteWhichWillBe);
            }
        }
    }

    public List<String> getFruis(){
        return fruits;
    }
}