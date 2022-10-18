package com.coffeeadda.coffeedigital.service;

import java.util.List;

import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.Menu;

public interface MenuService {

	List<Menu> fndAll();

	Menu addNewItem(Menu menu);

	Menu updateMenu(Menu menu);

	void deleteItem(Integer id);

	

}
