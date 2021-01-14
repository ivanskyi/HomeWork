package com.ivanskyi;

import java.util.*;

public class TextManager {
    /*
    ArrayList<String> wordsSet;
    final private ArrayList<String> censorshipWords = new ArrayList<>();
    final private ArrayList<String> censorshipList = new ArrayList<>();

    final private Map<String, Integer> wordsRating = new TreeMap<>();






    public TextManager(ArrayList<String> wordsSet) {
        this.wordsSet = wordsSet;
    }

    public int getCountedAllWords() {
        return wordsSet.size();
    }

/// it's work
    public void addCensorshipWord(String censorshipWord) {
        censorshipWords.add(censorshipWord.trim().toLowerCase());
    }

///it's work
    public int getCountedCensorshipWords() {
        int censorshipCount = 0;
        for (String word : wordsSet){
        for (String censorshipWord : censorshipWords){
                if(censorshipWord.equals(word)){
                    censorshipCount++;
                }
            }
        }
        return censorshipCount;
    }

    public String[] getAllCensorshipWordFromText(){
        ArrayList<String> allCensorshipFromText = new ArrayList<>();
        for (String word : wordsSet){
            for (String censorshipWord : censorshipWords){
                if(censorshipWord.equals(word)){
                    allCensorshipFromText.add(censorshipWord);
                }
            }
        }
        String[] result = allCensorshipFromText.toArray(new String[allCensorshipFromText.size()]);
       return result;
    }


  // it's work but trouble with see word
    public Map<String, Integer> getWordsRating() {
        Comparator<Map.Entry<String,Integer>> myComparator= Comparator.naturalOrder();
            for (int i = 0; i < wordsSet.size(); i++) {
                wordsRating.put(wordsSet.get(i), 1);
                for (int j = 1; j < wordsSet.size()-i; j++) {
                    if (wordsSet.get(i).equals(wordsSet.get(j))) {
                        wordsRating.put(wordsSet.get(i), wordsRating.get(wordsSet.get(i))+1);
                    }
                }
            }
        return wordsRating;
    }



     */
}

