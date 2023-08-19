package com.example.delivery_bd.service;

import com.example.delivery_bd.model.Employee;
import com.example.delivery_bd.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository repository;

    public EmployeeServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    public Optional<Employee> getById(Integer id) {
        return repository.findById(id);
    }


}
