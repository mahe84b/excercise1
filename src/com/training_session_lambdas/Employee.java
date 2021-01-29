package com.training_session_lambdas;

import java.util.List;
import java.util.ArrayList;

public class Employee {
    private String name;
    private float salary;
    private int experience;
    private float bonus;

    public String getName() {
        return this.name;
    }

    public float getSalary() {
        return this.salary;
    }

    public int getExperience() {
        return this.experience;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getBonus() {
        return this.bonus;
    }

    public Employee(String name, int salary, int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }

//    public List<Employee> ReturnEmployeeList() {
//        List<Employee> employeeList = new ArrayList();
//        this.setEmployee("Rajesh", 10000, 1);
//        employeeList.add(this.getEmployee());
//        this.setEmployee("Naresh", 20000, 2);
//        employeeList.add(this.getEmployee());
//        return employeeList;
//    }
}


