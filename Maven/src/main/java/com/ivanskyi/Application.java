package com.ivanskyi;

import com.ivanskyi.bicycleDepartment.BicycleServiceReception;
import com.ivanskyi.textAnalyser.AnalyserTextManager;

public class Application {

    public static Application application = new Application();
    BicycleServiceReception bicycleServiceReception
            = new BicycleServiceReception();
    AnalyserTextManager analyserTextManager = new AnalyserTextManager();

    public static void main(String[] args) {
        application.initialAllService();
    }

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