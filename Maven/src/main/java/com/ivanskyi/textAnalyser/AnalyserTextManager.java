package com.ivanskyi.textAnalyser;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class AnalyserTextManager {
    String pathToTextFile;
    List<String> myWords = new ArrayList<>();
    FileContentReader fileContentReader ;

    public void setPathToTextFile(String pathToTextFile) {
        this.pathToTextFile = pathToTextFile;
    }

    public List<String> readTextFile(){
        fileContentReader = new FileContentReader(pathToTextFile);
        try {
            myWords = fileContentReader.getFileContents();
        } catch (FileNotFoundException e){
            System.out.println("File is not found. "
                    + "Please change path to file and restart application.");
        }
       return myWords;
    }

    public void getTextParameters(List<String> allWords)  {
        TextManager textManager = new TextManager(allWords);
        textManager.addCensorshipWord("passenger");
        textManager.addCensorshipWord("hollow");
        System.out.println("\nHere is all text parameters : ");
        System.out.println("Total number of words: "
                + textManager.getCountedAllWords());
        System.out.println("The total number of censored words: "
                + textManager.getCountedCensorshipWords());
        System.out.println("The total number of censorship words"
                + " which we find in text and wrote in another array: "
                + textManager.getAllCensorshipWordFromText().length);
        System.out.println("The number of repetitions of "
                + "each word in the text: \n" + textManager.getWordsRating());
    }
}