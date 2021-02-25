package com.ivanskiy.library.service.author;

import com.ivanskiy.library.model.Author;

public interface AuthorService {

     int createAuthor(String fName, String lName);
     int deleteAuthor(int id);
     int updateAuthor(int id, String fName, String lName);
     boolean existAuthor(int id);
     Author addBookToAuthor(int author_id, int book_id);
     int getAuthorIndexById(int id);
     Author getAuthorById(int id);
     int generateId();
}
