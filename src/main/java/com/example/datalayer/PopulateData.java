package com.example.datalayer;

import com.example.datalayer.repository.DepartmentRepository;
import com.example.datalayer.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PopulateData {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @EventListener(ApplicationReadyEvent.class)
    public void addDataToDB(){

    }
}
