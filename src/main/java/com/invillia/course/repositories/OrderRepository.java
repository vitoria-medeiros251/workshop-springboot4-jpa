package com.invillia.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.invillia.course.entities.Order;

public interface  OrderRepository extends JpaRepository <Order,Long> {

	
}
