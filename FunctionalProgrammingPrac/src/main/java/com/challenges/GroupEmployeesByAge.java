package com.challenges;

import com.collect.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupEmployeesByAge
{
    public static void main(String[] args)
    {
        List<Employee> employees = List.of(
                new Employee("Ramesh",30),
                new Employee("Bob",25),
                new Employee("Sanjay",35)
        );


        //Map<Integer,List<Employee>> grouped =
        employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getAge))
                .forEach((k,v) -> System.out.println("age:: "+k+"\nEmployee:: "+v));
                ;


    }
}
