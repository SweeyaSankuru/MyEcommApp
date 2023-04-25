package com.order.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.order.app.entity.OrderDetail;
import com.order.app.repository.OrderDetailRepository;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	OrderDetailRepository orderDetailRepository;
	
	@GetMapping("/getAllOrders") 
	public List<OrderDetail> getAllOrders() {
		List<OrderDetail> orderDetailList = orderDetailRepository.findAll();
		return orderDetailList;
	}
	//@PostMapping("/createDetailedOrder")
	//public Order createDetailedOrder(@RequestBody Order product){
	//	Order newProduct=orderDetailRepository.save(product);
	//	return newProduct;
	//}

	

}
