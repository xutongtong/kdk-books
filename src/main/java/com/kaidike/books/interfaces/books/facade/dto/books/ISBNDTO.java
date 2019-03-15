package com.kaidike.books.interfaces.books.facade.dto.books;

import java.io.Serializable;

public final class ISBNDTO implements Serializable {

    private String isbn;

    public ISBNDTO(String isbn) {
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}