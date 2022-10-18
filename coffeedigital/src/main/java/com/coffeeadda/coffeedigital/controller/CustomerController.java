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

import com.coffeeadda.coffeedigital.model.Customer;
import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.ResponseEntity;
import com.coffeeadda.coffeedigital.service.CustomerService;
import com.coffeeadda.coffeedigital.service.MasterCoffeeShopService;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PutMapping("/updateCustomerDetails")
	public ResponseEntity updateCustomerDetails(@RequestBody Customer customer)
	{
		customer= customerService.updateCustomerDetails(customer);
		
		 if(customer==null)
			 return new ResponseEntity("something went wrong" ,null);
		 else
			 return new ResponseEntity("success", customer);
		 
	}
	
	@GetMapping("/getCustomerById/{id}")
	public ResponseEntity getCustomerById(@PathVariable Integer id){
		return customerService.getCustomerById(id);
		
		
	}
	
	@PostMapping("/addNewCustomer")
	public ResponseEntity addNewCustomer(@RequestBody Customer customer) {
		customer = customerService.addNewCustomer(customer);
		
		if(customer==null)
			 return new ResponseEntity("something went wrong" ,null);
		 else
			 return new ResponseEntity("success", customer);
	}
	
	@DeleteMapping("/deleteCustomerById/{id}")
	public void deleteCustomerById(@PathVariable Integer id) {
		customerService.deleteCustomerById(id);
	}
}
