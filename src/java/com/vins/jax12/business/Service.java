/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vins.jax12.business;


import com.vins.jax12.annotation.DefaultQualifier;
import com.vins.jax12.persistence.Entity;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vinay.n.thakkar
 */
@Stateless
@DefaultQualifier(DefaultQualifier.Type.MyDefault)
public class Service implements ServiceContract {
    
    @PersistenceContext
    EntityManager em;
    
    @Override 
    public String  method(){
        em.persist(new Entity("my attribute"));
        return "Service.method ";
    }
}
