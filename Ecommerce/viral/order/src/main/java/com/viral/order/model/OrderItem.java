package com.viral.order.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderItem")
public class OrderItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3301822209930782861L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderItemId")
	private Long orderItemId;
	
	@Column(name="PROD_ID")
	private List<Long> productId;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="STATUS")
	private String status;
	
}
