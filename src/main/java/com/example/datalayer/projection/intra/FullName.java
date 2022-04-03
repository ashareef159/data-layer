package com.example.datalayer.projection.intra;

import org.springframework.beans.factory.annotation.Value;

public interface FullName {

    // Open Projection
    @Value("#{target.firstName + ' ' + target.middleName}")
    String getFullName();
}
