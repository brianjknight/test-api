package com.bloomtech.testapi.controllers;

import com.bloomtech.testapi.entities.Employee;
import com.bloomtech.testapi.entities.Tool;
import com.bloomtech.testapi.services.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/tools")
public class ToolController {

    @Autowired
    ToolService toolService;

    @PostMapping
    public ResponseEntity<?> getTools(@RequestBody Employee owner) {
        Set<Tool> toolsByEmployee = toolService.getToolsByEmployee(owner);

        return ResponseEntity.ok(toolsByEmployee);
    }



}
