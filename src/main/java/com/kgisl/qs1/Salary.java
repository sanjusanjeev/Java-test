package com.kgisl.qs1;

/**
 * Salary
 */
public class Salary {

    private int empid;
    private String name;
    private String dept;
    private double salary;

    public Salary(int empid, String name, String dept,double salary) {

        this.empid = empid;
        this.name = name;
        this.dept=dept;
        this.salary = salary;

    }

    public int getempid() {
        return empid;
    }

    public String getname() {
        return name;
    }
    public String getdept() {
        return dept;
    }

    public double getsalary() {
        return salary;

    }

    public String toString() {
        return "Emp id : " + empid +", "+ "Name : " + name +", "+"Dept : "+dept+", " +"Salary : " + salary;
    }

}