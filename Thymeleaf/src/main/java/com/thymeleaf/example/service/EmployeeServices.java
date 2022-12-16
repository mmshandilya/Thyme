package com.thymeleaf.example.service;

import java.util.List;

import com.thymeleaf.example.model.Employee;

public interface EmployeeServices {
	List<Employee> getAllEmployee();
    void save(Employee employee);
    Employee getById(Long id);
    void deleteViaId(long id);
}
