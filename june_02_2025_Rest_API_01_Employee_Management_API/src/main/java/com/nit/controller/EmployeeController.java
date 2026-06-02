package com.nit.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @GetMapping
    public String getEmployees() {
        return "Employee list fetched";
    }

    @PostMapping("/add")
    public String addEmployee(@RequestBody Employee employee) {
        return "Employee added successfully";
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee employee) {
        return "Employee updated successfully";
    }

    @DeleteMapping("/delete")
    public String deleteEmployee(@RequestParam int employeeId) {
        return "Employee deleted successfully";
    }
}