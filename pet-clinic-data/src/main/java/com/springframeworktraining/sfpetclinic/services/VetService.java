package com.springframeworktraining.sfpetclinic.services;

import java.util.Set;

import com.springframeworktraining.sfpetclinic.model.Vet;

public interface VetService {

	Vet findById(Long id);
	
	Vet save(Vet pet);
	
	Set<Vet> findAll();
}
