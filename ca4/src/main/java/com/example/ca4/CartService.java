package com.example.ca4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    
    @Autowired
    private BookRepository bookRepository;

    public void addToCart(Long bookId, int quantity) {
        Book book = bookRepository.findById(bookId).orElseThrow(() -> new RuntimeException("NULL BOOK"));
        Cart cart = new Cart();
        cart.setBook(book);
        cart.setQuantity(quantity);
        cartRepository.save(cart);
    }

    public List<Cart> getCartItems() {
        return cartRepository.findAll();
    }

    public void removeFromCart(Long cartItemId) {
        cartRepository.deleteById(cartItemId);
    }
}