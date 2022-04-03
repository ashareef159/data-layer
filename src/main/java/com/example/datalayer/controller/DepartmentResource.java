package com.example.datalayer.controller;


import com.example.datalayer.model.Department;
import com.example.datalayer.model.Employee;
import com.example.datalayer.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentResource {

    @Autowired
    DepartmentService departmentService;


    @GetMapping("/{id}")
    public ResponseEntity<Department> findById(@PathVariable long id){
        return ResponseEntity.ok(this.departmentService.findById(id));
    }


}
