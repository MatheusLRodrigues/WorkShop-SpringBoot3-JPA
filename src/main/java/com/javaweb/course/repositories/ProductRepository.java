package com.javaweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
