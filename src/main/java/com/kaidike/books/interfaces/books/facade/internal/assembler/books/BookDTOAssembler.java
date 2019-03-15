package com.kaidike.books.interfaces.books.facade.internal.assembler.books;

import com.kaidike.books.domain.entities.books.Book;
import com.kaidike.books.interfaces.books.facade.dto.books.BookDTO;

public class BookDTOAssembler {

    public BookDTO toDTO(final Book books) {

        BookDTO dto = new BookDTO();

        books.getAudio();

        return dto;
    }

}
