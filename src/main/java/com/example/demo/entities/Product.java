package com.example.demo.entities;

import com.example.demo.enums.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product_table")

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Integer price;
    private String date;
    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToOne
    User owner;
}
