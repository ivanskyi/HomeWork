package com.ivanskyi;

import java.text.ParseException;
import java.util.Scanner;

public class Terminal {

    public void start() throws ParseException {
    BooksLibrary booksLibrary = new BooksLibrary();
    Scanner scanner = new Scanner(System.in);

    System.out.println(TextForInterface.MainMenu.getText());

    int userChoice = scanner.nextInt();
        switch (userChoice){
            case 1 :
                booksLibrary.getLibraryLogs();
                break;
          case 2 :
              System.out.println(TextForInterface.takeBookItem.getText());
              String bookName = scanner.nextLine();
              booksLibrary.takeBook(bookName);
              break;
          case 3 :
              System.out.println(TextForInterface.getBookNameByDate.getText());
              String dateForGetBookName = scanner.nextLine();
              System.out.println(booksLibrary.getBookNameByDate(dateForGetBookName));
              break;
           case 4 :
               System.exit(0);
               break;
        }
    }
}