package com.challenges;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1,2,9,3,4,5,6,7,8,7,9);

        List<Integer> unique = numbers
                .stream()
                .collect(Collectors.toSet())
                .stream().toList()
        ;

        List<Integer> uniques =numbers
                .stream()
                        .distinct()
                                .toList();

        System.out.println(uniques);
    }
}
