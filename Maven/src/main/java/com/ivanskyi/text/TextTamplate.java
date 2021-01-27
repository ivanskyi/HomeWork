package com.ivanskyi.text;

public enum TextTamplate {
    FILE_NOT_FOUND("File is not found. Please change path to file and restart application."),
    RESULT_FROM_ANALYSE("\nResult from text analyse "),
    TOTAL_NUMBER_OF_WORDS("Total number of words : "),
    CENSORSHIP_RESULT_COUNT("Censorship words result count : "),
    CENSORSHIP_RESULT_TEXT("\nWe found some censorship words and write them "
            + "in another list. \nBelow we see this words :"),
    WORDS_RATING_LIST("\nThe number of repetitions of each word in the text:"),
    WORD_TEXT("Word ["),
    QUANTITY_REPEAT("] repeated in the text :"),
    TIMES_WORD(" times");

    private String text;

    TextTamplate(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
