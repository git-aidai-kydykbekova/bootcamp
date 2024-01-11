package com.example.demo.service.impl;

import com.example.demo.entities.Product;
import com.example.demo.enums.Type;
import com.example.demo.exception.ApiRequestException;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.product.ProductRequest;
import com.example.demo.product.ProductResponse;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;
    @Override
    public ProductResponse getById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isEmpty())
            System.out.println("NO ID");
        return productMapper.toDto(product.get());
    }

    @Override
    public void registerProduct(ProductRequest productRequest) {
        Product product = new Product();

        product.setName(productRequest.getName());
        product.setPrice(productRequest.getPrice());
        product.setDate(productRequest.getDate());
        product.setDescription(productRequest.getDescription());
        product.setType(productRequest.getType());

        productRepository.save(product);
    }
    @Override
    public void addProduct(ProductRequest productRequest) {
        Product product = new Product();
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());
        product.setDate(productRequest.getDate());
        if (!containsType(String.valueOf(productRequest.getType())))
            System.out.println("No");
        product.setType(productRequest.getType());
        productRepository.save(product);
    }

    @Override
    public List<ProductResponse> getAll() {
        return productMapper.toDtoS(productRepository.findAll());
    }


//    @Override
//    public ProductResponse getById(Long id) {
//        Optional<Product> product = productRepository.findById(id);
//        if (product.isEmpty()) {
//            throw new ApiRequestException("THERE IS NO SUCH ID");
//        }
//        else {
//
//            ProductResponse productResponse = new ProductResponse();
//            productResponse.setId(product.get().getId());
//            productResponse.setDescription(product.get().getDescription());
//            productResponse.setName(product.get().getName());
//            productResponse.setDate(product.get().getDate());
//            productResponse.setPrice(product.get().getPrice());
//            productResponse.setType(product.get().getType());
//
//            return productResponse;
//        }
//    }

    public boolean containsType(String s){
        for (Type type: Type.values()){
            if (type.name().equalsIgnoreCase(s)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void updateById(Long id, ProductRequest productRequest) {
        Optional<Product> product = productRepository.findById(id);

        if(product.isEmpty()) {
            throw new ApiRequestException("ID iS NOT FOUNDED");
        }
        else {
            product.get().setType(productRequest.getType());
            product.get().setName(productRequest.getName());
            product.get().setDate(productRequest.getDate());
            product.get().setDescription(productRequest.getDescription());
            product.get().setPrice(productRequest.getPrice());

            productRepository.save(product.get());
        }
    }
    
}

