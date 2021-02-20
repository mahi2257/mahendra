package com.viral.order.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viral.order.dao.OrderRepo;
import com.viral.order.model.Order;
import com.viral.order.service.IOrderService;

@Service
public class OrderService implements IOrderService{

	@Autowired
	private OrderRepo orderRepo;
	
	@Override
	public Order createOrder(Order order) {
		Order orderDtls = orderRepo.save(order);
		return orderDtls;
	}

	@Override
	public Order getOrderStatus(Long orderId) {
		Optional<Order> order =  orderRepo.findById(orderId);
		if(order.isPresent()) {
			return order.get();
		}
		return null;
	}

	@Override
	public Order updateOrderStatus(Order order) {
		return createOrder(order);
	}

	@Override
	public Order viewOrders(Long userId) {
		Order orderStatus = orderRepo.findByUserId(userId);
		return orderStatus;
	}

}
