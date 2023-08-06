package com.example.Employee.controller;

import com.example.Employee.entity.Employee;
import com.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService empService;
    @GetMapping("/getEmpDetail")
    public ResponseEntity<List<Employee>> getEmployee(){
     List<Employee> empList = empService.getEmpDetails();
     return new ResponseEntity<>(empList, HttpStatus.OK);
    }
    @PostMapping("/saveEmployee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
    Employee savedEmployee=  empService.saveEmployee(emp);
    return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
    }



}
