package com.invillia.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.invillia.course.entities.OrderItem;
import com.invillia.course.entities.pk.OrderItemPK;


public interface  OrderItemRepository extends JpaRepository <OrderItem,  OrderItemPK> {

	
	
}
