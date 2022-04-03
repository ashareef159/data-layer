package com.example.datalayer.controller;


import com.example.datalayer.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentResource {

    @Autowired
    DepartmentService departmentService;


}
