package com.petsitter.service;

import com.petsitter.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PetService {

	@Autowired
	private PetRepository repository;

}