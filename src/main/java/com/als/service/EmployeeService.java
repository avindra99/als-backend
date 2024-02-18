package com.als.service;

import com.als.entity.Employee;
import com.als.entity.Role;
import com.als.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee){
        if (employee.getRole() == Role.USER) {
            employee.setApprovedByAdmin(false);
        }
        return employeeRepository.save(employee);
    }
}
