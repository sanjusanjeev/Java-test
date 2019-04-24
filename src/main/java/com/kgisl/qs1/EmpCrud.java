package com.kgisl.qs1;

/**
 * EmpCrud
 */
public class EmpCrud {

    private int empid;
    private String name;
    private double salary;

    public EmpCrud(int empid, String name, double salary) {

        this.empid = empid;
        this.name = name;
        this.salary = salary;

    }

    public int getempid() {
        return empid;
    }
    public void setId(int empid) {
        this.empid = empid;
      }
    
    public String getname() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
      }
    

    public double salary() {
        return salary;

    }
    public void setsalary(double salary) {
        this.salary = salary;
      }
    public String toString() {
        return "Emp id : " + empid +", "+ "Name : " + name +", "+ "Salary :" + salary;
    }

}