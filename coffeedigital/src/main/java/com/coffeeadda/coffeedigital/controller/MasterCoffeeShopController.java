package com.coffeeadda.coffeedigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.ResponseEntity;
import com.coffeeadda.coffeedigital.service.MasterCoffeeShopService;

@RestController
public class MasterCoffeeShopController {

	@Autowired
	MasterCoffeeShopService masterCoffeeShopService;
	

	
	
	@PostMapping("/addNewShop")
	public MasterCoffeeShop addNewShop(@RequestBody MasterCoffeeShop masterCoffeeShop) {
		return masterCoffeeShopService.addNewShop(masterCoffeeShop);
	}
	
	@GetMapping("listCoffeeShop")
	public ResponseEntity<MasterCoffeeShop> findAllCoffeeShop(){
		return masterCoffeeShopService.findAllCoffeeShop();
	}
	
	@PutMapping("updateQueueNumber")
	public void updateQueueNumber(@RequestParam Integer queueNumber, @RequestParam Integer id) {
		masterCoffeeShopService.updateQueueNumber(queueNumber, id);
	}
	
	@PutMapping("updateQueueSize")
	public void updateQueueSize(@RequestParam Integer queueSize, @RequestParam Integer id) {
		masterCoffeeShopService.updateQueueSize(queueSize, id);
	}
	
	@PutMapping("updateShopTime")
	public void updateShopTime(@RequestParam String openTime, @RequestParam String closeTime, @RequestParam Integer id) {
		masterCoffeeShopService.updateShopTime(openTime, closeTime, id);
	}
	
	@GetMapping("/fetchByRandomCoulmn")
	List<MasterCoffeeShop> fetchByRandomCoulmn(@RequestParam("columnName") String columnName, @RequestParam("columnValue") String columnValue){
		return masterCoffeeShopService.fetchByRandomCoulmn(columnValue);
	}
	
	@PutMapping("/setShopLocationById/{id}")
	public ResponseEntity setShopLocationById(@PathVariable Integer id, @RequestParam("latitude") String latitude, @RequestParam("longitude") String longitude) {
		 masterCoffeeShopService.setShopLocationById(id, latitude, longitude);
		 MasterCoffeeShop coffeeShop= masterCoffeeShopService.findById(id);
		 
		 if(coffeeShop==null)
			 return new ResponseEntity("something went wrong" ,null);
		 else
			 return new ResponseEntity("success", coffeeShop);
		 
		
	}
}
