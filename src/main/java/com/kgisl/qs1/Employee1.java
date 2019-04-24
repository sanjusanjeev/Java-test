package com.kgisl.qs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Employee1
 */
public class Employee1 {
    public static void main(String[] args) {
        List<Employee> details = Arrays.asList(new Employee(100, "Sanju", 25000.50),
                new Employee(101, "Kavin", 30000.35), new Employee(99, "Sasi", 28000.50));
        details.forEach(System.out::println);
        System.out.println("\n ***** After Sorting *****\n");
        List<Employee> slist = details.stream().sorted(Comparator.comparing(Employee::getempid)).collect(Collectors.toList());
    slist.forEach(System.out::println);
    }

}
