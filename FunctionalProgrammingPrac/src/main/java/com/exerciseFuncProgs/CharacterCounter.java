package com.exerciseFuncProgs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCounter
{
    public static void main(String[] args)
    {
        CharacterCounter counter = new CharacterCounter();
        counter.charCounter("abcdaertyadfsfd");
        //System.out.println(count);
    }

    private void charCounter(String input)
    {
        Map<String,Long> counted;

        counted=input
                .chars()
                .mapToObj(
                            Character::toString
                        )
                .collect(
                            Collectors.groupingBy(
                                                    Function.identity(),Collectors.counting()
                                                )
                        );

        System.out.println(counted);
    }
}
