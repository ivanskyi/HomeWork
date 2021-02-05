package com.ivanskyi;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.getArea(3));

        ClassForCountNewClass classForCountNewClass = new ClassForCountNewClass();
        ClassForCountNewClass classForCountNewClass1 = new ClassForCountNewClass();
        ClassForCountNewClass classForCountNewClass2 = new ClassForCountNewClass();
        System.out.println(ClassForCountNewClass.count);

        Car car = new Car();
        car.start();
        car.drive();
        car.keepSpeed(20);
        car.stop();
    }
}