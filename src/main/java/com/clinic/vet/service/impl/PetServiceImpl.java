/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.service.impl;

import com.clinic.vet.dao.impl.PetRepoImpl;
import com.clinic.vet.dto.PetDTO;
import com.clinic.vet.entity.Pet;
import com.clinic.vet.service.PetService;
import javax.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HP
 */
@Service
@Transactional
public class PetServiceImpl implements PetService {

    ModelMapper modelMapper;
    @Autowired
    PetRepoImpl petRepo;

    @Override
    public PetDTO getPetById(Integer petId) {
        Pet pet = petRepo.findById(petId);
        if (pet != null) {
            return modelMapper.map(pet, PetDTO.class);
        }
        return null;
    }
}
