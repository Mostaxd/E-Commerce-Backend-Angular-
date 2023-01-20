package com.example.mostafa.ecommercebackend.controller;

import com.example.mostafa.ecommercebackend.dao.ProductRepository;
import com.example.mostafa.ecommercebackend.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("http://mostaxd-ecommerce.s3-website.eu-central-1.amazonaws.com/")
public class ProductCategoryController {

    @Autowired
    private ProductRepository repository;

    @GetMapping("/api/category/{category}")
    public List<Product> findByCategory(@PathVariable("category") String category){
        return repository.findByCategory(category);
    }
}
