package com.streamCollect;

import java.util.List;
import java.util.stream.Collectors;

public class ListFromList
{
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(8,4,3,7,1,8,11,0,5);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices","AWS","PCF","Azure");
        //listFromList(numList);
        //listFromEvenList(numList);
        listFromLengthOfCourses(courses);
    }

    public static void listFromLengthOfCourses(List<String> courses )
    {
        List<Integer> courseLengthList =
                                        courses
                                                .stream()
                                                        .map(course -> course.length())
                                                                .collect(Collectors.toList());
                System.out.println(courseLengthList);
    }
    public static void listFromList(List<Integer> numList )
    {
        List<Integer> numSquaredList = numList
                                                .stream()
                                                .map(num -> num * num)
                                                .collect(Collectors.toList());
        System.out.println(numSquaredList);
    }

    public static void listFromEvenList(List<Integer> numList )
    {
        List<Integer> numEvenList = numList
                                            .stream()
                                            .filter(t->t%2==0)
                                            .collect(Collectors.toList());
        System.out.println(numEvenList);
    }

}

