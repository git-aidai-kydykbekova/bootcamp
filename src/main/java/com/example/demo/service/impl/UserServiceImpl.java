package com.example.demo.service.impl;

import com.example.demo.dto.UserRequest;
import com.example.demo.dto.UserResponse;
import com.example.demo.entities.User;

import com.example.demo.exception.ApiRequestException;
import com.example.demo.repositories.UserRepository;
import com.example.demo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public String findAll(String name) {
        User user = new User();
        user.setName(name);

        userRepository.save(user);
        return name+" registered!";
    }

    @Override
    public UserResponse getById(Long id) {
        Optional<User> user = userRepository.findById(id);
        if (user.isEmpty()){
            System.out.println("user is empty!");
        }
        else {
            UserResponse userResponse = new UserResponse();
            userResponse.setId(user.get().getId());
            userResponse.setAge(user.get().getAge());
            userResponse.setName(user.get().getName());
            return userResponse;

        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        Optional<User> user = userRepository.findById(id);

        if (user.isEmpty()){

            throw new ApiRequestException("We can't find id");
        }
        else {
            userRepository.deleteById(id);
        }

    }
    @Override
    public void updateById(Long id,UserRequest userRequest) {
        Optional<User> user = userRepository.findById(id);

        if (user.isEmpty()){
            System.out.println("EMPTY");
            throw new ApiRequestException("ID is NOT FOUNDED");
        }
        else {
            user.get().setName(userRequest.getName());
            user.get().setAge(userRequest.getAge());
            user.get().setCourse(userRequest.getCourse());
            userRepository.save(user.get());
        }

    }


    @Override
    public void register(UserRequest userRequest) {
        User user = new User();
        user.setAge(userRequest.getAge());
        user.setName(userRequest.getName());
        user.setCourse(userRequest.getCourse());

        userRepository.save(user);
    }


}