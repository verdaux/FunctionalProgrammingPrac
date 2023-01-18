package com.exerciseFuncProgs;

import java.util.List;

public class ReduceExercises
{
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(8,4,3,7,1,8,11,0,5);
        int sum = sumOfOddNumbers(numList);
        System.out.println(sum);
    }

    public static int sumOfSquares(List<Integer> numList)
    {
        return numList
                .stream()
                .map(num -> num*num)
                .reduce(0, (x,y) -> x+y);
    }

    public static int sumOfCubes(List<Integer> numList)
    {
        return numList
                .stream()
                .map(num -> num*num*num)
                .reduce(0, (x,y) -> x+y);
    }

    public static int sumOfOddNumbers(List<Integer> numList)
    {
        return numList
                .stream()
                .filter(num -> num%2==1)
                .reduce(0, Integer::sum);
                //.reduce(0, (x,y) -> x+y);
    }
}
