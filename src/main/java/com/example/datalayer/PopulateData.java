package com.example.datalayer;

import com.example.datalayer.model.Department;
import com.example.datalayer.model.Employee;
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

        for (int i =1;i<=10;i++){
            Department department = new Department();
            department.setCode(Integer.parseInt(String.format("%03d", i)));
            department.setDescription("Description of Department " + String.format("%03d", i));
            department.setName("Department-"+i);
            this.departmentRepository.save(department);
            for (int j = i*10;j<(i*10)+10;j++){
                Employee employee = new Employee();
                employee.setEmail("email-"+j+"@gmail.com");
                employee.setPhone(Integer.parseInt(String.format("%09d", j)));
                employee.setFirstName("Name-"+j);
                employee.setFirstName("Name-"+j);
                employee.setMiddleName("Middel-"+j);
                employee.setDepartment(department);
                this.employeeRepository.save(employee);
            }
        }

    }
}
