/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.chege.tutorial;

import javax.inject.Inject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * REST Web Service
 *
 * @author chege
 */
@Path("xyz")
public class XyzResource {

    @Context
    private UriInfo context;
    @Inject
    Test test;

    @GET
    @Produces("text/plain")
    public int add() {
        return test.add(90, 6);
    }
}
