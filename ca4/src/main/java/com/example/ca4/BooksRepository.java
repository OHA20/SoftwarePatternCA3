package com.example.ca4;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends JpaRepository<Books, Long> {
    List<Books> findByCategoryContaining(String category);
    List<Books> findByTitleContaining(String title);
}
