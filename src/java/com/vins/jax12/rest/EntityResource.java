/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vins.jax12.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author vinay.n.thakkar
 */
@Path("entities")
public class EntityResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getEntities(){
        return "My Rset";
    }
}
