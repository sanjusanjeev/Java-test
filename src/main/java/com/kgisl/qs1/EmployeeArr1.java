package com.kgisl.qs1;

import java.util.Arrays;
import java.util.List;

/**
 * EmployeeArr1
 */
public class EmployeeArr1 {

    public static void main(String[] args) {
        List<EmployeeArr> details = Arrays.asList(new EmployeeArr(100, "Sasi", 30000),
                new EmployeeArr(101, "Sanju", 3000));
        for (EmployeeArr var : details) {
            System.out.println(var);
        }
    }
}