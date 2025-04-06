package com.challenges;

import java.util.Comparator;
import java.util.List;

public class SortAscAndDesc
{
    public static void main(String[] args)
    {
        List<String> fruits = List.of("Banana","Apple","Mango","Grapes");

        fruits
                .stream()
                .sorted()
                .forEach(System.out::println);
        ;

        fruits
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
        ;
    }
}
