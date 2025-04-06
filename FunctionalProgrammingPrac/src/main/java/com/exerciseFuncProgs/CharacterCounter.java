package com.exerciseFuncProgs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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

        String[] splittedCharacters = input.split("");
        List<String> listedChars = Arrays.asList(splittedCharacters);


        Map<String,Long> countedNew = listedChars
                .stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                ;


        System.out.println(counted);
        System.out.println("new"+countedNew);
    }
}
