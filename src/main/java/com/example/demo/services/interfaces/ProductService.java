package com.example.demo.services.interfaces;

import com.example.demo.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product insertProduct(Product Product);
    Product updateProduct(Product Product);
    Integer deleteProduct(Product Product);
}
