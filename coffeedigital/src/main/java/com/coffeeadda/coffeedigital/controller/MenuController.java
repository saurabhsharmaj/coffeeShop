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

import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.Menu;
import com.coffeeadda.coffeedigital.service.MasterCoffeeShopService;
import com.coffeeadda.coffeedigital.service.MenuService;

@RestController
public class MenuController {

	@Autowired
	MenuService menuService;
	
	@PutMapping("/updateMenu")
	public Menu updateMenu(@RequestBody Menu menu)
	{
		return menuService.updateMenu(menu);
	}
	
	@GetMapping("/fecthAllMenu")
	public List<Menu> fetchAll(){
		return menuService.fndAll();
	}
	
	@PostMapping("/addNewItem")
	public Menu addNewItem(@RequestBody Menu menu) {
		return menuService.addNewItem(menu);
	}
	
	@DeleteMapping("deleteItem/{id}")
	public void deleteItem(@PathVariable Integer id) {
		menuService.deleteItem(id);
	}
}
