package com.ivanskiy.library.service.book;

import com.ivanskiy.library.model.Author;
import com.ivanskiy.library.model.Book;
import com.ivanskiy.library.repository.AuthorRepository;
import com.ivanskiy.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DefaultBookService implements BookService {

    private BookRepository bookRepository;
    private AuthorRepository authorRepository;

    @Autowired
    public DefaultBookService(final BookRepository bookRepository, final AuthorRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public int createBook(String title, String genre, String description, int rate) {
        Book book = new Book(generateId(), title, genre, description, rate);
        bookRepository.addBookToStorage(book);
        if(bookRepository.getAllBook().contains(book)) {
            return 200;
        } else {
            return 501;
        }
    }

    @Override
    public List<Book> deleteBook(int id) {
        int index = 0;
        for (int i = 0; i < bookRepository.getAllBook().size(); i++) {
            if(id == bookRepository.getAllBook().get(i).getId()) {
                index = i;
            }
        }
        bookRepository.removeBook(index);
        return bookRepository.getAllBook();
    }

    @Override
    public List<Book> sortBookByGenre() {
        List<Book> sortedList = bookRepository.getAllBook().stream()
                .sorted((a,b)->a.getGenre().compareTo(b.getGenre()))
                .collect(Collectors.toList());
        return sortedList;
    }

    @Override
    public List<Author> sortBookByAuthor() {
        List<Author> sortedList = authorRepository.getAuthors().stream()
                .sorted((author, author2)->author.getFName().compareTo(author2.getFName()))
                .collect(Collectors.toList());
        return sortedList;
    }

    @Override
    public int updateBook(int id, String title,String genre, String description, int rate) {
        Book book = new Book(id,title, genre, description,rate);
        int operationStatus = 0;
        if(checkIfBookExist(id)) {
            bookRepository.updateBookByIndex(getBookIndexById(id),book);
            operationStatus = 200;
        } else {
            operationStatus = 204;
        }
        return operationStatus;
    }

    @Override
    public int getBookIndexById(int id) {
        int index = 0 ;
        for (int i = 0; i < bookRepository.getAllBook().size(); i++) {
            if(id == bookRepository.getAllBook().get(i).getId()) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public int generateId() {
        int  freeID = 1;
        for (Book book : bookRepository.getAllBook()) {
            if (book.getId() == freeID) {
                freeID ++;
            }
        }
        return freeID;
    }

    @Override
    public boolean checkIfBookExist(int id) {
        boolean status = false;
        for(Book book : bookRepository.getAllBook()) {
            if(book.getId() == id) {
                status = true;
            } else {
                status = false;
            }
        }
        return status;
    }
}
