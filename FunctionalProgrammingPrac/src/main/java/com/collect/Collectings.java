package com.collect;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectings
{
    public static void main(String[] args)
    {
        //helper method
        //Collectors.toList()
        //Collectors.toSet()
        //Collectors.toMap()

        //Collectors.groupingBy()
        //Collectors.partitioningBy()

        //used to gather the elements of stream in a container such as List, Set, and Map

        Stream<String> stream1 =Stream.of("apple","banana","mango");
        Stream<String> stream2 =Stream.of("apple","banana","mango","apple");
        Stream<String> stream3 =Stream.of("apple","banana","mango");
        List<String> resultList =
        stream1
                .collect(Collectors.toList());
        System.out.println(resultList);
        Set<String> resultSet =
        stream2
                .collect(Collectors.toSet());
        System.out.println(resultSet);

        Map<String,Integer> fruits=
        stream3
                .collect(Collectors.toMap(
                        fruit -> fruit,
                        fruit -> fruit.length()
                ));
        System.out.println(fruits);
    }
}
