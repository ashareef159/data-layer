package com.example.datalayer.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private long code;

    private String description;

    @OneToMany(mappedBy = "department")
    private List<Employee> employees;






}
