package com.example.demo.controller;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.impl.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MainController {

    private final UserRepository userRepository;
    private final UserService userService;

    @GetMapping("/allUsers")
    List<User> users(){
        return userRepository.findAll();
    }
    @GetMapping("/user/{id}")
    public UserResponse userResponse(@PathVariable Long id){
        return userService.getById(id);
    }
    @PostMapping("/register")
    public void register(@RequestBody UserRequest userRequest){
        userService.register(userRequest);
    }
    @DeleteMapping ("/delete/{id}")
    public void delete(@PathVariable Long id) {
        userService.deleteById(id);
    }
    @PutMapping("/update/{id}")
    public void update(@PathVariable Long id, @RequestBody UserRequest userRequest) {
        userService.updateById(id,userRequest);
    }

}




