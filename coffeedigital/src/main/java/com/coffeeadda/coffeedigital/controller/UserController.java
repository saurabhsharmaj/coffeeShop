package com.coffeeadda.coffeedigital.controller;


import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coffeeadda.coffeedigital.dto.UserDto;
import com.coffeeadda.coffeedigital.model.User;
import com.coffeeadda.coffeedigital.service.UserService;



@RestController
public class UserController {
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
  private UserService service;
	
	
	@RequestMapping("/hello")
	private String login()
	{
		return "login";
	}
	
	@RequestMapping("/homePage")
	private String homePage()
	{
		return "welcome to Coffee shop";
	}
	@RequestMapping("/loginPage")
	private String loginPage(@RequestParam(value = "error",required = false) String error)
	{
		if (error != null) {
			return	 "Invalid Credentials provided.";
		}
		return "welcome to login page";
	}
	
	@RequestMapping("/userPage")
	private String userPage()
	{
		return "welcome to user page";
	}
	
	@RequestMapping("/adminPage")
	private String adminPage()
	{
		return "welcome to admin";
	}
	
	@PostMapping("/save")
	public User saveuser(@RequestBody User user) {
		//User user = modelMapper.map(userDto, User.class);
		
		return service.save(user);
	}
	
	@GetMapping("/users")
	public List<User> getalluser(){
		return service.getall();
	}
	
	@GetMapping("/user/{id}")
	public Optional<User> getbyids(@PathVariable int id) {
		return service.getbyid(id);
	}
	
	@DeleteMapping("/delete")
	public String deletebyid(@PathVariable int id) {
		 service.deleatByid(id);
		 
		 return "delete success ==="+id;
	}
	
	@PatchMapping("/update")
	public User updated(@RequestBody User user) {
		return service.updated(user);
	}
	

}
