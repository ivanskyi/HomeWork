package com.ivanskyi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileContentReader {
    final private String filepath;
    final private ArrayList<String> allWords = new ArrayList<>();

    public FileContentReader(String filepath) {
        this.filepath = filepath;
    }

    public ArrayList<String> getFileContents() throws FileNotFoundException {
        StringBuffer buffer = new StringBuffer();
        File file = new File(filepath);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            buffer.append(scanner.nextLine() + " ");
        }
        String fileContents = buffer.toString();
        String[] allWordsSplited = fileContents.split(" ");
        for (String word : allWordsSplited) {
            if(!word.isEmpty()){
                allWords.add(word.trim().toLowerCase());
            }
        }

        return allWords;
    }
}