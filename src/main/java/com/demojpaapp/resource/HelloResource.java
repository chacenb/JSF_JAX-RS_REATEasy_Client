package com.demojpaapp.resource;

import com.demojpaapp.entity.Employee;
import com.demojpaapp.common.Response;
import com.demojpaapp.resource.ifaces.IHelloResource;
import com.demojpaapp.service.HelloService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@ApplicationScoped
public class HelloResource implements IHelloResource {

    private static final Logger LOG = LogManager.getLogger(HelloResource.class);

    @Inject
    private HelloService hService;

    public jakarta.ws.rs.core.Response index() {
        return jakarta.ws.rs.core.Response.status(200).header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Headers", "origin, content-type, accept, authorization")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD").entity("").build();
    }

    public Response getAllEmployees() {
        LOG.info("api resource > /");
        return new Response(hService.getAllEmployees());
    }

    public Response createEmployee(Employee employee) throws Exception {
        LOG.info("api resource > createEmployee");
        Employee emp = null;

        try {
            emp = hService.createEmployee(employee);
        } catch (Exception e) {
            LOG.error("api resource > createEmployee");
            throw new Exception(e);
        }

        return (emp == null) ? new Response(null, "Erreur lors de la création de l'employé") : new Response(emp);
    }
}