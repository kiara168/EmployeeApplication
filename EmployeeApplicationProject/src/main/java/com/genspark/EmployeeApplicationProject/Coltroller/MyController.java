package com.genspark.EmployeeApplicationProject.Coltroller;

import com.genspark.EmployeeApplicationProject.Entity.Employee;
import com.genspark.EmployeeApplicationProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployee(){
        return this.employeeService.getEmployee();
    }

    @GetMapping("/employees/{employeeID}")
    public Employee getEmployee(@PathVariable String employeeID){
        return  this.employeeService.getEmployee(Long.parseLong(employeeID));
    }

    @PostMapping("employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return  this.employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{employeeID}")
    public String deleteEmployee(@PathVariable String employeeID){
        return this.employeeService.deleteEmployee(Long.parseLong(employeeID));
    }
}
