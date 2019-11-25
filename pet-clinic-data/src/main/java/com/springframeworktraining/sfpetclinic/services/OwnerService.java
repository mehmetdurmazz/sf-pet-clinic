package com.springframeworktraining.sfpetclinic.services;

import com.springframeworktraining.sfpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner,Long> {
	
	Owner findByLastName(String lastName);
	
}
