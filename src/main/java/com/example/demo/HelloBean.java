package com.example.demo;

import com.example.demo.common.Response;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.core.UriBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import com.demojpaapp.resource.ifaces.IHelloResource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RequestScoped
@Named("renamedHelloBean")
public class HelloBean {

    private static final Logger LOG = LogManager.getLogger(HelloBean.class);
    public static final UriBuilder FULL_PATH = UriBuilder.fromPath("http://127.0.0.1:8080/demoJpaJaxrsApi/api");
    private ResteasyClient clientProxy;
    private ResteasyWebTarget target;
    private IHelloResource proxy;

    @PostConstruct
    private void getBeansFromRemoteJaxrsResource() {
        this.clientProxy = (ResteasyClient) ClientBuilder.newClient();
        this.target = clientProxy.target(FULL_PATH);
        this.proxy = target.proxy(IHelloResource.class);

//        LOG.info(" >>>>>> injected proxy bean is {}", proxy);
//        LOG.info(" >>>>>> injected proxy bean is {}", proxy.index());
        LOG.info(" >>>>>> getRemoteEmployees() is {}", proxy.getAllEmployees());

    }

    private String name = "Chace";
    private String greeting = "Chace greetings";

    public String getName() {
        return name;
    }

    public Response getRemoteEmployees() {
        LOG.info(" >>>>>> getRemoteEmployees() is {}", proxy.getAllEmployees());
        return new Response();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreeting() {
        return greeting;
    }

}