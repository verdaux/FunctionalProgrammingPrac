package com.Custom_Classes;

import java.util.List;

public class UtilityFunctions
{
    public static void main(String[] args)
    {
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "Microservices", 97, 22000),
                new Course("Microservices", "Microservices", 96, 25000),
                new Course("FullStack", "FullStack", 91, 14000), new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000), new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000));

        courses
                .stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println("--------------------");

        courses
                .stream()
                .skip(2)
                .forEach(System.out::println);
        System.out.println("--------------------");
        courses
                .stream()
                .takeWhile(course -> course.getReviewScore()>=95)
                .forEach(System.out::println);
        System.out.println("--------------------");
        courses
                .stream()
                .dropWhile(course -> course.getReviewScore()>=95)
                .forEach(System.out::println);
    }
}
