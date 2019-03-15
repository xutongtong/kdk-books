package com.kaidike.books.interfaces.books.facade.service.books.impl;

import com.kaidike.books.application.BookService;
import com.kaidike.books.domain.entities.books.Book;
import com.kaidike.books.interfaces.books.facade.dto.books.BookDTO;
import com.kaidike.books.interfaces.books.facade.dto.books.ISBNDTO;
import com.kaidike.books.interfaces.books.facade.internal.assembler.books.BookDTOAssembler;
import com.kaidike.books.interfaces.books.facade.service.books.BookServiceFacade;

import java.util.ArrayList;

public class BookServiceFacadeImpl implements BookServiceFacade {

    private BookService bookService;

    @Override
    public BookDTO findByISBN(ISBNDTO dto) {

        Book book = bookService.findByISBN(dto);

        BookDTOAssembler dtoAssembler = new BookDTOAssembler();

        BookDTO bookDTO = dtoAssembler.toDTO(book);

        return bookDTO;
    }

    @Override
    public ArrayList<BookDTO> findByISBNs(ArrayList<ISBNDTO> dto) {

        ArrayList<Book> books = bookService.findByISBNs(dto);

        ArrayList<BookDTO> booksDTO = new ArrayList<>();

        BookDTOAssembler dtoAssembler = new BookDTOAssembler();

        for (Book book : books) {
            BookDTO bookDTO = dtoAssembler.toDTO(book);

            booksDTO.add(bookDTO);
        }

        return booksDTO;
    }
}
