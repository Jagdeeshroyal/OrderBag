package com.jagadeesh.productservice.repository;

import com.jagadeesh.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
