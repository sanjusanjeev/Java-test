package com.kgisl.qs1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Salary1
 */
public class Salary1 {

    public static void main(String[] args) {
        List<Salary> details = Arrays.asList(new Salary(100, "Sanju", "Sales", 25000.50),
                new Salary(101, "Kavin", "Marketing", 30000.35), new Salary(99, "Sasi", "Production", 28000.50));
        details.forEach(System.out::println);
        System.out.println("\nTotal Salary of all the Employee");

        double d1 = details.stream().mapToDouble(Salary::getsalary).sum();

        System.out.println(d1);
        System.out.println("\nTotal Salary of sales-Dept");

        Predicate<Salary> sal = x -> x.getdept() == "sales";
        List<Salary> l1 = details.stream().filter(sal).collect(Collectors.toList());
        double d3 = details.stream().mapToDouble(Salary::getsalary).sum();

        System.out.println(d3);

        details.stream().max(Comparator.comparing(Salary::getsalary))

                .ifPresent(p -> System.out.println("Dept with highest pay:" + p));

        details.stream().min(Comparator.comparing(Salary::getsalary))

                .ifPresent(p -> System.out.println("Dept with lowest pay:" + p));

        details.stream().collect(Collectors.groupingBy(Salary::getsalary)).values().stream()

                .filter(m -> m.size() > 1)

                .forEach(m -> System.out.println("Employee with same salary:" + m));

    }
}
