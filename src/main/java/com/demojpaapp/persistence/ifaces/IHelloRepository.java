package com.demojpaapp.persistence.ifaces;

import com.demojpaapp.entity.Employee;

import java.util.List;

public interface IHelloRepository {
    public Employee createEmployee(Employee e);

    public List<Employee> getAllEmployees();

    public Employee findEmployee(Long empId);

    public Employee updateEmployee(Long empId, Employee e);

    public Employee DeleteEmployee(Long empId);
}
