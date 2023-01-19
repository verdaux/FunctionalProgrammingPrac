package com.Behavior;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BehaviorParamForMap
{
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(8,4,3,7,1,8,11,0,5);

        Function<Integer, Integer> squareFunction = num -> num * num;
        Function<Integer, Integer> cubeFunction = num -> num * num * num;

        calculation(numList, squareFunction);
        calculation(numList, cubeFunction);
    }

    private static void calculation(List<Integer> numList, Function<Integer, Integer> calcFunction)
    {
        List<Integer> calcNums =
        numList
                .stream()
                .map(calcFunction)
                .collect(Collectors.toList())
                ;

        System.out.println(calcNums);
    }
}
