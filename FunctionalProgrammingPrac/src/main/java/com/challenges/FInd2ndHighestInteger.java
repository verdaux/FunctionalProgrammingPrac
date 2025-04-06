package com.challenges;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FInd2ndHighestInteger
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1,3,5,2,7,4,2,10,9,7);

        Optional<Integer> secondHighest = numbers
                .stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println(secondHighest);
    }
}
