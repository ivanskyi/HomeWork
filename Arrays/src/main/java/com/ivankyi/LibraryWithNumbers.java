package com.ivankyi;

public class LibraryWithNumbers {
    public int[] getUniqueNumbers() {
        int[] setWithNumbers={3,2,3,1,4,2,8,3};
        for(int i = 0; i < setWithNumbers.length; i++){
            for(int j = 1; j < setWithNumbers.length-i; j++){
                if(setWithNumbers[i] == setWithNumbers[j]){
                    setWithNumbers[j]= 0;
                }
            }
        }
        return setWithNumbers;
    }
}