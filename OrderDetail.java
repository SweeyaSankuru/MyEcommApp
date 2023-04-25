package com.order.app.entity;

import javax.persistence.*;

@Entity
@Table(name="details")
public class OrderDetail {
	
	@Id
	@Column(name="order_id")
	private Long orderId;
	
	@Column(name="transaction_id")
	private Long transactionId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="price")
	private Double price;
	
	@Column(name="full_address")
	private String fullAddress;
	
	@Column(name="payment_type")
	private String paymentType;
	
	@Column(name="description")
	private String orderStatus;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	// Annotations
	//@Entity


// Class
	public class Order {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private String customer_name;
		private String product_name;
		private String payment_type;
		private String full_address;

		private String status;


	}
	

}
