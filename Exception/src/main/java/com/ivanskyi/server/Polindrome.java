package com.ivanskyi.server;

import com.ivanskyi.exceptions.custom.TextIsNotPolindromException;

public class Polindrome {

    public String detectPolindrom(String text) {
        StringBuffer bufferWords = new StringBuffer(text);
        bufferWords.reverse();
        String reverseWord = bufferWords.toString();

        if (text.equals(reverseWord)) {
            return "Text [" + text + "] is polindrome.";
        } else {
            try {
                throw new TextIsNotPolindromException("Not polindrome text.");
            } catch (TextIsNotPolindromException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        return "This text is not palindrome text.\nThis is reason why "
                + "our program got TextIsNotPolindromException.";
    }
}
