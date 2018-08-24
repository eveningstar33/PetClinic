package com.dgs.springbootpetclinic.services;

import com.dgs.springbootpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
