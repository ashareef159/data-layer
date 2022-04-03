package com.example.datalayer.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;

    private String middleName;

    private String email;

    private long phone;

    @ManyToOne
    private Department department;


}
