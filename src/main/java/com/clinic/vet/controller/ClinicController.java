/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.controller;

import com.clinic.vet.dto.ClinicDTO;
import com.clinic.vet.service.ClinicService;
import java.util.List;
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
@RequestMapping("/clinic")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ClinicController {

    @Autowired
    ClinicService clinicService;

    @GetMapping("/search/{key}")
    public List<ClinicDTO> SearchByAddressOrPhone(@PathVariable String key) {
        return clinicService.SearchClinicByAddressOrPhone(key);

    }

    @GetMapping("/{id}")
    public ClinicDTO getClinicById(@PathVariable Integer id) throws Exception {
        ClinicDTO clinicDTO = clinicService.getClinicById(id);
        if (clinicDTO != null) {
            return clinicDTO;
        }
       throw new Exception(String.format("Clinic Id Not Found"));
    }
}
