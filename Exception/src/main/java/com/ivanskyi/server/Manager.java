package com.ivanskyi.server;

import java.util.Scanner;

public class Manager {
    Scanner scanner = new Scanner(System.in);
    String result;

    public String openTerminal() {
        System.out.println("Our server wants to get data. \nPlease write some text, "
                + "number or left this field empty and press enter. Thanks :)");
        result = scanner.nextLine();
        return result;
    }
}
