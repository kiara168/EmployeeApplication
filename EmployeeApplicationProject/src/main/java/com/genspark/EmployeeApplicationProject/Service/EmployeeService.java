package com.genspark.EmployeeApplicationProject.Service;

import com.genspark.EmployeeApplicationProject.Entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface EmployeeService {
    public List<Employee> getEmployee();
    public Employee getEmployee(long employeeID);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(Employee employee);
    public String deleteEmployee(long employeeID);
}
