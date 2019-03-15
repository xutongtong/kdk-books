package com.kaidike.books.interfaces.books.facade.internal.assembler.digital;

import com.kaidike.books.domain.entities.digital.PointReadingData;
import com.kaidike.books.interfaces.books.facade.dto.digital.PointReadingDataDTO;

public class PointReadingDataDTOAssembler {

    public PointReadingDataDTO toDTO(final PointReadingData pointReadingData) {

        PointReadingDataDTO pointReadingDataDTO = new PointReadingDataDTO();

        pointReadingDataDTO.setContent(pointReadingData.getContent());
        pointReadingDataDTO.setImages(pointReadingData.getImages());
        pointReadingDataDTO.setSize(pointReadingData.getSize());
        pointReadingDataDTO.setTime(pointReadingData.getTime());

        return pointReadingDataDTO;
    }

}
