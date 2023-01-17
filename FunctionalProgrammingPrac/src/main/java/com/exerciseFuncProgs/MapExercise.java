package com.exerciseFuncProgs;

import java.util.List;
import java.util.stream.Collectors;

public class MapExercise
{
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(8,4,3,7,1,8,11,0,5);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices","AWS","PCF","Azure");
        //printSquares(numList);
        //printCubeOfOddNums(numList);
        printCharsOfWord(courses);
    }

    public static void printSquares(List<Integer> numList)
    {
        numList
                .stream()
                .map(num -> num * num)
                .forEach(System.out::println);
    }

    public static void printCubeOfOddNums(List<Integer> numList)
    {
        numList
                .stream()
                .filter(num -> num%2==1)
                .map(num -> num*num*num)
                .forEach(System.out::println);
    }

    public static void printCharsOfWord(List<String> courses)
    {
        courses
                .stream()
                .map(course -> course +" "+course.length())
                //.map(String::length)
                .forEach(System.out::println);
    }
}
