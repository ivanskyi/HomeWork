package com.ivanskyi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {

        Application application = new Application();

        application.initializationAndDeleteSomeNumbersFromList();
        application.initializationAndRenameSomeFruitsInList();
        application.initializationAndCompareSomeListsBySimilarValues();
        application.initializationAndDoDESCSortByComparator();

        ArrayList<List> allList = new ArrayList<>();
        ListFunctional listLibrary = new ListFunctional();

        List LinkedListLittleSize = listLibrary.createLinkedList(10000);
        List LinkedListMiddleSize = listLibrary.createLinkedList(100000);
        List LinkedListBigSize= listLibrary.createLinkedList(500000);
        List ArrayListLittleSize = listLibrary.createArrayList(10000);
        List ArrayListMiddleSize = listLibrary.createArrayList(100000);
        List ArrayListBigSize = listLibrary.createArrayList(500000);

        allList.add(LinkedListLittleSize);
        allList.add(LinkedListMiddleSize);
        allList.add(LinkedListBigSize);
        allList.add(ArrayListLittleSize);
        allList.add(ArrayListMiddleSize);
        allList.add(ArrayListBigSize);

        for (int i = 0; i <allList.size() ; i++) {
            listLibrary.addElement(0,allList.get(i));
            listLibrary.addElement(allList.get(i).size()/2,allList.get(i));
            listLibrary.addElement(allList.get(i).size()-1,allList.get(i));
            listLibrary.deleteElemnt(0,allList.get(i));
            listLibrary.deleteElemnt(allList.get(i).size()/2,allList.get(i));
            listLibrary.deleteElemnt(allList.get(i).size()-1,allList.get(i));
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