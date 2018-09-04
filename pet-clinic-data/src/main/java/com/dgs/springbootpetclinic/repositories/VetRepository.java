package com.dgs.springbootpetclinic.repositories;

import com.dgs.springbootpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
