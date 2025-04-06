package com.Behavior;

import java.util.List;
import java.util.Optional;

public class SumOfAllDigits
{
    public static void main(String[] args)
    {
        //Sum of all digits
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);

        Optional<Integer> sumOfNums = numbers
                .stream()
                .reduce(Integer::sum);

        System.out.println(sumOfNums);
    }
}
