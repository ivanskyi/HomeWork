package com.ivanskyi.text;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AnalysisTeller {
    String pathToFile;
    private List<String> allWordsFromFile = new ArrayList<>();
    private FileContentReader fileContentReader;

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public List<String> readTextFile() {
        fileContentReader = new FileContentReader(pathToFile);

        try {
            allWordsFromFile = fileContentReader.getFileContents();
        } catch (FileNotFoundException e) {
            System.out.println(TextTamplate.FILE_NOT_FOUND.getText());
        }
        return allWordsFromFile;
    }

    public void getTextParameters(List<String> allWords) {
        TextManager textManager = new TextManager(allWords);
        textManager.addCensorshipWord("passenger");
        textManager.addCensorshipWord("hollow");

        System.out.println(TextTamplate.RESULT_FROM_ANALYSE.getText());
        System.out.println(TextTamplate.TOTAL_NUMBER_OF_WORDS.getText()
                + textManager.getCountedAllWords());
        System.out.println(TextTamplate.CENSORSHIP_RESULT_COUNT.getText()
                + textManager.getCountedCensorshipWords());
        System.out.println(TextTamplate.CENSORSHIP_RESULT_TEXT.getText());

        for (String censorshipWord : textManager.getAllCensorshipWordFromText()) {
            System.out.println(censorshipWord);
        }

        System.out.println(TextTamplate.WORDS_RATING_LIST.getText());
        textManager.getWordsRating();
    }
}

