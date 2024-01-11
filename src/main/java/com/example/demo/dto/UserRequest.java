package com.example.demo.dto;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter

public class UserRequest {

    private String name;
    private String course;
    private Integer age;
}



