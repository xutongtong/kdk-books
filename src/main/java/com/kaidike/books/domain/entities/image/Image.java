package com.kaidike.books.domain.entities.image;

public class Image {

    private Long id;

    private String original;

    private String thumb;

    public String compress() {

        return "";
    }

    public String upload() {

        return "";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
