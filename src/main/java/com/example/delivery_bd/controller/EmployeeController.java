package com.example.delivery_bd.controller;

import com.example.delivery_bd.model.Employee;
import com.example.delivery_bd.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class EmployeeController {
    private final EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Optional<Employee> findById(@PathVariable Integer id) {
        return service.getById(id);
    }
}
