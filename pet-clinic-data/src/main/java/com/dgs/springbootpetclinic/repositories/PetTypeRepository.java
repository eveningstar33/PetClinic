package com.dgs.springbootpetclinic.repositories;

import com.dgs.springbootpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
