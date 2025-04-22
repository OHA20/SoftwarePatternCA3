package com.example.ca3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewsService {

    @Autowired
    private ReviewsRepository reviewsRepository;

    public List<Reviews> getAllReviews() {
        return reviewsRepository.findAll();
    }

    public Reviews saveReviews(Reviews reviews) {
        return reviewsRepository.save(reviews);
    }

    public void deleteReviews(Integer reviewsId) {
    	reviewsRepository.deleteById(reviewsId);
    }
}