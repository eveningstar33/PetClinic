package com.dgs.springbootpetclinic.services;

import com.dgs.springbootpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
