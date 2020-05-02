package com.ankit.ecom.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankit.ecom.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
