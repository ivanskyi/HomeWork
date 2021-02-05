package com.ivanskyi.bicycle;

import com.ivanskyi.bicycle.parts.*;

public class BicycleServiceReception {
    StationForChangeBicycleParts stationForChangeBicycleParts
            = new StationForChangeBicycleParts();
    BicycleFactory bicycleFactory = new BicycleFactory();
    BicycleCreator bicycleCreator = new BicycleCreator(bicycleFactory);
    Bicycle bicycle = bicycleCreator.orderBicycle(BicycleBrand.CANNONDALE);

    public void createBicycle() {
        bicycle.setFrame(new Frame(FrameBrands.PINARELLO, FrameSize.BIG));
        bicycle.setRudder(new Rudder(RudderMaterial.TITANIUM));
        bicycle.setWheels(new Wheels(WheelBrands.SHIMANO, 26));
        System.out.println("\nBicycle which we created.");
        bicycle.getAllCharacteristics();
    }

    public void changePartsInBicycle(Frame frame, Rudder rudder, Wheels wheels) {
        System.out.println("\nBicycle where we changed some parts.");
        ///must delete / stationForChangeBicycleParts.addBicycle(bicycle);
        stationForChangeBicycleParts.replaceFrame(bicycle, frame);
        stationForChangeBicycleParts.replaceRudder(bicycle, rudder);
        stationForChangeBicycleParts.replaceWheels(bicycle, wheels);
        bicycle.getAllCharacteristics();
    }
}
