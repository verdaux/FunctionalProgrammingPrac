package com.Behavior;

import java.util.List;
import java.util.function.Supplier;

public class MethodReferences
{
    public static void main(String[] args)
    {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices","AWS","PCF","Azure");
//        courses
//                .stream()
//                .map( t -> t.toUpperCase())
//                .forEach(System.out::println);

        courses
                .stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Supplier<String> supplier = () -> new String();

        Supplier<String> supplierWithRef = String::new; //constructor reference
    }
}
