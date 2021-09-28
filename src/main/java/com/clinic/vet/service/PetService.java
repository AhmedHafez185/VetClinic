/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.service;

import com.clinic.vet.dto.PetDTO;

/**
 *
 * @author HP
 */
public interface PetService {
     public PetDTO getPetById(Integer petId);
}
