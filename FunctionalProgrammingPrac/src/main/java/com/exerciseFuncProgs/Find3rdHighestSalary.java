package com.exerciseFuncProgs;

import java.util.Comparator;
import java.util.List;

public class Find3rdHighestSalary
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee(1000,"a","IT");
        Employee e2 = new Employee(2000,"b","Accounts");
        Employee e3 = new Employee(3000,"c","HR");
        Employee e4 = new Employee(4000,"d","Facilities");
        Employee e5 = new Employee(5000,"e","Business");
        List<Employee> employees = List.of(
              e1,e2,e3,e4,e5
        );

        Integer thirdHighestSal = employees
                .stream()
                .map(Employee::getSalary)
                .sorted(Comparator.reverseOrder())
                //.limit(3)
                .skip(2)
                .findFirst()
                .orElse(0);
        System.out.println(thirdHighestSal);
    }
}
