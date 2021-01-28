package com.ivanskyi.text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileContentReader {
    final private String filepath;
    final private ArrayList<String> allWordsFromFile = new ArrayList<>();
    Scanner scanner;

    public FileContentReader(String filepath) {
        this.filepath = filepath;
    }

    public ArrayList<String> getFileContents() throws FileNotFoundException {
        StringBuilder buffer = new StringBuilder();
        File file = new File(filepath);
        scanner = new Scanner(file);

        while (scanner.hasNext()) {
            buffer.append(scanner.nextLine());
        }

        String fileContents = buffer.toString();
        String[] allWordsSplited = fileContents.split(" ");

        for (String word : allWordsSplited) {
            if (!word.isEmpty()) {
                allWordsFromFile.add(word.trim().toLowerCase());
            }
        }
        return allWordsFromFile;
    }
}

