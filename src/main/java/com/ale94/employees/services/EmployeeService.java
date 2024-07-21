package com.ale94.employees.services;

import com.ale94.employees.entity.EmployeeEntity;
import com.ale94.employees.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService implements IEmployeeService {

    private final EmployeeRepository repository;

    @Override
    public List<EmployeeEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public EmployeeEntity getById(Long id) {
        return repository.findById(id).orElseThrow();
    }

    @Override
    public EmployeeEntity create(EmployeeEntity employeeEntity) {
        return repository.save(employeeEntity);
    }

    @Override
    public void delete(Long id) {
        var employeeToDelete = repository.findById(id).orElseThrow();
        repository.delete(employeeToDelete);
    }
}
