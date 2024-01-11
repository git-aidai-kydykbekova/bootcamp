package com.example.demo.controller;
import com.example.demo.product.ProductRequest;
import com.example.demo.product.ProductResponse;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;
import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;


    @PostMapping("/register")
    public void registerProduct(@RequestBody ProductRequest productRequest) {
        productService.registerProduct(productRequest);

    }

    @GetMapping("/{id}")
    public ProductResponse productResponse(@PathVariable Long id) {
        return productService.getById(id);

    }

    @PutMapping("/update/{id}")
    public void updateProduct(@PathVariable Long id, @RequestBody ProductRequest productRequest) {
        productService.updateById(id, productRequest);
    }

    @PostMapping("/add")
    public void addProduct(@RequestBody ProductRequest productRequest) {
        productService.addProduct(productRequest);
    }

    @GetMapping("/getAll")
    public List<ProductResponse> productResponses() {
        return productService.getAll();
    }

}
