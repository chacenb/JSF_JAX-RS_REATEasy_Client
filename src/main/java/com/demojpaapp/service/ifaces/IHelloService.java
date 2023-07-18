package com.demojpaapp.service.ifaces;

import com.demojpaapp.entity.Employee;

import java.util.List;

public interface IHelloService {
    public Employee createEmployee(Employee e);

    public List<Employee> getAllEmployees();

    public Employee updateEmployee(Long empId, Employee e);

    public Employee DeleteEmployee(Long empId);


}
