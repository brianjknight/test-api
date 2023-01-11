package com.bloomtech.testapi.services;

import com.bloomtech.testapi.entities.Employee;
import com.bloomtech.testapi.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee editEmployee(Long id, Employee employee) {
        Optional<Employee> employeeToEditOpt = findById(id);
        Employee employeeToEdit = employeeToEditOpt.get();

        employeeToEdit.setFirstName(employee.getFirstName());
        employeeToEdit.setLastName(employee.getLastName());
        employeeToEdit.setEmailId(employeeToEdit.getEmailId());

        save(employeeToEdit);

        return employeeToEdit;
    }
}
