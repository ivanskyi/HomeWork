package com.ivanskyi.textAnalyser;

import java.util.*;

public class TextManager {
    List<String> wordsSet;
    final private List<String> censorshipWordsSample = new ArrayList<>();
    final private List<String> censorshipWordsListfromText = new ArrayList<>();

    final private Map<String, Integer> wordsRating = new TreeMap<>();

    public TextManager(List<String> wordsSet) {
        this.wordsSet = wordsSet;
    }

    public int getCountedAllWords() {
        return wordsSet.size();
    }

    public void addCensorshipWord(String censorshipWord) {
        censorshipWordsSample.add(censorshipWord.trim().toLowerCase());
    }

    public int getCountedCensorshipWords() {
        int censorshipCount = 0;
        for (String word : wordsSet) {
        for (String censorshipWord : censorshipWordsSample) {
                if(censorshipWord.equals(word)) {
                    censorshipCount++;
                }
            }
        }
        return censorshipCount;
    }

    public String[] getAllCensorshipWordFromText() {
        for (String word : wordsSet) {
            for (String censorshipWord : censorshipWordsSample) {
                if(censorshipWord.equals(word)) {
                    censorshipWordsListfromText.add(censorshipWord);
                }
            }
        }
       return censorshipWordsListfromText
               .toArray(new String[censorshipWordsListfromText.size()]);
    }

    public Map<String, Integer> getWordsRating() {
            for (int i = 0; i < wordsSet.size(); i++) {
                wordsRating.put(wordsSet.get(i), 1);
                for (int j = 1; j < wordsSet.size()-i; j++) {
                    if ( wordsSet.get(i).equals(wordsSet.get(j)) ) {
                        wordsRating.put(wordsSet.get(i), wordsRating
                                .get(wordsSet.get(i))+1);
                    }
                }
            }
        return wordsRating;
    }
}