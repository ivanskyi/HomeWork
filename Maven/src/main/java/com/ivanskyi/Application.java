package com.ivanskyi;

import java.io.FileNotFoundException;

public class Application {
    public static void main( String[] args ) throws FileNotFoundException {
        TextReader textReader = new TextReader("/home/oleh/song.txt");



String[] words = {"Helllo", "easy"};

      for(String word : textReader.detectBadWords(textReader.read())){
          System.out.println(word);
      }





    }
}
