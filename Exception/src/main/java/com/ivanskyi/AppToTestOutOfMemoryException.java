package com.ivanskyi;

public class AppToTestOutOfMemoryException {
    public static void main(String[] args) {
        Integer[] array = new Integer[10000000 * 1000000];
    }
}