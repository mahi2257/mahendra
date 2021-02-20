package com.viral.order.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="order")
public class Order implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8250957787771544163L;

	@Id
	@Column(name="orderId_fk", columnDefinition = "INT")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="ORDER_ID")
	private List<OrderItem> orderItem;
	
	@Column(name="USER_ID")
	private Long userId;
	
	@Column(name="PRICE")
	private float price;
	
	@Column(name="DIS_PRICE")
	private float disPrice;
	
	@Column(name="TOT_PRICE")
	private float totalPrice;
}
