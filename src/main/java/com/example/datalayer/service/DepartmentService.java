package com.example.datalayer.service;

import com.example.datalayer.model.Department;
import com.example.datalayer.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;


    public Department findById(long id){
        return this.departmentRepository.findById(id).get();
    }



}
