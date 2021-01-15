package ivanskiy.com;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        CalculateManager calculateManager = new CalculateManager();
        ReversePolishNotationManager reversePolishNotation = new ReversePolishNotationManager();

        Scanner scanner = new Scanner(System.in);
        int status = 0;
        while(status == 0) {
            System.out.println(TextTemplate.START_WINDOW_NOTIFICATION.getText());
            int menuItemWhichIsChoicedFromUser = scanner.nextInt();

            if (menuItemWhichIsChoicedFromUser == 2) {
                System.exit(0);
            }
            System.out.println(TextTemplate.START_CALCULATOR_NOTIFICATION.getText());
            String taskCommand = scanner.nextLine();

                try{
                    calculateManager.parse(taskCommand);
                    System.out.println(reversePolishNotation.evaluate(calculateManager.getTaskCommandInReversePolishNotation()));
                }
                catch (Exception e) {
                    System.out.println("Your data is invalid. Try write it againe");
                    continue;
                }
        }
    }
}