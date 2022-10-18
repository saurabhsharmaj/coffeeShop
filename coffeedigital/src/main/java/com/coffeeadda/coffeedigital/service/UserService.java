package com.coffeeadda.coffeedigital.service;

import java.util.List;
import java.util.Optional;

import com.coffeeadda.coffeedigital.model.User;

public interface UserService {

	public User save(User user);
	
	
	public List<User> getall();
	
	
	public Optional<User> getbyid(int id) ;
	
	public void deleatByid(int id);
	
	
	public User updated(User user) ;

}
