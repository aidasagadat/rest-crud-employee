package com.aidasagadat.springboot.cruddemo.service;

import com.aidasagadat.springboot.cruddemo.dao.EmployeeDAO;
import com.aidasagadat.springboot.cruddemo.entity.Employee;
<<<<<<< HEAD
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
=======
import org.springframework.stereotype.Service;
>>>>>>> origin/master

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

<<<<<<< HEAD

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

=======
    private EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO){
        this.employeeDAO = employeeDAO;
    }


>>>>>>> origin/master
    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }
<<<<<<< HEAD

    @Override
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }
}



















=======
}
>>>>>>> origin/master
