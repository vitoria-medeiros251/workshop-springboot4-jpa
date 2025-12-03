package com.invillia.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;


import com.invillia.course.entities.Product;


public interface  ProductRepository extends JpaRepository <Product, Long> {

	
}
