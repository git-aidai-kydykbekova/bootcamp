package com.example.demo.mapper.impl;

import com.example.demo.entities.AnonymsProduct;
import com.example.demo.entities.Product;
import com.example.demo.mapper.AnonymProductMapper;
import com.example.demo.product.AnonymProductResponse;
import org.springframework.stereotype.Component;

@Component
public class AnonymProductMapperImpl  implements AnonymProductMapper {

    @Override
    public AnonymProductResponse toDtoAnonym(AnonymsProduct anonymsProduct) {
        AnonymProductResponse anonymProductResponse = new AnonymProductResponse();
        anonymProductResponse.setName(anonymsProduct.getName());
        anonymProductResponse.setPrice(anonymsProduct.getPrice());
        return anonymProductResponse;
    }

}
