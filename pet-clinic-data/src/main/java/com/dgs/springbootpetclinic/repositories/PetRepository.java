package com.dgs.springbootpetclinic.repositories;

import com.dgs.springbootpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
