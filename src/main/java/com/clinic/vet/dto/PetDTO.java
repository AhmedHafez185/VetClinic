/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.dto;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HP
 */
public class PetDTO implements Serializable {

    
    private Integer id;
    private String name;
    private String kind;
    private String gender;
    private String photo;
    private Date birthDate;
    private BigInteger weight;
    private List<VisitDTO> visitList;
    private OwnerDTO ownerId;

    public PetDTO() {
    }

    public PetDTO(Integer id) {
        this.id = id;
    }

    public PetDTO(Integer id, String name, String kind, String gender, Date birthDate, BigInteger weight) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.gender = gender;
        this.birthDate = birthDate;
        this.weight = weight;
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

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public BigInteger getWeight() {
        return weight;
    }

    public void setWeight(BigInteger weight) {
        this.weight = weight;
    }

    @XmlTransient
    public List<VisitDTO> getVisitList() {
        return visitList;
    }

    public void setVisitList(List<VisitDTO> visitList) {
        this.visitList = visitList;
    }

    public OwnerDTO getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(OwnerDTO ownerId) {
        this.ownerId = ownerId;
    }

  
    
}
