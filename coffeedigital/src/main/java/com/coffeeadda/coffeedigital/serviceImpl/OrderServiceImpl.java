package com.coffeeadda.coffeedigital.serviceImpl;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeadda.coffeedigital.dto.OrderDto;
import com.coffeeadda.coffeedigital.model.Customer;
import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.Menu;
import com.coffeeadda.coffeedigital.model.Order;
import com.coffeeadda.coffeedigital.repository.CustomerRepo;
import com.coffeeadda.coffeedigital.repository.MasterCoffeeShopRepo;
import com.coffeeadda.coffeedigital.repository.OrderRepo;
import com.coffeeadda.coffeedigital.service.MasterCoffeeShopService;
import com.coffeeadda.coffeedigital.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepo orderRepo;
	
	@Autowired
	ModelMapper mapper;
	
	@Autowired
	CustomerRepo customerRepo;
	
	@Autowired
	MasterCoffeeShopRepo coffeeShopRepo;

	@Override
	public Order makeNewOrder(Order orderDto) {
		
		Order order =mapper.map(orderDto, Order.class);
		return orderRepo.save(order);
	}

	
	@Override
	public OrderDto showOrderById(Integer id) {
		Order order= orderRepo.findById(id).get();
		Customer customer= customerRepo.findById(order.getCustomerId()).get();
		MasterCoffeeShop coffeeShop =coffeeShopRepo.findById(order.getShopId()).get();
		OrderDto orderDto=new OrderDto();
		
		orderDto.setCustomerId(customer);
		orderDto.setShopId(coffeeShop);
		orderDto.setId(id);
		orderDto.setOrderDate(order.getOrderDate());
		orderDto.setDelivered(order.getDelivered());
		orderDto.setWaitingNumberInQueue(order.getWaitingNumberInQueue());
		orderDto.setWaitingTime(order.getWaitingTime());
		
		
		
		
		
		return orderDto;
	}

	@Override
	public List<OrderDto> showAllPendingOrders() {
		List<Order> orderList= orderRepo.showAllPendingOrders();
		List<OrderDto> orderDtoList=new ArrayList<>();
		for(Order order :orderList) {
			Customer customer= customerRepo.findById(order.getCustomerId()).get();
			MasterCoffeeShop coffeeShop =coffeeShopRepo.findById(order.getShopId()).get();
			OrderDto orderDto=new OrderDto();
			
			orderDto.setCustomerId(customer);
			orderDto.setShopId(coffeeShop);
			orderDto.setId(order.getId());
			orderDto.setOrderDate(order.getOrderDate());
			orderDto.setDelivered(order.getDelivered());
			orderDto.setWaitingNumberInQueue(order.getWaitingNumberInQueue());
			orderDto.setWaitingTime(order.getWaitingTime());
			
			orderDtoList.add(orderDto);
		}
		
		return orderDtoList;
	}


	@Override
	public void deleteOrderById(Integer id) {
		orderRepo.deleteById(id);
		
	}


	@Override
	public void setDeliveredById(Integer id) {
		orderRepo.setDeliveredById(id);
		
	}
	
	
}
