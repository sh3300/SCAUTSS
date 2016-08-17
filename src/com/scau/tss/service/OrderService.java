package com.scau.tss.service;

import java.util.List;

import com.scau.tss.entity.Order;

public interface OrderService {

	public List<Order> selectOrderByUserId(int id) throws Exception;

	public void addOrder(Order order) throws Exception;
}
