package com.ivanskyi.library;

import java.util.Scanner;

public class Reception {
    static Reception reception = new Reception();
    static private LibraryFunctional libraryFunctional =
            new LibraryFunctional();
    static Scanner scanner = new Scanner(System.in);

    public static void startTerminal() {
        System.out.println(TextTamplates.GREETING.getText());
        reception.createListWithTakenBooks();

        int userChoice = 0;
        final int watchLog = 1;
        final int takeBook = 2;
        final int searchBook = 3;
        final int closeProgram = 4;

        while (userChoice > 0 || userChoice <= 4) {
            System.out.println(TextTamplates.MAIN_MENU.getText());
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case watchLog:
                    libraryFunctional.watchLogsWithTakenBooks();
                    break;
                case takeBook:
                    System.out.println(TextTamplates.TAKE_BOOK_ITEM.getText());
                    String bookName = scanner.nextLine();
                    libraryFunctional.takeBook(bookName);
                    System.out.println(TextTamplates.BOOK_IS_TAKEN.getText());
                    break;
                case searchBook:
                    System.out.println(TextTamplates.GET_BOOK_NAME_BY_DATE
                            .getText());
                    String dateForGetBookName = scanner
                            .nextLine();
                    System.out.println(TextTamplates.WORD_IN.getText()
                            + dateForGetBookName
                            + TextTamplates.ANSWER_FOR_SEARCH_BOOK_RESULT
                            .getText());
                    System.out.print(libraryFunctional
                            .getBookNameByDate(dateForGetBookName));
                    break;
                case closeProgram:
                    System.exit(0);
                    break;
            }
        }
    }

    public void createListWithTakenBooks() {
        libraryFunctional.takeBook("2012-01-23 21:32:12", "Taras Bulba");
        libraryFunctional.takeBook("2017-03-15 21:32:14", "Postamp");
        libraryFunctional.takeBook("2021-09-07 21:32:43", "Atlantyda");
    }
}
