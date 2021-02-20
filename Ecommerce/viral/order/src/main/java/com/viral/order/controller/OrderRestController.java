package com.viral.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viral.order.model.Order;
import com.viral.order.service.IOrderService;

@RestController
@RequestMapping("/order")
public class OrderRestController {
		
	@Autowired
	private IOrderService orderService;
		
	@PostMapping("/create")
	public Order createOrder(Order order) {
		return orderService.createOrder(order);
	}
	
	@GetMapping("/getOrderStatus/{orderId}")
	public Order getOrderStatus(@PathVariable Long orderId) {
		return orderService.getOrderStatus(orderId);
	}
	
	@GetMapping("/viewOrders/{userId}")
	public Order viewOrders(@PathVariable Long userId) {
		return orderService.viewOrders(userId);
	}
	
//	public Order updateOrderStatus(Order order);
	
}
