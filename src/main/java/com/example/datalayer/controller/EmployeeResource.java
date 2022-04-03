package com.example.datalayer.controller;


import com.example.datalayer.model.Employee;
import com.example.datalayer.service.EmployeeService;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
public class EmployeeResource {


    @Autowired
    EmployeeService employeeService;


    @GetMapping("/{id}")
    @JsonView(Employee.EmployeetView.class)
    public ResponseEntity<Employee> findById(@PathVariable long id){
        return ResponseEntity.ok(this.employeeService.findById(id));
    }

    @GetMapping
    @JsonView(Employee.EmployeetView.class)
    public ResponseEntity<List<Employee>> findAll(){
        return  ResponseEntity.ok(this.employeeService.findAll());
    }

    @GetMapping("/name/{name}")
    @JsonView(Employee.EmployeetView.class)
    public ResponseEntity<List<Employee>> findByName(@PathVariable String name){
        return ResponseEntity.ok(this.employeeService.findByName(name));
    }


}
