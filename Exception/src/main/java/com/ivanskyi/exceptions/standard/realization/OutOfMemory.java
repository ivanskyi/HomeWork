package com.ivanskyi.exceptions.standard.realization;

public class OutOfMemory {

    public static void start() {
        final int volumeOfTheArray = 100000000;
        Integer[] array = new Integer[volumeOfTheArray * volumeOfTheArray];
    }
}
