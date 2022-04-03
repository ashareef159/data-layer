package com.example.datalayer.model;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Department {

    public static interface DepartmentView{}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView({Department.DepartmentView.class,Employee.EmployeetView.class})
    private long id;

    @JsonView({Department.DepartmentView.class,Employee.EmployeetView.class})
    private String name;

    @JsonView({Department.DepartmentView.class,Employee.EmployeetView.class})
    private long code;

    @JsonView({Department.DepartmentView.class,Employee.EmployeetView.class})
    private String description;

    @OneToMany(mappedBy = "department")
    @JsonView({Department.DepartmentView.class})
    private List<Employee> employees;






}
