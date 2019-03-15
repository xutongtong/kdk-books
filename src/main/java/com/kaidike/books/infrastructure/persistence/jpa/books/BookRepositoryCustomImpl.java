package com.kaidike.books.infrastructure.persistence.jpa.books;

import com.kaidike.books.domain.entities.books.Book;
import com.kaidike.books.domain.repositories.BookRepositoryCustom;

import java.util.ArrayList;

public class BookRepositoryCustomImpl implements BookRepositoryCustom {

    @Override
    public ArrayList<Book> findByIsbns(String isbns) {
        return null;
    }

}
