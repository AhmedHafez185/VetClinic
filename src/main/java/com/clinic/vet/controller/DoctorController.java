/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.controller;

import com.clinic.vet.dto.DoctorDTO;
import com.clinic.vet.service.DoctorService;
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
@RequestMapping("/doctor")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @GetMapping("/{id}")
    public DoctorDTO getDoctorById(@PathVariable Integer id) throws Exception {
        DoctorDTO doctorDTO = doctorService.getDoctorById(id);
        if (doctorDTO != null) {
            return doctorDTO;
        }
        throw new Exception(String.format("Doctor Id Not Found"));
    }
    @GetMapping("/getClinicDoctor/{id}")
    public List<DoctorDTO> getDoctorsByClinicId(@PathVariable Integer id) throws Exception {
        if(id==null){
            throw new Exception(String.format("Please Enter Clinic Id !!"));
        }
        List<DoctorDTO> doctorDTOList = doctorService.getDoctorsClinicId(id);
        if (doctorDTOList != null) {
            return doctorDTOList;
        }
        throw new Exception(String.format("This Clinic Has not Doctor!!"));
    }
}
