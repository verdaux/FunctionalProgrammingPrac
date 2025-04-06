package com.challenges;

import java.util.List;

public class CovertUpperToLowerCase
{
    public static void main(String[] args)
    {
        List<String> fruits = List.of("Banana","Apple","Mango","cherry","Grapes");

        fruits
                .stream()
                .map( word -> word.toUpperCase())
                .forEach(System.out::println);
    }
}
