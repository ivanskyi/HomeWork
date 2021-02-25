package com.ivanskiy.library.service.book;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.model.Book;
import java.util.List;

public interface BookService {

    int createBook(String title, String genre, String description, int rate);
    List<Book> deleteBook(int id);
    List<Book> sortBookByGenre();
    List<Author> sortBookByAuthor();
    int updateBook(int id, String title,String genre, String description, int rate);
    int getBookIndexById(int id);
    int generateId();
    boolean checkIfBookExist(int id);
}
