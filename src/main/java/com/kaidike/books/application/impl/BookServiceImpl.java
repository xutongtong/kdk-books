package com.kaidike.books.application.impl;

import com.kaidike.books.application.BookService;
import com.kaidike.books.domain.entities.books.Book;
import com.kaidike.books.domain.repositories.BookRepository;
import com.kaidike.books.interfaces.books.facade.dto.books.ISBNDTO;

import java.util.ArrayList;

public class BookServiceImpl implements BookService {

    private BookRepository bookRepository;

    @Override
    public Book findByISBN(ISBNDTO dto) {

        String isbn = dto.getIsbn();
        Book book = bookRepository.findByIsbn(isbn);

        return book;
    }

    @Override
    public ArrayList<Book> findByISBNs(ArrayList<ISBNDTO> dto) {

        String[] isbns = new String[dto.size()];

        int i = 0;
        for (ISBNDTO isbndto : dto) {
            isbns[i] = dto.get(i).getIsbn();
            ++i;
        }

        ArrayList<Book> books = bookRepository.findByIsbns(isbns.toString());

        return books;
    }
}
