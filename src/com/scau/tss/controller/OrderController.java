package com.scau.tss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.scau.tss.entity.Order;
import com.scau.tss.service.OrderService;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping("/addOrder")
	public String addOrder(Order order) throws Exception {
		orderService.addOrder(order);
		return "success";
	}

}
