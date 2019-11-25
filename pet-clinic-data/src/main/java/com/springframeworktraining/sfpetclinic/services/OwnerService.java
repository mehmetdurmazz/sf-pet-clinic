package com.springframeworktraining.sfpetclinic.services;

import java.util.Set;

import com.springframeworktraining.sfpetclinic.model.Owner;

public interface OwnerService {
	
	Owner findByLastName(String lastName);
	
	Owner findById(Long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
}
