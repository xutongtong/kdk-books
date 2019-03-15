package com.kaidike.books.interfaces.books.web;

import com.kaidike.books.interfaces.books.facade.dto.books.BookDTO;
import com.kaidike.books.interfaces.books.facade.dto.books.ISBNDTO;
import com.kaidike.books.interfaces.books.facade.service.books.BookServiceFacade;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Map;

@RestController
public class BookController {

    private BookServiceFacade bookService;

    @RequestMapping(value = "/books/:isbn", method = RequestMethod.GET)
    public String book(@RequestParam Map<String,String> params) {
        String isbn = params.get("isbn");

        if (isbn.isEmpty()) {
           // throw new ParamsErrorException();
        }

        ISBNDTO isbndto = new ISBNDTO(isbn);

        BookDTO bookDTO = bookService.findByISBN(isbndto);

        return null;
    }

    @RequestMapping(value = "/books/:isbns", method = RequestMethod.GET)
    public String books(@RequestParam Map<String,String> params) {
        String isbn = params.get("isbn");

        if (isbn.isEmpty()) {
            // throw new ParamsErrorException();
        }

        ISBNDTO isbndto = new ISBNDTO(isbn);

        ArrayList<ISBNDTO> isbnDTOs = new ArrayList<>();
        isbnDTOs.add(isbndto);

        ArrayList<BookDTO> bookDTOs = bookService.findByISBNs(isbnDTOs);

        return null;
    }


}
