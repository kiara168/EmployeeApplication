package com.genspark.EmployeeApplicationProject.Coltroller;

import com.genspark.EmployeeApplicationProject.Entity.Employee;
import com.genspark.EmployeeApplicationProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        return this.employeeService.getEmployee();
    }
}
