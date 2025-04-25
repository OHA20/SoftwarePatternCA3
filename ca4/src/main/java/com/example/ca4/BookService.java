package com.example.ca4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getBooksByCategory(String category) {
        return bookRepository.findByCategoryContainingIgnoreCase(category);
    }
}