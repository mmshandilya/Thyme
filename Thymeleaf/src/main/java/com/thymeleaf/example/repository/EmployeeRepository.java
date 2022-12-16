package com.thymeleaf.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thymeleaf.example.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
