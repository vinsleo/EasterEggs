/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vins.jax12.persistence;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author vinay.n.thakkar
 */
@javax.persistence.Entity
public class Entity {
    @Id
    @GeneratedValue
    private long id;
    private String attribute;

    public Entity() {
    }

    public Entity(String attribute) {
        this.attribute = attribute;
    }
    
    
}
