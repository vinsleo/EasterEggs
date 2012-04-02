/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vins.jax12.business;

import com.vins.jax12.annotation.DefaultQualifier;

/**
 *
 * @author vinay.n.thakkar
 */
@DefaultQualifier(DefaultQualifier.Type.HisDefault)
public class ExpressService implements ServiceContract {
    @Override
    public String method() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
