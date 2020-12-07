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

        List<List> setFromOtherType = new ArrayList<>();
        ListFunctional listLibrary = new ListFunctional();

        List LinkedListLittleSize = listLibrary.createLinkedList(10000);
        List LinkedListMiddleSize = listLibrary.createLinkedList(100000);
        List LinkedListBigSize= listLibrary.createLinkedList(500000);
        List ArrayListLittleSize = listLibrary.createArrayList(10000);
        List ArrayListMiddleSize = listLibrary.createArrayList(100000);
        List ArrayListBigSize = listLibrary.createArrayList(500000);

        setFromOtherType.add(LinkedListLittleSize);
        setFromOtherType.add(LinkedListMiddleSize);
        setFromOtherType.add(LinkedListBigSize);
        setFromOtherType.add(ArrayListLittleSize);
        setFromOtherType.add(ArrayListMiddleSize);
        setFromOtherType.add(ArrayListBigSize);

        for (int i = 0; i <setFromOtherType.size() ; i++) {
            listLibrary.addElement(0,setFromOtherType.get(i));
            listLibrary.addElement(setFromOtherType.get(i).size()/2,setFromOtherType.get(i));
            listLibrary.addElement(setFromOtherType.get(i).size()-1,setFromOtherType.get(i));
            listLibrary.deleteElemnt(0,setFromOtherType.get(i));
            listLibrary.deleteElemnt(setFromOtherType.get(i).size()/2,setFromOtherType.get(i));
            listLibrary.deleteElemnt(setFromOtherType.get(i).size()-1,setFromOtherType.get(i));
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