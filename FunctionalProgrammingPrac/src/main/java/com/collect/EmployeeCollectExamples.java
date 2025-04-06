package com.collect;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeCollectExamples
{
    public static void main(String[] args)
    {
        List<Employee> employees = List.of(
                new Employee("Ramesh",30),
                new Employee("Bob",25),
                new Employee("Sanjay",35)
        );

        List<String> stream =
                employees
                        .stream()
                        .map(Employee::getName)
                        .collect(Collectors.toList())
                ;
        System.out.println(stream);
    }
}
