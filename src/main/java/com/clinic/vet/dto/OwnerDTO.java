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
public class OwnerDTO implements Serializable {

    private Integer id;
    private String name;
    private String phone;
    private String address;
    private String gender;
    private List<PetDTO> petList;

    public OwnerDTO() {
    }

    public OwnerDTO(Integer id) {
        this.id = id;
    }

    public OwnerDTO(Integer id, String name, String gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    
    public List<PetDTO> getPetList() {
        return petList;
    }

    public void setPetList(List<PetDTO> petList) {
        this.petList = petList;
    }

   
    
}
