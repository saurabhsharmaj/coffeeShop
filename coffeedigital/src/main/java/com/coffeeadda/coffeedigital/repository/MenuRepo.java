package com.coffeeadda.coffeedigital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coffeeadda.coffeedigital.model.Menu;

@Repository
public interface MenuRepo extends JpaRepository<Menu, Integer> {


	
}
