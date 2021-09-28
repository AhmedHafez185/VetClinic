/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author HP
 */
@Entity
@Table(name = "pet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pet.findAll", query = "SELECT p FROM Pet p"),
    @NamedQuery(name = "Pet.findById", query = "SELECT p FROM Pet p WHERE p.id = :id"),
    @NamedQuery(name = "Pet.findByName", query = "SELECT p FROM Pet p WHERE p.name = :name"),
    @NamedQuery(name = "Pet.findByKind", query = "SELECT p FROM Pet p WHERE p.kind = :kind"),
    @NamedQuery(name = "Pet.findByGender", query = "SELECT p FROM Pet p WHERE p.gender = :gender"),
    @NamedQuery(name = "Pet.findByPhoto", query = "SELECT p FROM Pet p WHERE p.photo = :photo"),
    @NamedQuery(name = "Pet.findByBirthDate", query = "SELECT p FROM Pet p WHERE p.birthDate = :birthDate"),
    @NamedQuery(name = "Pet.findByWeight", query = "SELECT p FROM Pet p WHERE p.weight = :weight")})
public class Pet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "kind")
    private String kind;
    @Basic(optional = false)
    @Column(name = "gender")
    private String gender;
    @Column(name = "photo")
    private String photo;
    @Basic(optional = false)
    @Column(name = "birth_date")
    @Temporal(TemporalType.DATE)
    private Date birthDate;
    @Basic(optional = false)
    @Column(name = "weight")
    private BigInteger weight;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "petId")
    private List<Visit> visitList;
    @JoinColumn(name = "owner_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Owner ownerId;

    public Pet() {
    }

    public Pet(Integer id) {
        this.id = id;
    }

    public Pet(Integer id, String name, String kind, String gender, Date birthDate, BigInteger weight) {
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
    public List<Visit> getVisitList() {
        return visitList;
    }

    public void setVisitList(List<Visit> visitList) {
        this.visitList = visitList;
    }

    public Owner getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Owner ownerId) {
        this.ownerId = ownerId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pet)) {
            return false;
        }
        Pet other = (Pet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.clinic.vet.entity.Pet[ id=" + id + " ]";
    }
    
}
