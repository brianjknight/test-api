package com.bloomtech.testapi.repositories;

import com.bloomtech.testapi.entities.Employee;
import com.bloomtech.testapi.entities.Tool;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface ToolRepository extends JpaRepository<Tool, Long> {

    @Query("select t from Tool t where t.owner = :employee")
    public Set<Tool> findToolsByEmployee(Employee employee);

}
