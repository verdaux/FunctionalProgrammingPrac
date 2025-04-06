package com.challenges;

import java.util.List;

public class FindSquareOfFirstThreeEven
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        numbers
                .stream()
                .filter( num -> num%2==0)
                .limit(3)
                .map(num -> num*num)
                .forEach(System.out::println);
    }
}
