package com.example.demo.service.impl;


import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;

public interface UserService {
    String findAll(String name);

    UserResponse getById(Long id);

    void register(UserRequest userRequest);
    void deleteById(Long id);
    void updateById(Long id, UserRequest userRequest);
   // UserResponse deleteByID(Long id);
}