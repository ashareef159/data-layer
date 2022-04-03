package com.example.datalayer.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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

    @ManyToOne()
    @JoinColumn(name = "department_id")
    private Department department;


}
