package com.challenges;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupByLength
{
    public static void main(String[] args)
    {
        String[] animals = {"dog","cat","elephant","rabbit","fox","giraffe","ant","zebra","owl"};

        Stream<String> animalsStream = Arrays.stream(animals);


        animalsStream
                .collect(
                        Collectors.groupingBy(
                                String::length
                                ,Collectors.counting()
                        )
                )
                .forEach((k,v) -> System.out.println("Strings of length "+k+" : "+v+" Strings"))
        ;
    }
}
