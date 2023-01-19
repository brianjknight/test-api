package com.bloomtech.testapi.services;

import com.bloomtech.testapi.entities.Employee;
import com.bloomtech.testapi.entities.Tool;
import com.bloomtech.testapi.repositories.ToolRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Set;

public class ToolService {
    @Autowired
    ToolRepository toolRepository;

    public Set<Tool> getToolsByEmployee(Employee owner) {
        return toolRepository.findToolsByEmployee(owner);
    }
}
