package com.zosh.service;


import com.zosh.exception.OrderException;
import com.zosh.model.OrderItem;
import com.zosh.model.Product;

public interface OrderItemService {

	OrderItem getOrderItemById(Long id) throws Exception;
	


}
