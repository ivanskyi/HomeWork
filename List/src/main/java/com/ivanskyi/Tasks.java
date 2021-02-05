package com.ivanskyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Tasks {
    List<List<Integer>> arrayListAndLinkedList = new ArrayList<>();
    ListManager listManager = new ListManager();

    public void createArrayListAndLinkedListWithOutputTimeForIt() {
        List<Integer> LinkedListLittleSize = listManager.createLinkedList(10000);
        List<Integer> LinkedListMiddleSize = listManager.createLinkedList(100000);
        List<Integer> LinkedListBigSize = listManager.createLinkedList(500000);
        List<Integer> ArrayListLittleSize = listManager.createArrayList(10000);
        List<Integer> ArrayListMiddleSize = listManager.createArrayList(100000);
        List<Integer> ArrayListBigSize = listManager.createArrayList(500000);

        arrayListAndLinkedList.add(LinkedListLittleSize);
        arrayListAndLinkedList.add(LinkedListMiddleSize);
        arrayListAndLinkedList.add(LinkedListBigSize);
        arrayListAndLinkedList.add(ArrayListLittleSize);
        arrayListAndLinkedList.add(ArrayListMiddleSize);
        arrayListAndLinkedList.add(ArrayListBigSize);
    }

    public void showTimePerformanceByAddAndDeleteOperationInLists() {
        for (List<Integer> integers : arrayListAndLinkedList) {
            listManager.addElement(0, integers);
            listManager.addElement(integers.size() / 2, integers);
            listManager.addElement(integers.size() - 1, integers);
            listManager.deleteElement(0, integers);
            listManager.deleteElement(integers.size() / 2, integers);
            listManager.deleteElement(integers.size() - 1, integers);
        }
    }

    public void initializationAndDeleteSomeNumbersFromList() {
        SimpleArrayList simpleArrayList = new SimpleArrayList(3, 9, 11, 18, 20, 22);
        System.out.println("Numbers which not divide on three : "
                + simpleArrayList.getListWhereElementNotDivideOnThree());
    }

    public void initializationAndRenameSomeFruitsInList() {
        Fruits fruits = new Fruits("Lemon", "Orange", "Banana", "Orange");
        fruits.replaceFruiteToAnotherFruite("Orange", "Grapefruit");
        System.out.println("Our new list with fruits : " + fruits.getFruis());
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
        Set<TestComparator> comparators = new TreeSet<>();
        int[] arguments = {55, 34, 76, 22, 5};

        for (int argument : arguments) {
            comparators.add(new TestComparator(argument));
        }
        System.out.println(comparators);
    }
}