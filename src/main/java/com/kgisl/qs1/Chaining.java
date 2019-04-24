package com.kgisl.qs1;

/**
 * Chaining
 */
public class Chaining {

    public int empid;
    public String name;
    public double salary;

    public Chaining(int empid, String name, double salary) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
    }

    public Chaining() {
        this(111);
        System.out.println("This is Default Constructor");
    }

    public Chaining(int empid) {

        this(empid, 20000);
        System.out.println("This is Perameterized Constructor");

    }

    public Chaining(int empid, double salary) {
        this(empid, "Sanju", salary);
    }

    void show() {
        System.out.println("ID:    " + empid);
        System.out.println("Name:  " + name);
        System.out.println("Salary:   " + salary);
    }

    public static void main(String[] args) {
        Chaining obj = new Chaining();
        obj.show();
    }

}