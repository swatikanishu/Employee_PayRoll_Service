package com.bridgelabz;

import java.time.LocalDate;

public class EmployeePayrollData {
    public int id;
    public String name;
    public double salary;
    public LocalDate startDate;

    public EmployeePayrollData(Integer id,String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "EmployeeID= "+id+", EmployeeName= "+name+", EmployeeSalary= "+salary;
    }
}