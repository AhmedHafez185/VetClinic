/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.controller;

import com.clinic.vet.dto.OwnerDTO;
import com.clinic.vet.service.OwnerService;
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
@RequestMapping("/owner")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class OwnerController {

    @Autowired
    OwnerService ownerService;

    @GetMapping("/{id}")
    public OwnerDTO getOwnerById(@PathVariable Integer id) throws Exception {
        OwnerDTO ownerDTO = ownerService.getOwnerById(id);
        if (ownerDTO != null) {
            return ownerDTO;
        }
        throw new Exception(String.format("Owner Id Not Found"));
    }
}
