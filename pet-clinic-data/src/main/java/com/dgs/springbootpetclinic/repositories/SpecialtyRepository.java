package com.dgs.springbootpetclinic.repositories;

import com.dgs.springbootpetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
