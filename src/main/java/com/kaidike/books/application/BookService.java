package com.kaidike.books.application;

import com.kaidike.books.interfaces.books.facade.dto.books.ISBNDTO;
import com.kaidike.books.domain.entities.books.Book;

import java.util.ArrayList;

public interface BookService {

    Book findByISBN(ISBNDTO dto);

    ArrayList<Book> findByISBNs(ArrayList<ISBNDTO> dto);

}
