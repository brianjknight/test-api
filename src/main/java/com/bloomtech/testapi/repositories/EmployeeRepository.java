package com.bloomtech.testapi.repositories;

import com.bloomtech.testapi.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, BigInteger> {
    public Employee findEmployeeByFirstName(String firstName);

}
