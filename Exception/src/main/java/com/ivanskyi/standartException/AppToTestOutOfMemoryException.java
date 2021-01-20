package com.ivanskyi.standartException;

public class AppToTestOutOfMemoryException {
    public static void main(String[] args) {
        final int VOLUME_OF_THE_ARRAY = 10000000;
        Integer[] array = new Integer[VOLUME_OF_THE_ARRAY
                * VOLUME_OF_THE_ARRAY];
    }
}
