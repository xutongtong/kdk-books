package com.kaidike.books.interfaces.books.facade.internal.assembler.books;

import com.kaidike.books.domain.entities.books.Book;
import com.kaidike.books.domain.entities.image.Image;
import com.kaidike.books.interfaces.books.facade.dto.books.BookDTO;
import com.kaidike.books.interfaces.books.facade.dto.digital.AudioDTO;
import com.kaidike.books.interfaces.books.facade.dto.digital.PointReadingDataDTO;
import com.kaidike.books.interfaces.books.facade.dto.image.ImageDTO;
import com.kaidike.books.interfaces.books.facade.dto.person.AuthorDTO;
import com.kaidike.books.interfaces.books.facade.dto.person.DrawerDTO;
import com.kaidike.books.interfaces.books.facade.dto.publisher.PublisherDTO;
import com.kaidike.books.interfaces.books.facade.internal.assembler.digital.AudioDTOAssembler;
import com.kaidike.books.interfaces.books.facade.internal.assembler.digital.PointReadingDataDTOAssembler;
import com.kaidike.books.interfaces.books.facade.internal.assembler.image.ImageDTOAssembler;
import com.kaidike.books.interfaces.books.facade.internal.assembler.person.AuthorDTOAssembler;
import com.kaidike.books.interfaces.books.facade.internal.assembler.person.DrawerDTOAssembler;
import com.kaidike.books.interfaces.books.facade.internal.assembler.publisher.PublisherDTOAssembler;

import java.util.ArrayList;

public class BookDTOAssembler {

    public BookDTO toDTO(final Book book) {

        BookDTO bookDTO = new BookDTO();

        bookDTO.setIsbn(book.getIsbn());
        bookDTO.setBinding(book.getBinding());
        bookDTO.setContent(book.getContent());
        bookDTO.setCountry(book.getCountry());
        bookDTO.setName(book.getName());
        bookDTO.setHeight(book.getHeight());
        bookDTO.setPages(book.getPages());
        bookDTO.setPrice(book.getPrice());
        bookDTO.setSize(book.getSize());
        bookDTO.setRecommendAges(book.getRecommendAges());

        // image
        ImageDTOAssembler imageDTOAssembler = new ImageDTOAssembler();

        ArrayList<Image> images = book.getImages();
        ArrayList<ImageDTO> imageDTOs = new ArrayList<>();
        for (Image image : images) {
            ImageDTO imageDTO = imageDTOAssembler.toDTO(image);
            imageDTOs.add(imageDTO);
        }
        bookDTO.setImages(imageDTOs);

        // audio
        AudioDTOAssembler audioDTOAssembler = new AudioDTOAssembler();
        AudioDTO audioDTO = audioDTOAssembler.toDTO(book.getAudio());

        bookDTO.setAudio(audioDTO);

        // author
        AuthorDTOAssembler authorDTOAssembler = new AuthorDTOAssembler();
        AuthorDTO authorDTO = authorDTOAssembler.toDTO(book.getAuthor());

        bookDTO.setAuthor(authorDTO);

        // drawer
        DrawerDTOAssembler drawerDTOAssembler = new DrawerDTOAssembler();
        DrawerDTO drawerDTO = drawerDTOAssembler.toDTO(book.getDrawer());

        bookDTO.setDrawer(drawerDTO);

        // publisher
        PublisherDTOAssembler publisherDTOAssembler = new PublisherDTOAssembler();
        PublisherDTO publisherDTO = publisherDTOAssembler.toDTO(book.getPublisher());

        bookDTO.setPublisher(publisherDTO);


        // pointreadingdata
        PointReadingDataDTOAssembler pointReadingDataDTOAssembler = new PointReadingDataDTOAssembler();
        PointReadingDataDTO pointReadingDataDTO = pointReadingDataDTOAssembler.toDTO(book.getPointReadingData());

        bookDTO.setPointReadingData(pointReadingDataDTO);

        return bookDTO;
    }

}
