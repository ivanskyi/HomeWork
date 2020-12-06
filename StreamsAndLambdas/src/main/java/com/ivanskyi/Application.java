package com.ivanskyi;

import com.ivanskyi.interfaces.Year;

public class Application{
    public static void main( String[] args ) {


        ///1.Exercise
        Year year = day -> day * 3600;
        System.out.println(year.howManyHoursInYear(365));



    }
}
