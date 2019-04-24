package com.kgisl.qs1;

/**
 * Employee
 */
public class Employee {

    private int empid;
    private String name;
    private double salary;

    public Employee(int empid, String name, double salary) {

        this.empid = empid;
        this.name = name;
        this.salary = salary;

    }

    public int getempid() {
        return empid;
    }

    public String getname() {
        return name;
    }

    public double salary() {
        return salary;

    }

    public String toString() {
        return "Emp id : " + empid +", "+ "Name : " + name +", "+ "Salary :" + salary;
    }

}
