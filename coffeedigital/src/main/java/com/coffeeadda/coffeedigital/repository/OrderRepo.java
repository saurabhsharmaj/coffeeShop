package com.coffeeadda.coffeedigital.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
import com.coffeeadda.coffeedigital.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {



	@Query(value = "select * from MASTER_ORDER where DELIVERED = 0", nativeQuery = true)
	List<Order> showAllPendingOrders();

	@Transactional
	@Modifying
	@Query(value = "update MASTER_ORDER set DELIVERED = 1 where ID= :id", nativeQuery = true)
	void setDeliveredById(Integer id);

	
	
}
