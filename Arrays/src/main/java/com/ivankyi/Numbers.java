package com.ivankyi;

public class Numbers {

    int[] TwentyNumbersSet = new int[20];
    public int[] generateRandomNumbers(){
        for(int i = 0; i < TwentyNumbersSet.length; i++){
            double doubleRandomeNumber = Math.random() * 10;
            int intRandomeNumber = (int) doubleRandomeNumber;
            TwentyNumbersSet[i] = intRandomeNumber;
        }
        return TwentyNumbersSet;
    }
	
	public int getLowestNumber(){
	    int lowestValue = TwentyNumbersSet[0];
	    for(int i = 0; i < TwentyNumbersSet.length; i++){
            if(TwentyNumbersSet[i] < lowestValue){
            	lowestValue = TwentyNumbersSet[i];
            }
        }
        return lowestValue;
	}

    public int getLargeNumber(){
        int maximum = TwentyNumbersSet[0];
        for(int i = 0; i < TwentyNumbersSet.length; i++){
            if(TwentyNumbersSet[i] > maximum){
                maximum = TwentyNumbersSet[i];
            }
        }
        return maximum;
    }

    public int[] getGrowingSort(){
	    for(int i = 0; i < TwentyNumbersSet.length; i++){
              for(int j = 1; j < TwentyNumbersSet.length - i; j++){
                  if(TwentyNumbersSet[j-1]> TwentyNumbersSet[j]){
                      int buffer = TwentyNumbersSet[j-1];
                      TwentyNumbersSet[j-1] = TwentyNumbersSet[j];
                      TwentyNumbersSet[j] = buffer;
                  }
              }
	    }
	    return TwentyNumbersSet;
    }

    public int[] getDescendingSort(){
        for(int i = 0; i < TwentyNumbersSet.length; i++){
            for(int j = 1; j < TwentyNumbersSet.length-i; j++){
                 if(TwentyNumbersSet[j]> TwentyNumbersSet[j-1]){
                    int buffer = TwentyNumbersSet[j-1];
                    TwentyNumbersSet[j-1] = TwentyNumbersSet[j];
                   TwentyNumbersSet[j] = buffer;
                 }
            }
        }
        return TwentyNumbersSet;
	}

    public int getSumOfAllNumbers(){
         int sum = 0;
         for(int i = 0; i < TwentyNumbersSet.length; i++){
             sum = sum + TwentyNumbersSet[i];
         }
         return sum;
	}

    public int[] getSquareRootValues(){
	    for(int i = 0; i< TwentyNumbersSet.length; i++){
	        TwentyNumbersSet[i] = TwentyNumbersSet[i]* TwentyNumbersSet[i];
	    }
	    return TwentyNumbersSet;
	}
}