package com.ivanskyi.fireservice;

public class Fireman extends Thread {
    public void run() {
        System.out.println("Firemen with name: "
                + Thread.currentThread().getName() + " is ready");
    }
}
