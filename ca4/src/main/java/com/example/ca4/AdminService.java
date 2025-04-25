package com.example.ca4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private BookRepository bookRepository;
    
    @Autowired
    private UserRepository userRepository;

    public void updateStock(Long bookId, int newStock) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setStockLevel(newStock);
        bookRepository.save(book);
    }

    public List<User> getCustomerList() {
        return userRepository.findByRole("CUSTOMER");
    }
}