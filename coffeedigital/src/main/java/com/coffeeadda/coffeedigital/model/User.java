package com.coffeeadda.coffeedigital.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table
public class User{
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private int id;
	
	 private String username;
	 private String password;
	 
	 @ManyToMany(fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
	 
	 @JoinTable(name = "users_roles", 
	 joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), 
	 inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
	 private Collection<Role> role;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Collection<Role> getRole() {
		return role;
	}

	public void setRole(Collection<Role> role) {
		this.role = role;
	}

	public User(@NotNull int id, String username, String password, Collection<Role> role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", role=" + role + "]";
	}

	 
		
	

}
