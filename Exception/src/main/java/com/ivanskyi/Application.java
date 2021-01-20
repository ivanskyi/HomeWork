package com.ivanskyi;

import com.ivanskyi.customExceptions.BiggerHundredException;
import com.ivanskyi.customExceptions.NoPolindromException;
import com.ivanskyi.customExceptions.OddNumberException;
import com.ivanskyi.server.Polindrom;
import com.ivanskyi.server.ValueHolder;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws NoPolindromException,
            OddNumberException, BiggerHundredException {
        Application application = new Application();
        application.createPalindromeAnalisator();
    }

    public void createPalindromeAnalisator() throws NoPolindromException,
            OddNumberException, BiggerHundredException {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please write whatever: ");
            String obtainedValue;
            obtainedValue = scanner.nextLine();
            final int MAX_ALLOWED_NUMBER = 100;

            ValueHolder valueHolder = new ValueHolder(obtainedValue);
            Polindrom polindrom = new Polindrom();
            if (valueHolder.detectType() == "stringValue") {
                if (polindrom.detectPolindrom(valueHolder.getValue())) {
                    System.out.println("Very well. This word is polindrom.");
                } else {
                    throw new NoPolindromException("This world "
                            + "isn't polindrom");
                }
            }


            else if (valueHolder.detectType() == "numberValue") {
                int number = Integer.parseInt(valueHolder.getValue());
                if (number % 2 > 0 && number < MAX_ALLOWED_NUMBER) {
                    throw new OddNumberException("Число не парне");
                }
                if (number > MAX_ALLOWED_NUMBER) {
                    throw new BiggerHundredException("Число більше за 100");
                }
            }

            if (valueHolder.getValue() == null) {
                throw new NullPointerException();
            }
        }
    }
