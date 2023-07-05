package com.petsitter.service;

import java.util.ArrayList;

import com.petsitter.entity.UserEntity;
import com.petsitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	@Override
	public User loadUserByUsername(String userName) throws UsernameNotFoundException {

		UserEntity user = repository.findByUserNameIgnoreCase(userName);

		if (user == null) {
			throw new UsernameNotFoundException("User Not Found " + userName + " ..");
		}

		SimpleGrantedAuthority a = new SimpleGrantedAuthority(user.getRole().toString());

		ArrayList<GrantedAuthority> auths = new ArrayList<>();
		auths.add(a);

		return new User(user.getUserName(), user.getPassword(), auths);
	}
}