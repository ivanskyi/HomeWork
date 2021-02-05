package com.ivanskyi.implementer;

import com.ivanskyi.exceptions.standard.realization.StackOverFlow;
import com.ivanskyi.exceptions.standard.realization.OutOfMemory;
import com.ivanskyi.server.DataTypeDetector;
import com.ivanskyi.server.Manager;
import com.ivanskyi.server.NumberAnalizator;
import com.ivanskyi.server.Polindrome;

public class Functional {

    static private final UserChoice userChoice = new UserChoice();
    static private final Functional functional = new Functional();
    static private final Manager manager = new Manager();
    static private final Polindrome polindrome = new Polindrome();
    static private final DataTypeDetector dataTypeDetector = new DataTypeDetector();
    static private final NumberAnalizator numberAnalizator = new NumberAnalizator();

    public static void startTerminal() {
        int userChoice;
        final int stackOverFlowChoice = 1;
        final int serverChoice = 2;
        final int outOfMemoryChoice = 3;

        while (true) {
            userChoice = Functional.userChoice.open();
            switch (userChoice) {
                case stackOverFlowChoice:
                    functional.startOverFlow();
                    break;
                case serverChoice:
                    functional.startServer();
                    break;
                case outOfMemoryChoice:
                    functional.startOutOfMemory();
                    break;
                default:
                    functional.exitProgram();
                    break;
            }
        }
    }

    public void startOverFlow() {
        StackOverFlow.start();
    }

    public void startOutOfMemory() {
        OutOfMemory.start();
    }

    public void exitProgram() {
        System.out.println("Goodbay");
        System.exit(0);
    }

    public void startServer() {
        String result = manager.openTerminal();
        if (dataTypeDetector.isInteger(result)) {
            System.out.println(numberAnalizator.start(result));
        } else {
            System.out.println(polindrome.detectPolindrom(result));
        }
    }
}
