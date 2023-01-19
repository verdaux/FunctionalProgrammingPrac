package com.exerciseFuncProgs;

import java.util.Comparator;
import java.util.List;

public class ReverseDistinctSorted
{
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(8,4,3,7,1,8,11,0,5);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices","AWS","PCF","Azure");

        courses
                .stream()
                .sorted(
                        Comparator
                                .comparingInt(String::length)
                                .reversed()
                        )
                .forEach(System.out::println);
    }
}
