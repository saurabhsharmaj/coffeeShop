package com.coffeeadda.coffeedigital.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.Menu;
import com.coffeeadda.coffeedigital.repository.MasterCoffeeShopRepo;
import com.coffeeadda.coffeedigital.repository.MenuRepo;
import com.coffeeadda.coffeedigital.service.MasterCoffeeShopService;
import com.coffeeadda.coffeedigital.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService{

	@Autowired
	MenuRepo menuRepo;

	@Override
	public List<Menu> fndAll() {
		return (List<Menu>) menuRepo.findAll();
	}

	@Override
	public Menu addNewItem(Menu menu) {
		return menuRepo.save(menu);
	}

	@Override
	public Menu updateMenu(Menu menu) {
		return menuRepo.save(menu);
	}

	@Override
	public void deleteItem(Integer id) {
		menuRepo.deleteById(id);
	}
	
	


}
