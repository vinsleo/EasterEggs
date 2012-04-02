/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vins.jax12.business;


import com.vins.jax12.annotation.DefaultQualifier;
import javax.ejb.Stateless;

/**
 *
 * @author vinay.n.thakkar
 */
@Stateless
@DefaultQualifier(DefaultQualifier.Type.MyDefault)
public class Service implements ServiceContract {
    @Override 
    public String  method(){
        return "Service.method";
    }
}
