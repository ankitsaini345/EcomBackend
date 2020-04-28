package com.ankit.ecom.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankit.ecom.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
