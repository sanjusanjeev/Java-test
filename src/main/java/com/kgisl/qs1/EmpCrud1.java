package com.kgisl.qs1;

import java.util.ArrayList;
import java.util.List;

/**
 * EmpCrud1
 */
public class EmpCrud1 {

    public static ArrayList<EmpCrud> EmployeeList = new ArrayList<EmpCrud>();
    static EmpCrud newEmployee = new EmpCrud(102, "name", 0);
    static EmpCrud updateEmployee = new EmpCrud(102, "updatename", 0);

    public static void main(String[] args) {
        EmpCrud1 s = new EmpCrud1();
        s.loadEmployee();
        s.getAllEmployee();
        s.getEmployee(12);
        s.newEmployee(newEmployee);
        s.updateEmployee(102, updateEmployee);
        s.removeEmployee(101);
    }

    EmpCrud1() {
        loadEmployee();
    }

    private void loadEmployee() {
        EmployeeList.add(new EmpCrud(101, "Sanju", 25000.50));
        EmployeeList.add(new EmpCrud(102, "Sasi", 35000.50));
        EmployeeList.add(new EmpCrud(103, "Gowtham", 25000.50));

    }

    public List<EmpCrud> getAllEmployee() {
        System.out.println(EmployeeList);
        return EmployeeList;
    }

    public EmpCrud getEmployee(int empid) {
        for (EmpCrud employee : EmployeeList) {
            if (employee.getempid() == empid) {
                System.out.println(String.valueOf(employee.getempid()) + employee.getname());
                return employee;
            }
        }
        return getEmployee(0);
    }

    public void newEmployee(EmpCrud employee) {
        EmployeeList.add(newEmployee);
        getAllEmployee();
        System.out.println(EmployeeList);
    }

    public void updateEmployee(int empid, EmpCrud updateEmployee) {
        for (EmpCrud employee : EmployeeList) {
            if (employee.getempid() == empid) {
                System.out.println(EmployeeList.indexOf(employee));
                EmployeeList.set(EmployeeList.indexOf(employee), updateEmployee);
            }
        }
        getAllEmployee();
       System.out.println(EmployeeList);
    }
    public void removeEmployee(int empid) {
        for (EmpCrud employee : EmployeeList) {
            if (employee.getempid() == empid) {
                System.out.println(EmployeeList.indexOf(employee));
                EmployeeList.remove(EmployeeList.indexOf(employee));
            }
            break;
        }
        getAllEmployee();
        System.out.println(EmployeeList);
    }
}