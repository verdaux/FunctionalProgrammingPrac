package com.challenges;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class ReverseEachWordOfStream
{
    public static void main(String[] args)
    {
        String input = "Hello World Java";
        String result = Arrays.stream(input
                .split(" "))
                .map(
                        word -> new StringBuilder(word).reverse()
                )
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
