package com.coffeeadda.coffeedigital.service;

import java.util.List;

import com.coffeeadda.coffeedigital.dto.OrderDto;
import com.coffeeadda.coffeedigital.model.Order;

public interface OrderService {

	Order makeNewOrder(Order orderDto);

	OrderDto showOrderById(Integer id);

	List<OrderDto> showAllPendingOrders();

	void deleteOrderById(Integer id);

	void setDeliveredById(Integer id);

}
