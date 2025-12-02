package com.invillia.course.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.invillia.course.entities.User;

public interface  UserRepository extends JpaRepository <User, Long> {

	
}
