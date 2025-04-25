package com.example.ca4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public void addReview(Review review) {
        reviewRepository.save(review);
    }
    
    public List<Review> getReviewById(Long bookId) {
        return reviewRepository.findByBookId(bookId);
    }
}