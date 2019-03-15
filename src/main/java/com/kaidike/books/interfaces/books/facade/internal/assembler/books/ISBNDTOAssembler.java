package com.kaidike.books.interfaces.books.facade.internal.assembler.books;

import com.kaidike.books.interfaces.books.facade.dto.books.BookDTO;
import com.kaidike.books.interfaces.books.facade.dto.books.ISBNDTO;

import java.util.Map;

public class ISBNDTOAssembler {

    public ISBNDTO toDTO(Map<String, String> params) {
        String isbn = params.get("isbn");

        ISBNDTO dto = new ISBNDTO(isbn);

        return dto;
    }
}
