package com.ivanskyi;

public class Application {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(54);
        list.add(33);
        list.add(22);
        list.add(44);
        list.add(4);
        list.add(65757);
        list.add(23);
        list.add(55);
        list.add(23);

        System.out.println("Max value : " + list.getMax());
        System.out.println("Min value : " + list.getMin());
    }
}