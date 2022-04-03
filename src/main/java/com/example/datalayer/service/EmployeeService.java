package com.example.datalayer.service;


import com.example.datalayer.model.Employee;
import com.example.datalayer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;


    public Employee findById(long id){
        return  this.employeeRepository.findById(id).get();
    }


    public List<Employee> findAll(){
        return  this.employeeRepository.findAll();
    }

    public List<Employee> findByName(String name){
        return  this.employeeRepository.findByFirstName(name);
    }


}
