package com.example.demo.mapper;

import com.example.demo.entities.AnonymsProduct;
import com.example.demo.entities.Product;
import com.example.demo.product.AnonymProductResponse;
import org.springframework.stereotype.Component;


public interface AnonymProductMapper  {
    AnonymProductResponse toDtoAnonym(AnonymsProduct anonymsProduct);

}
