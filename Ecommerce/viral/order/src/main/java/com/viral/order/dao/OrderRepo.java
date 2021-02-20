package com.viral.order.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viral.order.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long>{

	public Order findByUserId(Long userId);
	
}
