package com.ivanskyi.fireService;

public class FireDepartment {

    public void call(int firemanCount) throws InterruptedException {
        Call call = new Call();
        call.start();
        for (int i = 0; i < firemanCount; i++) {
            Fireman fireman = new Fireman();
            fireman.start();
            fireman.join();
        }
    }
}