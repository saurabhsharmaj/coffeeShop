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
@Table(name="CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name="CUSTOMER_NAME")
	private String customerName;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name= "CONTACT")
	private String contact;
	
//	@OneToOne(mappedBy = "customerId")
//	@JsonBackReference
//    private Order order;

//	public Order getOrder() {
//		return order;
//	}
//
//	public void setOrder(Order order) {
//		this.order = order;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
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

	
	public Customer() {
		super();
	}

	public Customer(Integer id, String customerName, String address, String contact /*, Order order*/) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.address = address;
		this.contact = contact;
		//this.order = order;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", address=" + address + ", contact=" + contact + "]";
	}


	
	
		
}
