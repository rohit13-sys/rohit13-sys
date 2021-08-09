package com.pheonix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pheonix.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
