package com.example.sample;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Singleton
@Path("/sample")
public class SampleController {
    public SampleController() {
    }

    @GET
    public String helloWorld() {
        return "Hello, world!";
    }

    @GET
    @Path("/{name}")
    public String helloName(@PathParam("name") String name) {
        return String.format("Hello, %s!", name);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public SampleDataObject helloPost(SampleDataObject request) {
        return new SampleDataObject(request.getKey(), request.getValue());
    }
}
