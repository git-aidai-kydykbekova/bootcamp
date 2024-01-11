package com.example.demo.service;

import com.example.demo.entities.AnonymsProduct;
import com.example.demo.product.AnonymProductResponse;

public interface AnonymProductService {
    AnonymProductResponse getById(Long id);
}
