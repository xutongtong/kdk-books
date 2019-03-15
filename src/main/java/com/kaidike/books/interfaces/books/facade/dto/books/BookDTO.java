package com.kaidike.books.interfaces.books.facade.dto.books;

import com.kaidike.books.interfaces.books.facade.dto.digital.AudioDTO;
import com.kaidike.books.interfaces.books.facade.dto.digital.PointReadingDataDTO;
import com.kaidike.books.interfaces.books.facade.dto.image.ImageDTO;
import com.kaidike.books.interfaces.books.facade.dto.person.AuthorDTO;
import com.kaidike.books.interfaces.books.facade.dto.person.DrawerDTO;
import com.kaidike.books.interfaces.books.facade.dto.publisher.PublisherDTO;

import java.io.Serializable;
import java.util.ArrayList;

public final class BookDTO implements Serializable {
    private String isbn;

    private String name;

    private String price;

    private String size;

    private String height;

    private String pages;

    private String binding;

    private String recommendAges;

    private String content;

    private String country;

    private ArrayList<ImageDTO> images;

    private AuthorDTO author;

    private DrawerDTO drawer;

    private AudioDTO audio;

    private PublisherDTO publisher;

    private PointReadingDataDTO pointReadingData;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getPages() {
        return pages;
    }

    public void setPages(String pages) {
        this.pages = pages;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getRecommendAges() {
        return recommendAges;
    }

    public void setRecommendAges(String recommendAges) {
        this.recommendAges = recommendAges;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ArrayList<ImageDTO> getImages() {
        return images;
    }

    public void setImages(ArrayList<ImageDTO> images) {
        this.images = images;
    }

    public AuthorDTO getAuthor() {
        return author;
    }

    public void setAuthor(AuthorDTO author) {
        this.author = author;
    }

    public DrawerDTO getDrawer() {
        return drawer;
    }

    public void setDrawer(DrawerDTO drawer) {
        this.drawer = drawer;
    }

    public AudioDTO getAudio() {
        return audio;
    }

    public void setAudio(AudioDTO audio) {
        this.audio = audio;
    }

    public PublisherDTO getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherDTO publisher) {
        this.publisher = publisher;
    }

    public PointReadingDataDTO getPointReadingData() {
        return pointReadingData;
    }

    public void setPointReadingData(PointReadingDataDTO pointReadingData) {
        this.pointReadingData = pointReadingData;
    }
}
