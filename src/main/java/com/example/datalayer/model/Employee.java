package com.example.datalayer.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;

@Entity
@Data
public class Employee {

    public static interface EmployeetView{}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonView({Employee.EmployeetView.class,Department.DepartmentView.class})
    private long id;

    @JsonView({Employee.EmployeetView.class,Department.DepartmentView.class})
    private String firstName;

    @JsonView({Employee.EmployeetView.class,Department.DepartmentView.class})
    private String middleName;

    @JsonView({Employee.EmployeetView.class,Department.DepartmentView.class})
    private String email;

    @JsonView({Employee.EmployeetView.class,Department.DepartmentView.class})
    private long phone;

    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Department department;


}
