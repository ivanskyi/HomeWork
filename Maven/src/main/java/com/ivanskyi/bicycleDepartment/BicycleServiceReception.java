package com.ivanskyi.bicycleDepartment;

import com.ivanskyi.bicycleDepartment.bicycleParts.*;

public class BicycleServiceReception {
    StationForChangeBicycleParts stationForChangeBicycleParts
            = new StationForChangeBicycleParts();
    BicycleFactory bicycleFactory = new BicycleFactory();
    BicycleCreator bicycleCreator = new BicycleCreator(bicycleFactory);
    Bicycle bicycle = bicycleCreator.orderBicycle(BicycleBrand.CANNONDALE);

    public void createBicycle() {
        bicycle.setFrame(new Frame(FrameBrands.PINARELLO,FrameSize.BIG));
        bicycle.setRudder(new Rudder(RudderMaterial.TITANIUM));
        bicycle.setWheels(new Wheels(WheelBrands.SHIMANO,26));
        System.out.println("\nBicycle which we created.");
        bicycle.getAllCharacteristics();
    }

    public void changePartsInBicycle() {
        System.out.println("\nBicycle where we changed some parts.");
        stationForChangeBicycleParts.addBicycle(bicycle);
        stationForChangeBicycleParts
                .replaceFrame(new Frame(FrameBrands.FELT,FrameSize.MIDDLE));
        stationForChangeBicycleParts
                .replaceRudder(new Rudder(RudderMaterial.STEEL));
        stationForChangeBicycleParts
                .replaceWheels(new Wheels(WheelBrands.ZIPP,27));
        bicycle.getAllCharacteristics();
    }
}