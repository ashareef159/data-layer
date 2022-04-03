package com.example.datalayer.repository;


import com.example.datalayer.model.Employee;
import com.example.datalayer.projection.dto.EmployeeNameDto;
import com.example.datalayer.projection.intra.FullName;
import com.example.datalayer.projection.intra.GetFullName;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @EntityGraph(attributePaths = {"department"})
    //@Query("from Employee e join Department d on d = e.department")
    public List<Employee> findByFirstName(String name);

    public List<GetFullName> getByFirstName(String name);

    public List<FullName> readByFirstName(String name);

    public List<EmployeeNameDto> queryByFirstName(String name);


    public <T> List<T> searchByFirstName(String name,Class<T> type);


}
