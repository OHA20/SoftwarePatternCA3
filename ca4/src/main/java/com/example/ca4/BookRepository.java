package com.example.ca4;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByCategoryContainingIgnoreCase(String category);
    List<Book> findByTitleContainingIgnoreCase(String title);
}
