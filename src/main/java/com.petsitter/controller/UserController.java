package com.petsitter.controller;

import com.petsitter.entity.UserEntity;
import com.petsitter.entity.dto.Converter;
import com.petsitter.entity.dto.UserDto;
import com.petsitter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * for testing purposes
 */

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<UserDto> users()  {

		List<UserEntity> users = userService.getUsers();

		return Converter.convertUserToDto(users);
	}

//	@GetMapping(value = "/{companyName}/products")
//	public List<ProductDto> getProducts(@PathVariable("companyName") String companyName) {
//
//		CompanyEntity c = companyR.findByName(companyName);
//		List<ProductEntity> products = productService.getProductsByCompany(c);
//
//		return Converter.convertProductToDto(products);
//	}
}
