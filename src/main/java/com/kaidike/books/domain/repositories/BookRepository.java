package com.kaidike.books.domain.repositories;

import com.kaidike.books.domain.entities.books.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long>, BookRepositoryCustom {

    Book findByIsbn(String isbn);

}
