package com.ivankyi;

public class ArrayMachine {
	public static void main(String[] args){
		LibraryWithNumbers libraryWithNumbers = new LibraryWithNumbers();
		for(int uniqueNumber : libraryWithNumbers.getUniqueNumbers()){
			System.out.println("Unique value is : " + uniqueNumber);
		}

		Numbers twentyNumbers = new Numbers();
		for(int a : twentyNumbers.generateRandomNumbers()){
			System.out.println("Generate value is : " + a);
		}

		System.out.println("The lowest value is : " + twentyNumbers.getLowestNumber());
		for (int a : twentyNumbers.getGrowingSort()) {
			System.out.println("Growing sort : " + a);
		}

		for (int a : twentyNumbers.getDescendingSort()) {
			System.out.println("Descending sort : " + a);
		}

		System.out.println("Sum with all numbers : " + twentyNumbers.getSumOfAllNumbers());

		for (int a : twentyNumbers.getSquareRootValues()) {
			System.out.println("Square root value from  "+ a);
		}
		ArrayMatrixWithWords matrixWithWords = new ArrayMatrixWithWords();
		System.out.println("Words in diagonal view : " + matrixWithWords.appendByDiagonal());
	}
}