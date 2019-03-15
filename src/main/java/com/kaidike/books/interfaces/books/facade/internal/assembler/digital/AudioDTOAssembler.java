package com.kaidike.books.interfaces.books.facade.internal.assembler.digital;

import com.kaidike.books.domain.entities.digital.Audio;
import com.kaidike.books.interfaces.books.facade.dto.digital.AudioDTO;

public class AudioDTOAssembler {

    public AudioDTO toDTO(final Audio audio) {

        AudioDTO audioDTO = new AudioDTO();

        audioDTO.setContent(audio.getContent());
        audioDTO.setSize(audio.getSize());
        audioDTO.setText(audio.getText());
        audioDTO.setTime(audio.getTime());
        audioDTO.setImages(audio.getImages());

        return audioDTO;
    }

}
