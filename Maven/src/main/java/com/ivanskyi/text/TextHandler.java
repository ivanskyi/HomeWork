package com.ivanskyi.text;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TextHandler {

    private List<String> allWordsFromFile;
    final private List<String> censorshipCheckList = new ArrayList<>();
    final private List<String> censorshipWordsWhichFoundInText =
            new ArrayList<>();
    private Map<String, Integer> wordsFrequency = new HashMap<>();

    public TextHandler(List<String> wordsSet) {
        this.allWordsFromFile = wordsSet;
    }

    public int getCountedAllWords() {
        return allWordsFromFile.size();
    }

    public void addCensorshipWord(String censorshipWord) {
        censorshipCheckList.add(censorshipWord.trim().toLowerCase());
    }

    public int getCountedCensorshipWords() {
        int censorshipCount = 0;
        for (String word : allWordsFromFile) {
            for (String censorshipWord : censorshipCheckList) {
                if (censorshipWord.equals(word)) {
                    censorshipCount++;
                }
            }
        }
        return censorshipCount;
    }


    public String[] getAllCensorshipWordFromText() {
        for (String word : allWordsFromFile) {
            for (String censorshipWord : censorshipCheckList) {
                if (censorshipWord.equals(word)) {
                    censorshipWordsWhichFoundInText.add(censorshipWord);
                }
            }
        }
        return censorshipWordsWhichFoundInText
                .toArray(new String[censorshipWordsWhichFoundInText.size()]);
    }

    public Map<String, Integer> getWordsRating() {
        wordsFrequency = allWordsFromFile.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
        return wordsFrequency;
    }
}
