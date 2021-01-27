package com.ivanskyi.text;

import java.util.*;
import java.util.stream.Collectors;

public class TextManager {

    private List<String> allWordsFromFile;
    final private List<String> censorshipCheckList = new ArrayList<>();
    final private List<String> censorshipWordsWhichFoundInText =
            new ArrayList<>();
    final private Map<String, Integer> wordsRating = new HashMap<>();

    public TextManager(List<String> wordsSet) {
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

    public void getWordsRating() {
        for (int i = 0; i < allWordsFromFile.size(); i++) {
            wordsRating.put(allWordsFromFile.get(i), 1);
            for (int j = 1; j < allWordsFromFile.size() - i; j++) {
                if (allWordsFromFile.get(i).equals(allWordsFromFile.get(j))) {
                    wordsRating.put(allWordsFromFile.get(i),
                            wordsRating.get(allWordsFromFile.get(i)) + 1);
                }
            }
        }
        List<Map.Entry<String, Integer>> wordsRatingBuffer = wordsRating
                .entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toList());

        wordsRating.clear();

        for (Map.Entry<String, Integer> word : wordsRatingBuffer) {
            System.out.println(TextTamplate.WORD_TEXT.getText() + word.getKey()
                    + TextTamplate.QUANTITY_REPEAT.getText()
                    + word.getValue() + TextTamplate.TIMES_WORD.getText());
        }
    }
}






