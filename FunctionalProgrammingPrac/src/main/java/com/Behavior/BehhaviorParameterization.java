package com.Behavior;

import java.util.List;
import java.util.function.Predicate;

public class BehhaviorParameterization
{
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(8,4,3,7,1,8,11,0,5);

        extracted(numList, num1 -> num1 % 2 == 0);

        extracted(numList, num -> num % 2 != 0);

    }

    private static void extracted(List<Integer> numList, Predicate<Integer> predicate)
    {
        numList
                .stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
