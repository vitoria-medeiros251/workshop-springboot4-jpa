package com.invillia.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.invillia.course.entities.Order;

import com.invillia.course.repositories.OrderRepository;


@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
		
	}
	
   public Order findyById(long id) {
   Optional<Order> obj = repository.findById(id);
   return obj.get();
  }

}
