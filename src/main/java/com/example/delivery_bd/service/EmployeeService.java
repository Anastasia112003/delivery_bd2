package com.example.delivery_bd.service;

import com.example.delivery_bd.model.Employee;

import java.util.Optional;

public interface EmployeeService {
    Optional<Employee> getById(Integer id);
}
