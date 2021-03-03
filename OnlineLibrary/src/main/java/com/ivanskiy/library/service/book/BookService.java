package com.ivanskiy.library.service.book;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.model.Book;
import java.util.List;

public interface BookService {
    Book createBook(Book book);
    List<Book> getAll();
    void deleteBook(int id);
    List<Book> sortBookByGenre();
    List<Book> sortBookByAuthor();
    Book updateBook(Book book);
}
