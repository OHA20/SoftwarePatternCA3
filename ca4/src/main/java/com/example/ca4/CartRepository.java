package com.example.ca4;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, String>{
	List<Cart> findByName();
}
