package com.demojpaapp.resource.ifaces;

import com.demojpaapp.common.Response;
import com.demojpaapp.entity.Employee;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/")
public interface IHelloResource {

    @GET
    @Path("/")
    @Produces({ MediaType.TEXT_PLAIN })
    public jakarta.ws.rs.core.Response index();

    @GET
    @Path("/allEmployees")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllEmployees();

    @POST
    @Path("/createEmployee")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createEmployee(@Valid Employee employee) throws Exception;
}
