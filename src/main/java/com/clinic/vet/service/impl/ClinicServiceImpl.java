/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.service.impl;

import com.clinic.vet.dao.impl.ClinicRepoImpl;
import com.clinic.vet.dto.ClinicDTO;
import com.clinic.vet.entity.Clinic;
import com.clinic.vet.service.ClinicService;
import java.util.ArrayList;
import java.util.List;
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
public class ClinicServiceImpl implements ClinicService {

    @Autowired
    ModelMapper modelMapper;
    @Autowired
    ClinicRepoImpl clinicRepo;

    @Override
    public ClinicDTO getClinicById(Integer clinicId) {
        Clinic clinic = clinicRepo.findById(clinicId);
        if (clinic != null) {
            return modelMapper.map(clinic, ClinicDTO.class);
        }
        return null;
    }

    @Override
    public List<ClinicDTO> SearchClinicByAddressOrPhone(String key) {
        List<Clinic> clinicList = clinicRepo.SearchClinicByAddressOrPhone(key);
        if (clinicList == null) {
            return null;
        }
        List<ClinicDTO> clinicDTOList = new ArrayList();
        for (Clinic clinic : clinicList) {
            clinicDTOList.add(modelMapper.map(clinic, ClinicDTO.class));
        }
        return clinicDTOList;
    }

}
