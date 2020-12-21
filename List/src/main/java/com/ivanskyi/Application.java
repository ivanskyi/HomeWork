package com.ivanskyi;

public class Application {
    public static void main(String[] args) {
        Tasks tasks = new Tasks();
        tasks.initializationAndDeleteSomeNumbersFromList();
        tasks.initializationAndRenameSomeFruitsInList();
        tasks.initializationAndCompareSomeListsBySimilarValues();
        tasks.initializationAndDoDESCSortByComparator();
        tasks.createArrayListAndLinkedListWithOutputTimeForIt();
        tasks.showTimePerformanceByAddAndDeleteOperationInLists();
    }
}