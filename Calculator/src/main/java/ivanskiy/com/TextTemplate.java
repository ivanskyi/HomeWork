package ivanskiy.com;

public enum TextTemplate {
    START_WINDOW_NOTIFICATION("If you want open calculator please press 1. But if you want close this window press 2."),
    START_CALCULATOR_NOTIFICATION("Please write task command "),
    RESULT_NOTIFICATION("Calculation result is : ");

    String text;

    TextTemplate(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}