package com.streamexercises;

import java.util.List;
import java.util.function.Predicate;

public class CourseFilters
{


    public static void main(String[] args)
    {
        List<String> courses = List.of(
                "Spring"
                ,"Spring Boot"
                ,"API"
                ,"Microservices"
                ,"AWS"
                ,"PCF"
                ,"Azure"
                ,"Docker"
                ,"Kubernetes"
        );
        Predicate<String> hasSpring = course -> course.contains("Spring");
        //filter courses that have Spring in it
        courses
                .stream()
                .filter(hasSpring)
                                .forEach(System.out::println);



        //filter courses with length is greater than or equal to 4
        courses
                .stream()
                .filter( course -> course.length()>=4)
                .forEach(System.out::println);

        //number of characters in each course name
        System.out.println("length of courses:: ");
        courses
                .stream()
                .map( course -> course.length())
                .forEach(System.out::println);

        List<Integer> numbers = List.of(3,6,3,11,8,2,12);

        //print squares of the numbers
        numbers
                .stream()
                .map(num -> num*num)
                .forEach(System.out::println);

        //print cubes of odd numbers
        System.out.println("Cubes of odd numbers:: ");
        numbers
                .stream()
                .filter(num -> num%2==1)
                .map(num -> num*num*num)
                .forEach(System.out::println);
    }



}
