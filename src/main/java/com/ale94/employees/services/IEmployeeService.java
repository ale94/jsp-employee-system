package com.ale94.employees.services;

import com.ale94.employees.entity.EmployeeEntity;

import java.util.List;

public interface IEmployeeService {

    List<EmployeeEntity> getAll();

    EmployeeEntity getById(Long id);

    EmployeeEntity create(EmployeeEntity employeeEntity);

    void delete(Long id);
}
