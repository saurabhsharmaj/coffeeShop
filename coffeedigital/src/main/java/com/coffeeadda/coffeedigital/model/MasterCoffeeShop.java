package com.coffeeadda.coffeedigital.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name="MASTER_COFFEE_SHOP")
public class MasterCoffeeShop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="SHOP_NAME")
	private String shopName;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name= "CONTACT")
	private String contact;
	
	@Column(name= "NUMBER_OF_QUEUE")
	private int numberOfQueue;
	
	@Column(name= "QUEUE_MAX_SIZE")
	private int queueMaxSize;
	

	@Column(name= "OPEN_TIME")
	private String openTime;
	
	@Column(name= "CLOSE_TIME")
	private String closeTime;
	
	@Column(name = "URL")
	private String url;
	

	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	

	
	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public int getNumberOfQueue() {
		return numberOfQueue;
	}

	public void setNumberOfQueue(int numberOfQueue) {
		this.numberOfQueue = numberOfQueue;
	}

	public int getQueueMaxSize() {
		return queueMaxSize;
	}

	public void setQueueMaxSize(int queueMaxSize) {
		this.queueMaxSize = queueMaxSize;
	}

	public MasterCoffeeShop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MasterCoffeeShop(Integer id, String shopName, String address, String contact, int numberOfQueue,
			int queueMaxSize, String openTime, String closeTime , String url) {
		super();
		this.id = id;
		this.shopName = shopName;
		this.address = address;
		this.contact = contact;
		this.numberOfQueue = numberOfQueue;
		this.queueMaxSize = queueMaxSize;
		this.openTime = openTime;
		this.closeTime = closeTime;
		this.url = url;
	}

	@Override
	public String toString() {
		return "MasterCoffeeShop [id=" + id + ", shopName=" + shopName + ", address=" + address + ", contact=" + contact
				+ ", numberOfQueue=" + numberOfQueue + ", queueMaxSize=" + queueMaxSize + ", openTime=" + openTime
				+ ", closeTime=" + closeTime + ", url=" + url + "]";
	}

	
	
	
	
	
}
