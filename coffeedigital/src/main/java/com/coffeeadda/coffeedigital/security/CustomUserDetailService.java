package com.coffeeadda.coffeedigital.security;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.coffeeadda.coffeedigital.model.User;

@Service
public class CustomUserDetailService implements UserDetailsService {

	@Autowired
	private com.coffeeadda.coffeedigital.repository.UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		

		Optional<User> optionalUser = repo.findByUsername(username);
        return Optional.ofNullable(optionalUser).orElseThrow(()->new UsernameNotFoundException("Username Not Found ======"+username))
               .map(CustomUserDetails::new).get();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
