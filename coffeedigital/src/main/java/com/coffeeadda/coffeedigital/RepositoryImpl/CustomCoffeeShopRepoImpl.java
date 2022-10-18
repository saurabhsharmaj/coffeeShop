//package com.coffeeadda.coffeedigital.RepositoryImpl;
//
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import com.coffeeadda.coffeedigital.model.MasterCoffeeShop;
//import com.coffeeadda.coffeedigital.repository.CustomCoffeeShopRepo;
//
//public class CustomCoffeeShopRepoImpl implements CustomCoffeeShopRepo{
//
//	@Override
//	@Modifying
//	@Query(value = "update MasterCoffeeShop m set u.contact = :contact where u.id = :id", 
//	  nativeQuery = true)
//	public void updateContactById(@Param("id") Integer id, @Param("contact") String contact);
//
//}
