package com.ivanskyi.server;

import com.ivanskyi.exceptions.NoPolindromException;

public class Polindrom {
    String string;
    public boolean detectPolindrom(String word) throws NoPolindromException {
        StringBuffer bufferWords = new StringBuffer(word);
        bufferWords.reverse();
        String reverseWord = bufferWords.toString();
        if (word.equals(reverseWord)) {
            return true;
        }
        else{
            return false;
        }
    }
}