package com.example.datalayer.repository;


import com.example.datalayer.model.Employee;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    //@EntityGraph(attributePaths = {"department"})
    @Query("from Employee e join Department d on d = e.department")
    public List<Employee> findByFirstName(String name);
}
