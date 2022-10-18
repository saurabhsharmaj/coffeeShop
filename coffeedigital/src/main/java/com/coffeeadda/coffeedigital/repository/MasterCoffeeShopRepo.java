package com.coffeeadda.coffeedigital.repository;

import java.sql.Time;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;

@Repository
public interface MasterCoffeeShopRepo extends JpaRepository<MasterCoffeeShop, Integer> {

//	MasterCoffeeShopDto saveAll(MasterCoffeeShopDto masterCoffeeShop);

//	List<MasterCoffeeShop> findAllCoffeeShop();

//	MasterCoffeeShopDto addNewShop(MasterCoffeeShopDto masterCoffeeShop);

	
	@Transactional
	@Modifying
	@Query("update MasterCoffeeShop m set m.contact = :contact where m.id = :id")
	void updateContactById(@Param("id") Integer id, @Param("contact") String contact);
	
	@Query(value = "select * from MASTER_COFFEE_SHOP", nativeQuery = true)
	List<MasterCoffeeShop> fetchAll();
	
	
	@Query(value = "select * from MASTER_COFFEE_SHOP m where m.address = :columnValue", nativeQuery = true)
	List<MasterCoffeeShop> fetchByRandomCoulmn(@Param("columnValue") String columnValue);
	
	

	@Transactional
	@Modifying
	@Query("update MasterCoffeeShop m set m.numberOfQueue = :numberOfQueue where m.id = :id")
	void updateQueueNumber(@Param("numberOfQueue") Integer numberOfQueue, @Param("id") Integer id);
	
	
	
	@Transactional
	@Modifying
	@Query("update MasterCoffeeShop m set m.queueMaxSize = :queueMaxSize where m.id = :id")
	void updateQueueSize(@Param("queueMaxSize") Integer queueMaxSize, @Param("id") Integer id);

	
	@Transactional
	@Modifying
	@Query("update MasterCoffeeShop m set m.openTime = :openTime, m.closeTime = :closeTime where m.id = :id")
	void updateShopTime(@Param("openTime")String openTime, @Param("closeTime") String closeTime, Integer id);

	@Transactional
	@Modifying
	@Query("update MasterCoffeeShop m set m.url = :map_url where m.id = :id")
	void updateShopLocationById(Integer id, String map_url);

	

	
	
}
