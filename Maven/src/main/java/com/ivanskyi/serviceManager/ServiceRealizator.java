package com.ivanskyi.serviceManager;

import com.ivanskyi.bicycleDepartment.BicycleServiceReception;
import com.ivanskyi.textAnalyser.AnalyserTextManager;

public class ServiceRealizator {
    private BicycleServiceReception bicycleServiceReception
            = new BicycleServiceReception();
    AnalyserTextManager analyserTextManager = new AnalyserTextManager();

    public void initialAllService() {
        System.out.println("Initial service for change parts in bicycle");
        bicycleServiceReception.createBicycle();
        bicycleServiceReception.changePartsInBicycle();

        System.out.println("\nInitial service for text analysis");
        analyserTextManager
                .setPathToTextFile("src/main/java/com/"
                        + "ivanskyi/textAnalyser/data.txt");
        analyserTextManager
                .getTextParameters(analyserTextManager.readTextFile());
    }
}
