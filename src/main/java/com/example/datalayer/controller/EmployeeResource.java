package com.example.datalayer.controller;


import com.example.datalayer.model.Employee;
import com.example.datalayer.projection.dto.EmployeeContactDto;
import com.example.datalayer.projection.dto.EmployeeDynamicDto;
import com.example.datalayer.projection.dto.EmployeeNameDto;
import com.example.datalayer.projection.intra.FullName;
import com.example.datalayer.projection.intra.GetFullName;
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
    public ResponseEntity<Employee> findById(@PathVariable long id){
        return ResponseEntity.ok(this.employeeService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<Employee>> findAll(){
        return  ResponseEntity.ok(this.employeeService.findAll());
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<List<Employee>> findByName(@PathVariable String name){
        return ResponseEntity.ok(this.employeeService.findByName(name));
    }


    @GetMapping("/name/only/{name}")
    public ResponseEntity<List<GetFullName>> findByNameOnly(@PathVariable String name){
        return ResponseEntity.ok(this.employeeService.findByNameOnly(name));
    }

    @GetMapping("/name/combined/{name}")
    public ResponseEntity<List<FullName>> findByNameCombined(@PathVariable String name){
        return ResponseEntity.ok(this.employeeService.findByNameCombined(name));
    }

    @GetMapping("/name/view/{name}")
    public ResponseEntity<List<EmployeeNameDto>> findByNameDto(@PathVariable String name){
        return ResponseEntity.ok(this.employeeService.findByNameDto(name));
    }

    @GetMapping("/name/dynamic/{name}")
    public ResponseEntity<List<EmployeeDynamicDto>> findByNameDynamic(@PathVariable String name){
        return ResponseEntity.ok(this.employeeService.findByNameDynamic(name));
    }

    @GetMapping("/name/contact/{name}")
    public ResponseEntity<List<EmployeeContactDto>> findByNameContact(@PathVariable String name){
        return ResponseEntity.ok(this.employeeService.findByNameContact(name));
    }

}
