package com.siddhant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddhant.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	Product findById(long id);
}
