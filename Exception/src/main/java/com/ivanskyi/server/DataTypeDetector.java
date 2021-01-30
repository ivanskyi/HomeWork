package com.ivanskyi.server;

public class DataTypeDetector {
    private String string;

    public boolean isInteger(String string) {
        if (!string.isEmpty()) {
            this.string = string;
        } else {
            throw new NullPointerException();
        }

        try {
            int number = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
