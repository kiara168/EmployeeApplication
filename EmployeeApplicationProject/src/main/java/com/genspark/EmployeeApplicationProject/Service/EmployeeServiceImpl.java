package com.genspark.EmployeeApplicationProject.Service;

import com.genspark.EmployeeApplicationProject.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    List<Employee> list;
    private String employeeID;

    public EmployeeServiceImpl() {
        list = new ArrayList<>();
        list.add(new Employee("H260735", "John Doe", "Manager"));
        list.add(new Employee("H260734", "Jane Dawn", "Project Lead"));
        list.add(new Employee("H260887", "Josh Dim", "Secretary"));
    }

    @Override
    public List<Employee> getEmployee() {
        return list;
    }
}
