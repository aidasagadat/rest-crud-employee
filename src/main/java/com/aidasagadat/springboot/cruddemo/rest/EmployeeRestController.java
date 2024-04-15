package com.aidasagadat.springboot.cruddemo.rest;

import com.aidasagadat.springboot.cruddemo.dao.EmployeeDAO;
import com.aidasagadat.springboot.cruddemo.entity.Employee;
import com.aidasagadat.springboot.cruddemo.service.EmployeeService;
import org.hibernate.boot.model.source.internal.hbm.AttributesHelper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {


    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }



    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();
    }


    @GetMapping("/employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);

        if(employee == null){
            throw  new RuntimeException("Employee id not found");
        }
        return employee;
    }


    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee newEmployee){
        newEmployee.setId(0);
        Employee dbEmployee = employeeService.save(newEmployee);
        return dbEmployee;
    }


    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee theEmployee){
        Employee dbEmployee = employeeService.save(theEmployee);
        return dbEmployee;
    }


    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.findById(employeeId);

        if(employee == null){
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        employeeService.deleteById(employeeId);
        return "Deleted employee id - " + employeeId;

    }


}















