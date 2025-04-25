package com.example.ca4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books/{bookId}/reviews")
public class ReviewController {
    @Autowired
    private ReviewRepository reviewRepository;
    
    @GetMapping
    public String getReviews(@PathVariable Long bookId, Model model) {
        List<Review> reviews = reviewRepository.findByBookId(bookId);
        model.addAttribute("reviews", reviews);
        model.addAttribute("bookId", bookId);
        return "reviews";
    }
}