package com.coffeeadda.coffeedigital.service;

import com.coffeeadda.coffeedigital.model.Customer;
import com.coffeeadda.coffeedigital.model.ResponseEntity;

public interface CustomerService {

	Customer updateCustomerDetails(Customer customer);

	ResponseEntity getCustomerById(Integer id);

	Customer addNewCustomer(Customer customer);

	void deleteCustomerById(Integer id);

}
