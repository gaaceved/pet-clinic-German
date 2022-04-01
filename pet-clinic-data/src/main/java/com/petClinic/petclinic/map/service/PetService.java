package com.petClinic.petclinic.map.service;


import com.petClinic.petclinic.map.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
