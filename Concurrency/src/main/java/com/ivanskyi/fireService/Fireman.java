package com.ivanskyi.fireService;

public class Fireman extends Thread{
    public void run(){
        System.out.println("Firemen name: " + Thread.currentThread().getName());
    }
}
