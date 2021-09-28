/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.dao.impl;

import com.clinic.vet.dao.AbstractRepo;
import com.clinic.vet.entity.Doctor;
import java.util.List;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class DoctorRepoImpl extends AbstractRepo<Doctor> {

    public DoctorRepoImpl() {
        super(Doctor.class);
    }
    public List<Doctor> getClinicDoctors(Integer id){
        String hql = "FROM Doctor WHERE clinicId = :id";
        Query query = getCurrentSession().createQuery(hql);
        query.setParameter("id",id);
        
        return query.getResultList();
    }
}
