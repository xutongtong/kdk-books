package com.kaidike.books.interfaces.books.facade.internal.assembler.image;

import com.kaidike.books.domain.entities.image.Image;
import com.kaidike.books.interfaces.books.facade.dto.image.ImageDTO;

public class ImageDTOAssembler {

    public ImageDTO toDTO(final Image image) {
        String thumb = image.getThumb();
        ImageDTO imageDTO = new ImageDTO(thumb);

        return imageDTO;
    }

}
