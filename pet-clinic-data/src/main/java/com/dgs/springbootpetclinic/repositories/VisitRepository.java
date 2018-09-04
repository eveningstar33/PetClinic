package com.dgs.springbootpetclinic.repositories;

import com.dgs.springbootpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
