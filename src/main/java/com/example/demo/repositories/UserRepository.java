package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<com.example.demo.entities.User, Long> {

}
