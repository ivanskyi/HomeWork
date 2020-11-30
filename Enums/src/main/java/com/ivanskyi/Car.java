package com.ivanskyi;

public class Car {
    public void start(){
        System.out.println("Car starting");
    }

    public void stop(){
        System.out.println("Car stopping");
    }

    public void drive(){
        System.out.println("Car driving");
    }

    public void keepSpeed(int speed){
        System.out.println("Car keep speed : " + speed+" km/hour");
    }
}
