package ivanskiy.com;

public enum TextTemplate {
    START_NOTIFICATION("Please write data for calculation"),
    RESULT_NOTIFICATION("Calculation result is : ");

    String text;

    TextTemplate(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
