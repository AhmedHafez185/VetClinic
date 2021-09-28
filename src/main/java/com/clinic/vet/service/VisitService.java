/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.service;

import com.clinic.vet.dto.VisitDTO;

/**
 *
 * @author HP
 */
public interface VisitService {

    public VisitDTO getVisitById(Integer visitId);
}
