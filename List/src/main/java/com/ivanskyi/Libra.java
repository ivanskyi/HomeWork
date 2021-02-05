package com.ivanskyi;

import java.util.List;

public class Libra {
    String result = "";

    public String discoverIfListHaveSimilarValues(List<?> firstList, List<?> secondList) {
        for (Object o : firstList) {
            for (Object value : secondList) {
                if (o == value) {
                    result = "Two list have at least one similar value ";
                } else {
                    result = "Lists don't have similar values";
                }
            }
        }
        return result;
    }
}