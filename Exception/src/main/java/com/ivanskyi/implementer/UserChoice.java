package com.ivanskyi.implementer;

import java.util.Scanner;

public class UserChoice {
    Scanner scanner = new Scanner(System.in);

    public int open() {
        System.out.println("Hello. We have some functions. To start "
                + "work please choose the function number ");
        System.out.println("1 - StackOverFlowException example. \n2 - Server.  "
                + "\n3 - OutOfMemoryException example.");
        int userChoice = scanner.nextInt();
        return (userChoice != 0) ? userChoice : 0;
    }
}
