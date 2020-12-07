package com.ivanskyi.fireService;

public class Call extends Thread{

    public void run() {
        System.out.println("Your do call . Thread have name : " + Thread.currentThread().getName());
    }
}