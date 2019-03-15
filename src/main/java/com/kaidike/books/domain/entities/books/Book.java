package com.kaidike.books.domain.entities.books;

import com.kaidike.books.domain.entities.digital.Audio;
import com.kaidike.books.domain.entities.digital.PointReadingData;
import com.kaidike.books.domain.entities.image.Image;
import com.kaidike.books.domain.entities.person.Author;
import com.kaidike.books.domain.entities.person.Drawer;
import com.kaidike.books.domain.entities.publisher.Publisher;

import java.util.ArrayList;

public class Book {

    private Long id;

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

    private ArrayList<Image> images;

    private Author author;

    private Drawer drawer;

    private Audio audio;

    private Publisher publisher;

    private PointReadingData pointReadingData;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Drawer getDrawer() {
        return drawer;
    }

    public void setDrawer(Drawer drawer) {
        this.drawer = drawer;
    }

    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public PointReadingData getPointReadingData() {
        return pointReadingData;
    }

    public void setPointReadingData(PointReadingData pointReadingData) {
        this.pointReadingData = pointReadingData;
    }
}
