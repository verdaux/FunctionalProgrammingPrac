package com.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFLatMap
{
//mapping and flattening is done



    public static void main(String[] args)
    {
        List<List<Integer>> listOfLists =
                Arrays.asList(
                        Arrays.asList(1,2,3),
                        Arrays.asList(4,5,6),
                        Arrays.asList(7,8,9)
                );
        List<Integer> numbersFlattened = listOfLists
                .stream()
                .flatMap(List::stream)
                .toList()
                ;

        //Sum of odd number
        Optional<Integer> sum = listOfLists
                .stream()
                        .flatMap(List::stream)
                                .filter( num -> num%2!=0)
                                        .reduce(Integer::sum)

        ;
        System.out.println(listOfLists);
        System.out.println(sum);
    }
}
