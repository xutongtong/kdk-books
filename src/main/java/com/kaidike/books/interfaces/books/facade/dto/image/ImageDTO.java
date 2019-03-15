package com.kaidike.books.interfaces.books.facade.dto.image;

public class ImageDTO {

    private String thumb;

    public ImageDTO(String thumb) {
        this.thumb = thumb;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
