package com.aidasagadat.springboot.cruddemo.service;

import com.aidasagadat.springboot.cruddemo.dao.EmployeeDAO;
import com.aidasagadat.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }


    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
}
