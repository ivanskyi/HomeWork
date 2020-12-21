package com.ivanskyi;

public class Application {
    public static void main(String[] args) {
        MyList<Integer> listWithNumber = new MyList<>();
        MyList<String> listWithWords = new MyList<>();
        listWithNumber.add(54);
        listWithNumber.add(65757);
        listWithNumber.add(23);
        listWithNumber.add(55);
        listWithNumber.add(23);

        listWithWords.add("Hola");
        listWithWords.add("Hello");
        listWithWords.add("Pryvit");

        for(String word : listWithWords.getList()){
            System.out.println(word);
        }

        System.out.println("Max value : " + listWithNumber.getMax());
        System.out.println("Min value : " + listWithNumber.getMin());
    }
}