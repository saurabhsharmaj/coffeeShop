package com.coffeeadda.coffeedigital.service;

import java.util.List;

import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.ResponseEntity;

public interface MasterCoffeeShopService {

	MasterCoffeeShop addNewShop(MasterCoffeeShop masterCoffeeShop);

	ResponseEntity findAllCoffeeShop();

	void updateContactById(Integer id, String contact);

	MasterCoffeeShop findById(Integer id);

	List<MasterCoffeeShop> fetchAll();

	void updateQueueNumber(Integer queueNumber, Integer id);

	void updateQueueSize(Integer queueSize, Integer id);

	void updateShopTime(String openTime, String closeTime, Integer id);
	
	List<MasterCoffeeShop> fetchByRandomCoulmn(String columnValue);

	void setShopLocationById(Integer id, String latitude, String longitude);

}
