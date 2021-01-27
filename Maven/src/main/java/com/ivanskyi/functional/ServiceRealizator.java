package com.ivanskyi.functional;

import com.ivanskyi.bicycle.BicycleServiceReception;
import com.ivanskyi.text.AnalysisTeller;

public class ServiceRealizator {
    static ServiceRealizator serviceRealizator = new ServiceRealizator();
    private static BicycleServiceReception bicycleServiceReception
            = new BicycleServiceReception();
    static private AnalysisTeller analysisTeller = new AnalysisTeller();

    static public void initialAllService() {
        serviceRealizator.bicycleServiceReception.createBicycle();
        bicycleServiceReception.changePartsInBicycle();
        analysisTeller.setPathToFile("src/main/java/com/ivanskyi/text/data.txt");
        analysisTeller.getTextParameters(analysisTeller.readTextFile());
    }
}

