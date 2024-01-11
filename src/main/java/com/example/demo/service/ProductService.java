package com.example.demo.service;

import com.example.demo.product.ProductRequest;
import com.example.demo.product.ProductResponse;

import java.util.List;

public interface ProductService {
    
    void registerProduct(ProductRequest productRequest);
    void updateById(Long id, ProductRequest productRequest);

    ProductResponse getById(Long id);

    void addProduct(ProductRequest productRequest);


    List<ProductResponse> getAll();
}
