package com.kaidike.books.interfaces.books.facade.internal.assembler.person;

import com.kaidike.books.domain.entities.person.Author;
import com.kaidike.books.interfaces.books.facade.dto.digital.AudioDTO;
import com.kaidike.books.interfaces.books.facade.dto.person.AuthorDTO;

public class AuthorDTOAssembler {

    public AuthorDTO toDTO(final Author author) {

        AuthorDTO authorDTO = new AuthorDTO();

        authorDTO.setId(author.getId());
        authorDTO.setName(author.getName());
        authorDTO.setPicture(author.getPicture());

        return authorDTO;
    }

}
