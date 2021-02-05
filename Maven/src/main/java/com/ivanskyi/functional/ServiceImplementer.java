package com.ivanskyi.functional;

import com.ivanskyi.bicycle.BicycleServiceReception;
import com.ivanskyi.bicycle.parts.*;
import com.ivanskyi.text.ReportCreator;

public class ServiceImplementer {
    static ServiceImplementer serviceRealizator = new ServiceImplementer();
    private static BicycleServiceReception bicycleServiceReception =
            new BicycleServiceReception();
    static private ReportCreator analysisTeller = new ReportCreator();

    static public void initialAllService() {
        Frame frame = new Frame(FrameBrands.FELT, FrameSize.MIDDLE);
        Rudder rudder = new Rudder(RudderMaterial.STEEL);
        Wheels wheels = new Wheels(WheelBrands.ZIPP, 27);

        serviceRealizator.bicycleServiceReception.createBicycle();


        bicycleServiceReception.changePartsInBicycle(frame, rudder, wheels);
        analysisTeller.setPathToFile("src/main/java/com/ivanskyi/text/data.txt");
        analysisTeller.getTextParameters(analysisTeller.readTextFile());
    }
}

