package com.coffeeadda.coffeedigital.dto;

import java.time.LocalDate;

import com.coffeeadda.coffeedigital.model.Customer;
import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;

public class OrderDto {

	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	private LocalDate orderDate;
	
	private Integer waitingNumberInQueue;
	
	private String waitingTime;
	
	private Boolean delivered;
	
	
    private Customer customerId;

    private MasterCoffeeShop shopId;

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getWaitingNumberInQueue() {
		return waitingNumberInQueue;
	}

	public void setWaitingNumberInQueue(Integer waitingNumberInQueue) {
		this.waitingNumberInQueue = waitingNumberInQueue;
	}

	public String getWaitingTime() {
		return waitingTime;
	}

	public void setWaitingTime(String waitingTime) {
		this.waitingTime = waitingTime;
	}

	public Boolean getDelivered() {
		return delivered;
	}

	public void setDelivered(Boolean delivered) {
		this.delivered = delivered;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public MasterCoffeeShop getShopId() {
		return shopId;
	}

	public void setShopId(MasterCoffeeShop shopId) {
		this.shopId = shopId;
	}

	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDto(Integer id, LocalDate orderDate, Integer waitingNumberInQueue, String waitingTime,
			Boolean delivered, Customer customerId, MasterCoffeeShop shopId) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.waitingNumberInQueue = waitingNumberInQueue;
		this.waitingTime = waitingTime;
		this.delivered = delivered;
		this.customerId = customerId;
		this.shopId = shopId;
	}

	@Override
	public String toString() {
		return "OrderDto [id=" + id + ", orderDate=" + orderDate + ", waitingNumberInQueue=" + waitingNumberInQueue
				+ ", waitingTime=" + waitingTime + ", delivered=" + delivered + ", customerId=" + customerId
				+ ", shopId=" + shopId + "]";
	}


	
}
