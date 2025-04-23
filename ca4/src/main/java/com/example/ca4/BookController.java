package com.example.ca4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BooksRepository booksRepository;

    @GetMapping
    public List<Books> getBooks() {
        return booksRepository.findAll();
    }

    @PostMapping
    public Books addBooks(@RequestBody Books books) {
        return booksRepository.save(books);
    }
}