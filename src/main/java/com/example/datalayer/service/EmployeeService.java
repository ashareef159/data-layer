package com.example.datalayer.service;


import com.example.datalayer.model.Employee;
import com.example.datalayer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;


    public Employee findById(long id){
        return  this.employeeRepository.findById(id).get();
    }


}
