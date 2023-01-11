package com.bloomtech.testapi.repositories;

import com.bloomtech.testapi.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findEmployeeByFirstName(String firstName);

}
