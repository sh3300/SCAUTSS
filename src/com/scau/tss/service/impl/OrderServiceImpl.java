package com.scau.tss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scau.tss.dao.OrderMapper;
import com.scau.tss.entity.Order;
import com.scau.tss.entity.OrderExample;
import com.scau.tss.service.OrderService;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderMapper orderMapper;

	@Override
	public List<Order> selectOrderByUserId(int id) {

		OrderExample orderExample = new OrderExample();
		OrderExample.Criteria criteria = orderExample.createCriteria();
		// 添加查询条件，方法格式：“and”+字段名+判断方式
		// 如and+UserId+EqualTo为通过userid查询order
		criteria.andUserIdEqualTo(1);
		List<Order> orderList = orderMapper.selectByExample(orderExample);
		return orderList;
	}

	@Override
	public void addOrder(Order order) throws Exception {
		// TODO Auto-generated method stub

	}

}
