package com.example.datalayer.service;


import com.example.datalayer.model.Employee;
import com.example.datalayer.projection.dto.EmployeeContactDto;
import com.example.datalayer.projection.dto.EmployeeDynamicDto;
import com.example.datalayer.projection.dto.EmployeeNameDto;
import com.example.datalayer.projection.intra.FullName;
import com.example.datalayer.projection.intra.GetFullName;
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


    public List<GetFullName> findByNameOnly(String name){
        return this.employeeRepository.getByFirstName(name);
    }

    public List<FullName> findByNameCombined(String name){
        return this.employeeRepository.readByFirstName(name);
    }

    public List<EmployeeNameDto> findByNameDto(String name){
        return this.employeeRepository.queryByFirstName(name);
    }

    public List<EmployeeDynamicDto> findByNameDynamic(String name){
        return this.employeeRepository.searchByFirstName(name,EmployeeDynamicDto.class);
    }

    public List<EmployeeContactDto> findByNameContact(String name){
        return this.employeeRepository.searchByFirstName(name, EmployeeContactDto.class);
    }


}
