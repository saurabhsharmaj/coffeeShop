package com.coffeeadda.coffeedigital.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeeadda.coffeedigital.model.User;
import com.coffeeadda.coffeedigital.repository.UserRepository;
import com.coffeeadda.coffeedigital.service.UserService;

@Service
public class UserServicesImpl implements UserService{
	
	@Autowired
	private UserRepository repo;
	
	@Override
	public User save(User user) {
		return repo.save(user);
		
	}
	
	@Override
	public List<User> getall(){
		return repo.findAll();
	}
	
	@Override
	public Optional<User> getbyid(int id) {
		return repo.findById(id);
	}
	
	@Override
	public void deleatByid(int id) {
		 repo.deleteById(id);
	}
	
	@Override
	public User updated(User user) {
		
		User existuser= repo.findById(user.getId()).orElse(null);
		
		existuser.setUsername(user.getUsername());
		existuser.setPassword(user.getPassword());
		
		
		return repo.save(existuser);
			
		
	}

}
