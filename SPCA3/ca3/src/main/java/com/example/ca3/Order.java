package com.example.ca3;

import jakarta.persistence.*;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int OrderID; 
    private String OrderDate;   
    private int CustomerID; 
    private String State; 
    private int TotalPrice; 
}
