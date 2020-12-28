package com.hty.sp01.service;

import java.util.List;

import com.hty.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}
