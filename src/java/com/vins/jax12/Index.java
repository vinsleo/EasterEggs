/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vins.jax12;

import javax.faces.bean.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author vinay.n.thakkar
 */
@Named
@RequestScoped
public class Index {
    public String getMessage(){
        return "Hello Vinay";
    }
}
