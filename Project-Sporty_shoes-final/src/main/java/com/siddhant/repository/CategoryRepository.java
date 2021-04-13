package com.siddhant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siddhant.model.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

	  Category findById(long id);
}
