package com.example.Employee.service;

import com.example.Employee.entity.Employee;
import com.example.Employee.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmpRepo empRepo;

    public List<Employee> getEmpDetails() {
        return empRepo.findAll();
    }
    public Employee saveEmployee(Employee emp){
        return empRepo.save(emp);
        }


}
