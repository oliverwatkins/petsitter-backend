package com.petsitter.service;

import com.petsitter.entity.UserEntity;
import com.petsitter.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;


//NOTE: UserService for authenticaiton is something different. see shape shop
@Service
public class UserService implements UserDetailsService {

	@Autowired
	private UserRepository repository;

	public List<UserEntity> getUsers() {
		List<UserEntity> result = StreamSupport.stream(repository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return result;
	}

//	public UserEntity getCompanyById(long id) {
//		return repository.findById(id);
//	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//TODO
		return null;
	}
}