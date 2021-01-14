package ivanskiy.com;

import org.w3c.dom.Text;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        CalculateManager calculateManager = new CalculateManager();
        Scanner scanner = new Scanner(System.in);
        String command;
        int status = 0;
        while(status == 0){
            System.out.println(TextTemplate.START_NOTIFICATION.getText());
            command = scanner.nextLine();
            calculateManager.parse(command);
            System.out.println(TextTemplate.RESULT_NOTIFICATION.getText() + calculateManager.getResult() + "\n");
        }
    }
}
