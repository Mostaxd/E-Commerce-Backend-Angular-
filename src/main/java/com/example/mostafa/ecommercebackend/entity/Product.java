package com.example.mostafa.ecommercebackend.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.Date;


    @Entity
    @Table(name="product")
    @Data

    public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name = "title")
        private String title;

        @Column(name = "description")
        private String description;

        @Column(name = "price")
        private BigDecimal price;

        @Column(name = "image")
        private String image;

        @Column(name = "category")
        private String category;

    }

