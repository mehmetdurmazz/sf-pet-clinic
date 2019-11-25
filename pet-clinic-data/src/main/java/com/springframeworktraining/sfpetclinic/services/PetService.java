package com.springframeworktraining.sfpetclinic.services;

import java.util.Set;

import com.springframeworktraining.sfpetclinic.model.Pet;

public interface PetService {
	
	Pet findById(Long id);
	
	Pet save(Pet pet);
	
	Set<Pet> findAll();

}
