package com.hty.sp01.service;

import com.hty.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}
