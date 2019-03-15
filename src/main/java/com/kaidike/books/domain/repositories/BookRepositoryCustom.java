package com.kaidike.books.domain.repositories;

import com.kaidike.books.domain.entities.books.Book;

import java.util.ArrayList;

public interface BookRepositoryCustom {

    ArrayList<Book> findByIsbns(String isbns);

}
