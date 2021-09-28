/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.service;

import com.clinic.vet.dto.ClinicDTO;
import com.clinic.vet.dto.DoctorDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public interface DoctorService {
    public DoctorDTO getDoctorById(Integer doctorId); 
    
     public List<DoctorDTO> getDoctorsClinicId(Integer clinicId);
}
