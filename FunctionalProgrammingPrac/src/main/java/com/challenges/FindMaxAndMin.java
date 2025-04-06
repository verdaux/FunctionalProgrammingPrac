package com.challenges;

import java.util.List;
import java.util.Optional;

public class FindMaxAndMin
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1,100,2,0,3,4,5,6,7,10);

        Optional<Integer> max = numbers
                .stream()
                .reduce(Integer::max);
        System.out.println(max);
    }
}
