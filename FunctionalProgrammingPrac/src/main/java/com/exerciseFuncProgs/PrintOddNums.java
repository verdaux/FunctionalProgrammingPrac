package com.exerciseFuncProgs;

import java.util.List;
import java.util.function.Predicate;

public class PrintOddNums
{
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(2,6,11,3,4,1,2,7,22,16,44,0);

        Predicate<Integer> isEvenPredicate = num -> num % 2 == 1;
        numList
                .stream()
                .filter(isEvenPredicate)
                .forEach(System.out::println);
    }
}
