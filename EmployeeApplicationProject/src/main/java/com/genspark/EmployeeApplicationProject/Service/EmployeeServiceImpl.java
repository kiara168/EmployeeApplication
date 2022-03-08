package com.genspark.EmployeeApplicationProject.Service;


import com.genspark.EmployeeApplicationProject.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> list;
    private long employeeID;

    public EmployeeServiceImpl() {
        list = new ArrayList<>();
        list.add(new Employee(260735L, "John Doe", "Manager"));
        list.add(new Employee(260734L, "Jane Dawn", "Project Lead"));
        list.add(new Employee(260887L, "Josh Dim", "Secretary"));
    }

    @Override
    public List<Employee> getEmployee() {
        return list;
    }

    @Override
    public Employee getEmployee(long employeeID){
        this.employeeID = employeeID;
        Employee e = null;
        for( Employee employee : list){
            if(employee.getId() == employeeID){
                e = employee;
                break;
            }
        }
        return e;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        list.add(employee);
        return employee;
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        String employeeName = employee.getName();
        String position = employee.getJob();
        Employee e = null;
        for(Employee x : list){
            if(x.getId() == employee.getId()){
                x.setName(employeeName);
                x.setJob(position);
                e = x;
                break;
            }
        }
        return e;
    }

    @Override
    public String deleteEmployee(long employeeID) {
        this.employeeID = employeeID;
        for(Employee employee: list){
            if(employee.getId() == employeeID){
                list.remove(employee);
                break;
            }
        }
        return "Deleted";
    }
}
