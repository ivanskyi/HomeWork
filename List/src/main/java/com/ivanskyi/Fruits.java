package com.ivanskyi;

import java.util.ArrayList;

public class Fruits {
    ArrayList<String> fruits = new ArrayList<>();

    public Fruits(String... fruits) {
        for(String fruit : fruits){
            this.add(fruit);
        }
    }

    public void add(String value){
        fruits.add(value);
    }

    public String replaceOrangeToGrapefruit(){
        String result= "";
        for (int i = 0; i <fruits.size() ; i++) {
            if (fruits.get(i) == "Orange"){
                fruits.set(i,"Grapefruit");
                result = "We did replace";
            }
            else{
                result = "Value not present";
            }
        }
        return result;
    }

    public ArrayList<String> getFruitsWhereOrangeIsReplaceToGrapefruit(){
        replaceOrangeToGrapefruit();
        return fruits;
    }
}