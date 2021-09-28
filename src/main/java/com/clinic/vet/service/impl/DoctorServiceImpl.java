/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.service.impl;
import com.clinic.vet.dao.impl.DoctorRepoImpl;
import com.clinic.vet.dto.ClinicDTO;
import com.clinic.vet.dto.DoctorDTO;
import com.clinic.vet.entity.Clinic;
import com.clinic.vet.entity.Doctor;
import com.clinic.vet.service.DoctorService;
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
public class DoctorServiceImpl implements DoctorService {

    ModelMapper modelMapper;
    @Autowired
    DoctorRepoImpl doctorRepo;

    @Override
    public DoctorDTO getDoctorById(Integer doctorId) {
        Doctor doctor = doctorRepo.findById(doctorId);
        if (doctor != null) {
            return modelMapper.map(doctor, DoctorDTO.class);
        }
        return null;
    }

    @Override
    public List<DoctorDTO> getDoctorsClinicId(Integer clinicId) {
         List<Doctor> doctorList = doctorRepo.getClinicDoctors(clinicId);
        if (doctorList == null) {
            return null;
        }
        List<DoctorDTO> doctorDTOList = new ArrayList();
        for (Doctor doctor : doctorList) {
            doctorDTOList.add(modelMapper.map(doctor, DoctorDTO.class));
        }
        return doctorDTOList;
    }
}
