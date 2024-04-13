package com.aidasagadat.springboot.cruddemo.service;

import com.aidasagadat.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
