package com.coffeeadda.coffeedigital.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="MASTER_ORDER")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="ORDER_DATE")
	private LocalDate orderDate;
	
	@Column(name="WAITING_NUMBER_IN_QUEUE")
	private Integer waitingNumberInQueue;
	
	@Column(name="WAITING_TIME")
	private String waitingTime;
	
	@Column(name="DELIVERED")
	private Boolean delivered;
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "customer_id", referencedColumnName = "id")
	@Column(name="CUSTOMER_ID")
    private Integer customerId;

//	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "shop_Id", referencedColumnName = "id")
   @Column(name="SHOP_ID")
	private Integer shopId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
	}

	
	
	public Boolean getDelivered() {
		return delivered;
	}

	public void setDelivered(Boolean delivered) {
		this.delivered = delivered;
	}

	

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderDate=" + orderDate + ", waitingNumberInQueue=" + waitingNumberInQueue
				+ ", waitingTime=" + waitingTime + ", delivered=" + delivered + ", customerId=" + customerId
				+ ", shopId=" + shopId + "]";
	}

	
	public Order(Integer id, LocalDate orderDate, Integer waitingNumberInQueue, String waitingTime, Boolean delivered,
			Integer customerId, Integer shopId) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.waitingNumberInQueue = waitingNumberInQueue;
		this.waitingTime = waitingTime;
		this.delivered = delivered;
		this.customerId = customerId;
		this.shopId = shopId;
	}

	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

//@Override
//	public String toString() {
//		return "Order [id=" + id + ", orderDate=" + orderDate + ", waitingNumberInQueue=" + waitingNumberInQueue
//				+ ", waitingTime=" + waitingTime + ", delivered=" + delivered + ", customerId=" + customerId + "]";
//	}
//
//public Order(Integer id, LocalDate orderDate, Integer waitingNumberInQueue, String waitingTime, Boolean delivered,
//		Customer customerId) {
//	super();
//	this.id = id;
//	this.orderDate = orderDate;
//	this.waitingNumberInQueue = waitingNumberInQueue;
//	this.waitingTime = waitingTime;
//	this.delivered = delivered;
//	this.customerId = customerId;
//}

	
	
}
