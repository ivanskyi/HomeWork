package com.ivanskyi;

import java.util.List;

public class Libra {

    String result = "";
    public String discoverIfListHaveSimilarValues (List<?> firstList, List<?> secondList ){
        for (int i = 0; i <firstList.size(); i++) {
            for (int j = 0; j <secondList.size(); j++) {
                if(firstList.get(i) == secondList.get(j)){
                    result = "Two list have at least one similar value ";
                }
                else {
                    result = "Lists don't have similar values";
                }
            }
        }
        return result;
    }
}