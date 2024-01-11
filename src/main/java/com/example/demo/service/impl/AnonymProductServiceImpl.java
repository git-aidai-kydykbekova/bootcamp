package com.example.demo.service.impl;

import com.example.demo.entities.AnonymsProduct;
import com.example.demo.mapper.AnonymProductMapper;
import com.example.demo.product.AnonymProductResponse;
import com.example.demo.repositories.AnonymProductRepository;
import com.example.demo.service.AnonymProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AnonymProductServiceImpl implements AnonymProductService {
    private final AnonymProductRepository anonymProductRepository;
    private final AnonymProductMapper anonymProductMapper;
    @Override
    public AnonymProductResponse getById(Long id) {
        Optional<AnonymsProduct> anonymsProduct = anonymProductRepository.findById(id);
        if (anonymsProduct.isEmpty())
            System.out.println("NO ID");
        return anonymProductMapper.toDtoAnonym(anonymsProduct.get());
    }
}
