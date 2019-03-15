package com.kaidike.books.interfaces.books.facade.internal.assembler.publisher;

import com.kaidike.books.domain.entities.publisher.Publisher;
import com.kaidike.books.interfaces.books.facade.dto.publisher.PublisherDTO;

public class PublisherDTOAssembler {

    public PublisherDTO toDTO(final Publisher publisher) {

        PublisherDTO publisherDTO = new PublisherDTO();

        publisherDTO.setId(publisher.getId());
        publisherDTO.setName(publisher.getName());
        publisherDTO.setLogo(publisher.getLogo());

        return publisherDTO;
    }

}
