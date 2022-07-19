package com.bridgelabz;

public class EmpPayRollData {
    public int id;
    public String name;
    public double salary;

    public EmpPayRollData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmpPayRollData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

