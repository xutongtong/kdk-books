package com.kaidike.books.interfaces.books.facade.service.books;

import com.kaidike.books.interfaces.books.facade.dto.books.BookDTO;
import com.kaidike.books.interfaces.books.facade.dto.books.ISBNDTO;

import java.util.ArrayList;

public interface BookServiceFacade {

    BookDTO findByISBN(ISBNDTO dto);

    ArrayList<BookDTO> findByISBNs(ArrayList<ISBNDTO> dto);
}
