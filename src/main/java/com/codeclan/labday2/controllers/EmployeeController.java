package com.codeclan.labday2.controllers;

import com.codeclan.labday2.models.Employee;
import com.codeclan.labday2.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value="")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
