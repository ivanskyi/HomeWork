package com.ivankyi;

public class ArrayMatrixWithWords {
    public String appendByDiagonal() {
        String[] Line1 = {"Today", "i", "will", "dream"};
        String[] Line2 = {"I", "like", "hot", "coffe"};
        String[] Line3 = {"Sun", "have", "light", "sunshines"};
        String[] Line4 = {"Work", "hard", "play", "hard"};
        String[][] arrayWithLines = {Line1, Line2, Line3, Line4};
        String result = "";

        for (int i = 0; i < arrayWithLines.length; i++) {
            for (int j = 0; j < arrayWithLines[i].length; j++) {
                if (i == j) {
                    result = result + " " + arrayWithLines[i][j];
                }
            }
        }
        return result;
    }
}