package com.kaidike.books.interfaces.books.facade.dto.digital;

import com.kaidike.books.domain.entities.image.Image;

import java.util.ArrayList;

public class PointReadingDataDTO {
    private ArrayList<Image> images;

    private String content;

    private String size;

    private String time;

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
