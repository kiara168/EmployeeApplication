package com.genspark.EmployeeApplicationProject.Entity;

public class Employee {

    private long id;
    private String name;
    private String job;

    public Employee() {
    }

    public Employee(Long id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }

    public  long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
