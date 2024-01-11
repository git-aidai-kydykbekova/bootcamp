package com.example.demo.product;

import com.example.demo.enums.Type;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductResponse {
    private Long id;
    private String name;
    private String description;
    private Integer price;
    private String date;
    @Enumerated(EnumType.STRING)
    private Type type;
}
