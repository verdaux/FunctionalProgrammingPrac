package com.exerciseFuncProgs;

import java.util.List;

public class PrintAllCourseNamesIndividual
{
    public static void main(String[] args)
    {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices","AWS","PCF","Azure");
        //printCourses(courses);
        //printContainingSpring(courses);
        printFourLetterCourse(courses);
    }

    public static void printCourses(List<String> courseList)
    {
        courseList
                .forEach(System.out::println);
    }

    public static void printContainingSpring(List<String> courseList)
    {
        courseList
                .stream()
                .filter( courses -> courses.contains("Spring"))
                .forEach(System.out::println);
    }

    public static void printFourLetterCourse(List<String> courseList)
    {
        courseList
                .stream()
                .filter(courseLetter -> courseLetter.length()>=4)
                .forEach(System.out::println);
    }
}
