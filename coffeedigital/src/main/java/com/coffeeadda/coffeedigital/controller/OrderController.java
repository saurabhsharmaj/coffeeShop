package com.coffeeadda.coffeedigital.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coffeeadda.coffeedigital.dto.OrderDto;
import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.Order;
import com.coffeeadda.coffeedigital.service.MasterCoffeeShopService;
import com.coffeeadda.coffeedigital.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/makeNewOrder")
	public Order makeNewOrder(@RequestBody Order orderDto) {
		
		return orderService.makeNewOrder(orderDto);
	}
	
	@GetMapping("/showOrderById/{id}")
	public OrderDto showOrderById(@PathVariable Integer id) {
		return orderService.showOrderById(id);
	}
	
	@GetMapping("/showAllPendingOrders")
	public List<OrderDto> showAllPendingOrders(){
		return orderService.showAllPendingOrders();
	}
	
	@DeleteMapping("/deleteOrderById/{id}")
	public void deleteOrderById(@PathVariable Integer id) {
		orderService.deleteOrderById(id);
	}
	
	@PutMapping("/setDeliveredById/{id}")
	public String setDeliveredById(@PathVariable Integer id) {
		
		orderService.setDeliveredById(id);
		
		return "Enjoy your Coffee!! thanks for coming";
	}
	
}
