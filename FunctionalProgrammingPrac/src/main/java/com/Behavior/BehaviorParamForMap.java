package com.Behavior;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
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

        Predicate<Integer> isEVen = num -> num%2==0;

        isEvenTest(numList,isEVen);
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

    private static void isEvenTest(List<Integer> numList, Predicate<Integer> isEVenPredicate)
    {
        numList
                .stream()
                .filter(isEVenPredicate)
                .forEach(System.out::println);
    }
}
