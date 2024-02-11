package com.michelewm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.michelewm.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
