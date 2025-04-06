package com.streamexercises;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;

public class CourseFilters
{


    public static void main(String[] args)
    {
        List<String> l1= Arrays.asList("Apple","Banana","Graoe","Apple");
        Set<String> set = new LinkedHashSet<>(l1);
        ArrayList<String> arr = (ArrayList<String>) set.stream().toList();


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
        courses.stream().collect(Collectors.groupingBy(Function.identity(),  mapping(String::length, Collectors.toList())));
        //get the length of each word
        Map<String, List<Integer>> collect = courses.stream().collect(Collectors.groupingBy(Function.identity(), mapping(String::length, Collectors.toList())));

        System.out.println("length of each word " + collect);


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

        //sorted distinct courses
        System.out.println("Sorted distinct courses are:: ");
        courses
                .stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
        //create list with lengths of all course titles
        List<Integer> lengthsOfTiles =
        courses
                .stream()
                .map(course -> course.length())
                .collect(Collectors.toList());
        List<Integer> numbers = List.of(3,6,3,11,8,2,12);

        Function<Integer,Integer> getSquare = num -> num*num;
        //print squares of the numbers
        numbers
                .stream()
                .map(getSquare)
                .forEach(System.out::println);

        //print cubes of odd numbers
        System.out.println("Cubes of odd numbers:: ");
        numbers
                .stream()
                .filter(num -> num%2==1)
                .map(num -> num*num*num)
                .forEach(System.out::println);

        //stored squared elements in a new list
        List<Integer> squaredList = numbers
                                            .stream()
                .map(num -> num*num)
                .toList();
        System.out.println("Squared list::");
        squaredList
                .forEach(System.out::println);

        int sum = numbers
                .stream()
                .reduce(0, Integer::sum)
        ;
    }
}
