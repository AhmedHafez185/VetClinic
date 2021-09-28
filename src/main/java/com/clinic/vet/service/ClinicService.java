/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.service;

import com.clinic.vet.dto.ClinicDTO;
import java.util.List;

/**
 *
 * @author HP
 */
public interface ClinicService {
  
    public ClinicDTO getClinicById(Integer clinicId);
    
    public List<ClinicDTO> SearchClinicByAddressOrPhone(String key);
}
