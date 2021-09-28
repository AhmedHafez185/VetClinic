/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.service.impl;

import com.clinic.vet.dao.impl.OwnerRepoImpl;
import com.clinic.vet.dto.OwnerDTO;
import com.clinic.vet.entity.Owner;
import com.clinic.vet.service.OwnerService;
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
public class OwnerServiceImpl implements OwnerService {

    ModelMapper modelMapper;
    @Autowired
    OwnerRepoImpl ownerRepo;

    @Override
    public OwnerDTO getOwnerById(Integer ownerId) {
        Owner owner = ownerRepo.findById(ownerId);
        if (owner != null) {
            return modelMapper.map(owner, OwnerDTO.class);
        }
        return null;
    }
}
