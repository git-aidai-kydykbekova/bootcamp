package com.example.demo.controller;

import com.example.demo.product.AnonymProductResponse;
import com.example.demo.service.AnonymProductService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nano")
@AllArgsConstructor
public class AnonymProductController {
    private final AnonymProductService anonymProductService;
    @GetMapping("/anonym/{id}")
    public AnonymProductResponse anonymProductResponse(@PathVariable Long id) {
        return anonymProductService.getById(id);
    }
}
