package com.example.mostafa.ecommercebackend.dao;

import com.example.mostafa.ecommercebackend.entity.Product;
import com.example.mostafa.ecommercebackend.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("http://mostaxd-ecommerce.s3-website.eu-central-1.amazonaws.com/")

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {



}
