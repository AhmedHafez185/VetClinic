/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.controller;

import com.clinic.vet.dto.VisitDTO;
import com.clinic.vet.service.VisitService;
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
@RequestMapping("/visit")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VisitController {

    @Autowired
    VisitService visitService;

    @GetMapping("/{id}")
    public VisitDTO getVisitById(@PathVariable Integer id) throws Exception {
        VisitDTO visitDTO = visitService.getVisitById(id);
        if (visitDTO != null) {
            return visitDTO;
        }
        throw new Exception(String.format("Visit Id Not Found"));
    }
}
