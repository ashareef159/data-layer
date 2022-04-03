package com.example.datalayer.controller;


import com.example.datalayer.model.Employee;
import com.example.datalayer.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeResource {


    @Autowired
    EmployeeService employeeService;


    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable long id){
        return ResponseEntity.ok(this.employeeService.findById(id));
    }




}
