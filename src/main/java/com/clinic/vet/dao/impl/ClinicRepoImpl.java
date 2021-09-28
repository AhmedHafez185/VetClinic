/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clinic.vet.dao.impl;

import com.clinic.vet.dao.AbstractRepo;
import com.clinic.vet.entity.Clinic;
import java.util.List;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HP
 */
@Repository
public class ClinicRepoImpl extends AbstractRepo<Clinic> {

    public ClinicRepoImpl() {
        super(Clinic.class);
    }

    public List<Clinic> SearchClinicByAddressOrPhone(String key) {
        String hql = "FROM Clinic WHERE address LIKE :key OR phone LIKE :key";
        Query query = getCurrentSession().createQuery(hql);
        query.setParameter("key", "%"+key+"%");
        
        return query.getResultList();
    }

}
