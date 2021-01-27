package com.ivanskyi.bicycle;

public class BicycleCreator {
    private final BicycleFactory bicycleFactory;

    public BicycleCreator(BicycleFactory bicycleFactory) {
        this.bicycleFactory = bicycleFactory;
    }

    public Bicycle orderBicycle(BicycleBrand type) {
        Bicycle bicycle = bicycleFactory.createBicycle(type);
        bicycle.setBicycleBrand(type);
        return bicycle;
    }
}
