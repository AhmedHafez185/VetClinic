/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author HP
 */
public class VisitDTO implements Serializable {

    private Integer id;
    private Date visitDate;
    private ClinicDTO clinicId;
    private DoctorDTO doctorId;
    private PetDTO petId;

    public VisitDTO() {
    }

    public VisitDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public ClinicDTO getClinicId() {
        return clinicId;
    }

    public void setClinicId(ClinicDTO clinicId) {
        this.clinicId = clinicId;
    }

    public DoctorDTO getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(DoctorDTO doctorId) {
        this.doctorId = doctorId;
    }

    public PetDTO getPetId() {
        return petId;
    }

    public void setPetId(PetDTO petId) {
        this.petId = petId;
    }

}
