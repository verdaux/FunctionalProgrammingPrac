package com.collect;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingElements
{
    public static void main(String[] args)
    {
        Stream<String> stream = Stream.of("apple", "banana","mango","orange");

        Long numbers =
        stream
                .collect(Collectors.counting())
        ;
        System.out.println(numbers);
    }
}
