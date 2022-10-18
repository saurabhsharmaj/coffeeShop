package com.coffeeadda.coffeedigital.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.ResponseEntity;
import com.coffeeadda.coffeedigital.service.MasterCoffeeShopService;

@RestController
public class AdminController {

	@Autowired
	MasterCoffeeShopService coffeeShopService;
	
	@PutMapping("/updateContact")
	public ResponseEntity updateContactById(@RequestParam Integer id , @RequestParam String contact)
	{
		 coffeeShopService.updateContactById(id, contact);
		 
		 MasterCoffeeShop coffeeShop=  coffeeShopService.findById(id);
		 
		 if(coffeeShop==null)
			 return new ResponseEntity("something went wrong" ,null);
		 else
			 return new ResponseEntity("success", coffeeShop);
	}
	
	@GetMapping("/fecth")
	public List<MasterCoffeeShop> fetchAll(){
		return coffeeShopService.fetchAll();
	}
}
