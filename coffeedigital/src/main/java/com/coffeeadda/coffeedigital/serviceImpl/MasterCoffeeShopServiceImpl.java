package com.coffeeadda.coffeedigital.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.coffeeadda.coffeedigital.dto.Location;
import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.ResponseEntity;
import com.coffeeadda.coffeedigital.repository.MasterCoffeeShopRepo;
import com.coffeeadda.coffeedigital.service.MasterCoffeeShopService;
import com.coffeeadda.coffeedigital.utils.CoffeAddaConstants;

@Service
public class MasterCoffeeShopServiceImpl implements MasterCoffeeShopService{

	@Autowired
	MasterCoffeeShopRepo masterCoffeeShopRepo;
	
	@Autowired
	RestTemplate restTemp;
	
	@Override
	public MasterCoffeeShop addNewShop(MasterCoffeeShop masterCoffeeShop) {
		return masterCoffeeShopRepo.save(masterCoffeeShop);
	}


	@Override
	public ResponseEntity findAllCoffeeShop() {
		List<MasterCoffeeShop> coffeeShops= masterCoffeeShopRepo.findAll();
		if(coffeeShops.isEmpty())
			return new ResponseEntity("something went wrong", null);
		else
		{
			ResponseEntity response=new ResponseEntity();
			response.setMsg("success");
			response.setDataList(coffeeShops);
			return response;
		}
	}


	@Override
	public void updateContactById(Integer id,String contact) {
		 masterCoffeeShopRepo.updateContactById(id, contact);
		
	}


	@Override
	public MasterCoffeeShop findById(Integer id) {
		Optional<MasterCoffeeShop> list = masterCoffeeShopRepo.findById(id);
		if(!list.isEmpty())
			return list.get();
		else
			return null;
	}


	@Override
	public List<MasterCoffeeShop> fetchAll() {
		return masterCoffeeShopRepo.fetchAll();
	}


	@Override
	public void updateQueueNumber(Integer queueNumber, Integer id) {
		
		 masterCoffeeShopRepo.updateQueueNumber(queueNumber, id);
	}


	@Override
	public void updateQueueSize(Integer queueSize, Integer id) {
		 masterCoffeeShopRepo.updateQueueSize(queueSize, id);		
	}


	@Override
	public void updateShopTime(String openTime, String closeTime, Integer id) {
		 masterCoffeeShopRepo.updateShopTime(openTime, closeTime, id);
		
	}


	@Override
	public List<MasterCoffeeShop> fetchByRandomCoulmn(String columnValue) {
		return masterCoffeeShopRepo.fetchByRandomCoulmn(columnValue);
//		return null;
	}


	@Override
	public void setShopLocationById(Integer id, String latitude, String longitude) {
		
		String combineUrl= CoffeAddaConstants.locationUrl + latitude + "," + longitude;

		Location resp = restTemp.getForObject(combineUrl, Location.class); 
		
		
		 masterCoffeeShopRepo.updateShopLocationById(id, resp.getMap_url());
	}

}
