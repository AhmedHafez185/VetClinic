/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.dao.impl;

import com.clinic.vet.dao.AbstractRepo;
import com.clinic.vet.entity.Pet;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class PetRepoImpl extends AbstractRepo<Pet> {

    public PetRepoImpl() {
        super(Pet.class);
    }

}
