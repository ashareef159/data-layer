package com.example.datalayer.projection.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeContactDto {

    private String email;

    private long phone;
}
