/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author HP
 */
public class DoctorDTO implements Serializable {
    private Integer id;
    private String name;
    private String phone;
    private String bio;
    private String photo;
    private ClinicDTO clinicId;
    private List<VisitDTO> visitList;

    public DoctorDTO() {
    }

    public DoctorDTO(Integer id) {
        this.id = id;
    }

    public DoctorDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ClinicDTO getClinicId() {
        return clinicId;
    }

    public void setClinicId(ClinicDTO clinicId) {
        this.clinicId = clinicId;
    }

    public List<VisitDTO> getVisitList() {
        return visitList;
    }

    public void setVisitList(List<VisitDTO> visitList) {
        this.visitList = visitList;
    }

   
    
}
