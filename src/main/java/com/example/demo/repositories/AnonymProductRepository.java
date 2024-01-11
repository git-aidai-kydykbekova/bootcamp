package com.example.demo.repositories;

import com.example.demo.entities.AnonymsProduct;
import com.example.demo.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnonymProductRepository  extends JpaRepository<AnonymsProduct, Long> {

}
