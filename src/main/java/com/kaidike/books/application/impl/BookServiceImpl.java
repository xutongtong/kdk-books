package com.kaidike.books.application.impl;

import com.kaidike.books.application.BookService;
import com.kaidike.books.domain.entities.books.Book;
import com.kaidike.books.interfaces.books.facade.dto.books.BookDTO;
import com.kaidike.books.interfaces.books.facade.dto.books.ISBNDTO;

import java.util.ArrayList;

public class BookServiceImpl implements BookService {

    @Override
    public Book findByISBN(ISBNDTO dto) {
        return null;
    }

    @Override
    public ArrayList<Book> findByISBNs(ArrayList<ISBNDTO> dto) {
        return null;
    }
}
