package com.viral.order.service;

import com.viral.order.model.Order;

public interface IOrderService {

	public Order createOrder(Order order);
	
	public Order getOrderStatus(Long orderId);
	
	public Order updateOrderStatus(Order order);
	
	public Order viewOrders(Long userId); 
	
}
