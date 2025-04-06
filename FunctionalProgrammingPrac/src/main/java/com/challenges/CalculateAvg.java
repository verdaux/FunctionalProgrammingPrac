package com.challenges;

import java.util.List;
import java.util.Optional;

public class CalculateAvg
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        double avg = numbers
                .stream()
                .mapToInt( num -> num.intValue())
                .average()
                .getAsDouble()
                ;

        System.out.println(avg);
    }
}
