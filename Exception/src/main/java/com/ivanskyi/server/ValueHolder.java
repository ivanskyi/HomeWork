package com.ivanskyi.server;

public class ValueHolder {
    private String string;

    public ValueHolder(String string) {
        if (!string.isEmpty()) {
            this.string = string;
        }
    }

    public String getValue() {
        return string;
    }

    public String detectType() {
        try {
            if (Integer.parseInt(string) % 2 >= 0) {
                return "numberValue";
            }
        } catch (NumberFormatException e) {
        }
        return "stringValue";
    }
}
