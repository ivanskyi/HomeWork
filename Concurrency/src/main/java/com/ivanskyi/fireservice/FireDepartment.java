package com.ivanskyi.fireservice;

public class FireDepartment {
    private final Call call = new Call();

    public void call(int firemanCount) throws InterruptedException {
        call.start();
        call.join();

        for (int i = 0; i < firemanCount; i++) {
            Fireman fireman = new Fireman();
            fireman.setName("Officer-" + i);
            fireman.start();
            fireman.join();
        }
    }
}
