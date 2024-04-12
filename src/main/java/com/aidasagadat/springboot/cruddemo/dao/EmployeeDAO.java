package com.aidasagadat.springboot.cruddemo.dao;

import com.aidasagadat.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
