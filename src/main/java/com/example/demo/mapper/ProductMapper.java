package com.example.demo.mapper;

import com.example.demo.entities.Product;
import com.example.demo.product.ProductResponse;

import java.util.List;

public interface ProductMapper {
    ProductResponse toDto(Product product);

    List<ProductResponse> toDtoS(List<Product> all);
}
