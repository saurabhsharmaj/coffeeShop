package com.coffeeadda.coffeedigital.serviceImpl;

import java.sql.Time;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeadda.coffeedigital.model.Customer;
import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.ResponseEntity;
import com.coffeeadda.coffeedigital.repository.CustomerRepo;
import com.coffeeadda.coffeedigital.repository.MasterCoffeeShopRepo;
import com.coffeeadda.coffeedigital.service.CustomerService;
import com.coffeeadda.coffeedigital.service.MasterCoffeeShopService;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerRepo customerRepo;

	@Override
	public Customer updateCustomerDetails(Customer customer) {
		return customerRepo.save(customer);
	}

	@Override
	public ResponseEntity getCustomerById(Integer id) {
		Optional<Customer> customer= customerRepo.findById(id);
		
		
		 if(customer.isEmpty())
			 return new ResponseEntity("something went wrong" ,null);
		 else
			 return new ResponseEntity("success", customer.get());
	}

	@Override
	public Customer addNewCustomer(Customer customer) {
		return  customerRepo.save(customer);
	}
	
	@Override
	public void deleteCustomerById(Integer id) {
		customerRepo.deleteById(id);
	}
	

}
