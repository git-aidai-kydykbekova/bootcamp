package com.example.demo.product;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class AnonymProductResponse {

    private Long id;
    private String name;
    private Integer price;

}
