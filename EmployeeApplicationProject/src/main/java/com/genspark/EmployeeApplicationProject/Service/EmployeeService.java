package com.genspark.EmployeeApplicationProject.Service;

import com.genspark.EmployeeApplicationProject.Entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeService {

    public List<Employee> getEmployee();
}
