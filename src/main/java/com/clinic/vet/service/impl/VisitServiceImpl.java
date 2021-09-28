/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.service.impl;

import com.clinic.vet.dao.impl.VisitRepoImpl;
import com.clinic.vet.dto.VisitDTO;
import com.clinic.vet.entity.Visit;
import com.clinic.vet.service.VisitService;
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
public class VisitServiceImpl implements VisitService {

    ModelMapper modelMapper;
    @Autowired
    VisitRepoImpl visitRepo;

    @Override
    public VisitDTO getVisitById(Integer visitId) {
        Visit visit = visitRepo.findById(visitId);
        if (visit != null) {
            return modelMapper.map(visit, VisitDTO.class);
        }
        return null;
    }
}
