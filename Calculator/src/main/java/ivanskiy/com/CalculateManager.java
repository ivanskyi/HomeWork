package ivanskiy.com;

import java.util.ArrayList;
import java.util.List;

public class CalculateManager {

    String command;
    String reversePolishNotation = "";
    StringBuilder reversePolishNotationBuffer = new StringBuilder();
    List<String> separatorsFromCommand = new ArrayList<>();
    List<Integer> numbersFromCommand = new ArrayList<>();

    public void parse(String command) {
        this.command = command;
        String[] separators = {"+","-","*","/"};
        String[] numberWithoutSigns = this.command.split("[-+*/=]");

        for(String number : numberWithoutSigns) {
          numbersFromCommand.add(Integer.parseInt(number));
        }

        char[] allSymbol = command.toCharArray();

        for (String separator : separators) {
            for(char symbol : allSymbol) {
                if(separator.charAt(0) == symbol) {
                    separatorsFromCommand.add(String.valueOf(symbol));
                }
            }
        }
    }

    public String getTaskCommandInReversePolishNotation() {
        for(Integer number : numbersFromCommand){
            reversePolishNotationBuffer.append(number + " ");
        }

        for (String separator : separatorsFromCommand) {
            reversePolishNotationBuffer.append(separator + " ");
        }

        reversePolishNotation = reversePolishNotationBuffer.toString();
        return reversePolishNotation;
    }
}