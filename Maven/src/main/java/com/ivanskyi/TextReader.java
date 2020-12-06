package com.ivanskyi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.FileHandler;

public class TextReader {
    String filepath;
    public TextReader(String filepath) {
        this.filepath = filepath;
    }
    public String[] read() throws FileNotFoundException {
        StringBuffer buffer = new StringBuffer();
        File file = new File(filepath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            buffer.append(scanner.nextLine());
        }
        String allText = buffer.toString();
        String[] splitAllText = allText.split(" ");
        return splitAllText;
    }

public String[] detectBadWords(String[] text){
        String[] allText = text;
    List badWordsLibrary = new ArrayList();
    String[] badWords = {"you","not"};
    for (int i = 0; i < allText.length; i++) {
        for (int j = 0; j < badWords.length; j++) {
            if(allText[i].equals(badWords[j]) || allText[i].length()<3){
                badWordsLibrary.add(text[i]);
                text[i] = "";
            }
        }
    }
    return allText;
    }
}