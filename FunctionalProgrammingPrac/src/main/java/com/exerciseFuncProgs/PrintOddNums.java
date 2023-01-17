package com.exerciseFuncProgs;

import java.util.List;

public class PrintOddNums
{
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(2,6,11,3,4,1,2,7,22,16,44,0);

        numList
                .stream()
                .filter(num -> num%2==1)
                .forEach(System.out::println);
    }
}
