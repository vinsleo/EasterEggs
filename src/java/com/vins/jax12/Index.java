/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vins.jax12;

import com.vins.jax12.annotation.DefaultQualifier;
import com.vins.jax12.business.Service;
import com.vins.jax12.business.ServiceContract;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author vinay.n.thakkar
 */
@Named
@RequestScoped
public class Index {

    @Inject @DefaultQualifier(DefaultQualifier.Type.MyDefault)
    ServiceContract service;
    
    @PostConstruct
    public void init() {
        System.out.println("init");
    }

    public String getMessage() {
        return "Hello Vinay " + service.method();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("init");
    }
}
