package com.example.ca3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reviews")
public class ReviewsController {

    @Autowired
    private ReviewsService reviewsService;

    @GetMapping
    public List<Reviews> getAllReviews() {
        return reviewsService.getAllReviews();
    }

    @PostMapping
    public Reviews saveReviews(@RequestBody Reviews reviews) {
        return reviewsService.saveReviews(reviews);
    }

    @DeleteMapping("/{id}")
    public void deleteReviews(@PathVariable Integer id) {
        reviewsService.deleteReviews(id);
    }
}
 