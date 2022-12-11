package com.example.mostafa.ecommercebackend.dao;

import com.example.mostafa.ecommercebackend.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;


@CrossOrigin("http://mostaxd-ecommerce.s3-website.eu-central-1.amazonaws.com")
public interface ProductRepository extends JpaRepository<Product, Long> {

}
