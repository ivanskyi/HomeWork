package com.ivanskyi;

import com.ivanskyi.exceptions.BiggerHundredException;
import com.ivanskyi.exceptions.NoPolindromException;
import com.ivanskyi.exceptions.OddNumberException;
import com.ivanskyi.server.Polindrom;
import com.ivanskyi.server.ValueHolder;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws NoPolindromException, OddNumberException, BiggerHundredException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write whatever: ");
        String obtainedValue;
        obtainedValue = scanner.nextLine();

        ValueHolder valueHolder = new ValueHolder(obtainedValue);
        Polindrom polindrom = new Polindrom();
        if (valueHolder.detectType() == "stringValue") {
            if (polindrom.detectPolindrom(valueHolder.getValue())) {
                System.out.println("Very well. This word is polindrom.");
            } else {
                throw new NoPolindromException("This world isn't polindrom");
            }
        }

        else if (valueHolder.detectType() == "numberValue") {
            int number = Integer.parseInt(valueHolder.getValue());
            if (number % 2 > 0 && number < 100) {
                throw new OddNumberException("Число не парне");
            }
            if (number > 100) {
                throw new BiggerHundredException("Число більше за 100");
            }
        }

        if (valueHolder.getValue() == null) {
            throw new NullPointerException();
        }
    }
}