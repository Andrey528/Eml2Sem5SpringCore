package com.example.Eml2Sem5SpringCore.controllers;

import com.example.Eml2Sem5SpringCore.models.Book;
import com.example.Eml2Sem5SpringCore.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {
    private final BookService bookService;

    @GetMapping()
    public List<Book> getAllBook(){
        System.out.println("im here");
        return bookService.getAllBooks();
    }
}
