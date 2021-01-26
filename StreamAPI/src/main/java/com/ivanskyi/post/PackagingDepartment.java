package com.ivanskyi.post;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PackagingDepartment {
    Random random = new Random();
    int randomNumber;

    public Thing getRandomThing() {
        Thing[] things = Thing.values();
        randomNumber = random.nextInt(things.length);
        return things[randomNumber];
    }

    public List<Thing> getThingsCollection(int quantityThings) {
        List<Thing> thingsCollection = new ArrayList<>();
        for (int i = 0; i < quantityThings; i++) {
            thingsCollection.add(getRandomThing());
        }
        return thingsCollection;
    }
}
