/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.controller;

import com.clinic.vet.dto.PetDTO;
import com.clinic.vet.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HP
 */
@RestController
@RequestMapping("/pet")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PetController {

    @Autowired
    PetService petService;

    @GetMapping("/{id}")
    public PetDTO getPetById(@PathVariable Integer id) throws Exception {
        PetDTO petDTO = petService.getPetById(id);
        if (petDTO != null) {
            return petDTO;
        }
        throw new Exception(String.format("Pet Id Not Found"));
    }
}
