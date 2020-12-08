package com.ivanskyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {
    List<List> arrayListAndLinkedList = new ArrayList<>();
    ListManager listManager = new ListManager();

    public static void main(String[] args) {

        Application application = new Application();
        application.initializationAndDeleteSomeNumbersFromList();
        application.initializationAndRenameSomeFruitsInList();
        application.initializationAndCompareSomeListsBySimilarValues();
        application.initializationAndDoDESCSortByComparator();
        application.createArrayListAndLinkedListWithOutputTimeForIt();
        application.showTimePerformanceByAddAndDeleteOperationInLists();
    }

    public void  createArrayListAndLinkedListWithOutputTimeForIt() {
        List LinkedListLittleSize = listManager.createLinkedList(10000);
        List LinkedListMiddleSize = listManager.createLinkedList(100000);
        List LinkedListBigSize = listManager.createLinkedList(500000);
        List ArrayListLittleSize = listManager.createArrayList(10000);
        List ArrayListMiddleSize = listManager.createArrayList(100000);
        List ArrayListBigSize = listManager.createArrayList(500000);

        arrayListAndLinkedList.add(LinkedListLittleSize);
        arrayListAndLinkedList.add(LinkedListMiddleSize);
        arrayListAndLinkedList.add(LinkedListBigSize);
        arrayListAndLinkedList.add(ArrayListLittleSize);
        arrayListAndLinkedList.add(ArrayListMiddleSize);
        arrayListAndLinkedList.add(ArrayListBigSize);
    }

    public void showTimePerformanceByAddAndDeleteOperationInLists() {
        for (int i = 0; i < arrayListAndLinkedList.size(); i++) {
            listManager.addElement(0, arrayListAndLinkedList.get(i));
            listManager.addElement(arrayListAndLinkedList.get(i).size() / 2, arrayListAndLinkedList.get(i));
            listManager.addElement(arrayListAndLinkedList.get(i).size() - 1, arrayListAndLinkedList.get(i));
            listManager.deleteElement(0, arrayListAndLinkedList.get(i));
            listManager.deleteElement(arrayListAndLinkedList.get(i).size() / 2, arrayListAndLinkedList.get(i));
            listManager.deleteElement(arrayListAndLinkedList.get(i).size() - 1, arrayListAndLinkedList.get(i));
        }
    }

    public void initializationAndDeleteSomeNumbersFromList() {
        SimpleArrayList simpleArrayList = new SimpleArrayList(3, 9, 11, 18, 20, 22);
        System.out.println("Numbers which not divide on three : "
                + simpleArrayList.getListWhereElementNotDivideOnThree());
    }

    public void  initializationAndRenameSomeFruitsInList() {
        Fruits fruits = new Fruits("Lemon", "Orange", "Banana", "Orange");
        System.out.println("Our new list with fruits : "
                + fruits.getFruitsWhereOrangeIsReplaceToGrapefruit());
    }

    public void initializationAndCompareSomeListsBySimilarValues() {
        Libra libra = new Libra();
        List<String> netbookElements = new ArrayList<>();
        List<String> PCElements = new ArrayList<>();
        netbookElements.add("Procesor");
        PCElements.add("Procesor");
        System.out.println("Search similar values in two list : "
                + libra.discoverIfListHaveSimilarValues(netbookElements, PCElements));
    }

    public void initializationAndDoDESCSortByComparator() {
        Set comparators = new TreeSet();
        comparators.add(new TestComparator(55));
        comparators.add(new TestComparator(34));
        comparators.add(new TestComparator(76));
        comparators.add(new TestComparator(22));
        comparators.add(new TestComparator(5));
        System.out.println(comparators);
    }
}