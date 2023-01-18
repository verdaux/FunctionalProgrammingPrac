package com.exerciseFuncProgs;

import java.util.List;

public class FindAvg
{
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(8,4,3,7,1,8,11,0,5);
        double avg = findAvg(numList);
        System.out.println("avg:: "+avg);
    }

    public static double findAvg(List<Integer> numList)
    {
        return numList
                .stream()
                .mapToDouble(num -> num)
                .average()
                .orElse(0.0)
                ;
    }
}
