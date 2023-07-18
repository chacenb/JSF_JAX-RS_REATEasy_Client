package com.demojpaapp.service;

import com.demojpaapp.entity.Employee;
import com.demojpaapp.persistence.HelloRepository;
import com.demojpaapp.service.ifaces.IHelloService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;
import java.util.List;

@SessionScoped
public class HelloService implements IHelloService, Serializable {
    private static final Logger LOG = LogManager.getLogger(HelloService.class);

    @Inject
    private HelloRepository helloRepository;

    @Override
    public Employee createEmployee(Employee e) {
        LOG.info("HelloService > createEmployee ");

        return helloRepository.createEmployee(e);
    }

    @Override
    public List<Employee> getAllEmployees() {
        LOG.info("HelloService > getAllEmployees ");

        return helloRepository.getAllEmployees();
    }

    @Override
    public Employee updateEmployee(Long empId, Employee e) {
        LOG.info("HelloService > updateEmployee ");
        return null;
    }

    @Override
    public Employee DeleteEmployee(Long empId) {
        LOG.info("HelloService > DeleteEmployee ");
        return null;
    }
}
