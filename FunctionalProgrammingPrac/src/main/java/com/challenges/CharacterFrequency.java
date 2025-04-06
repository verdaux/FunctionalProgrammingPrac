package com.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency
{
    //Find frequency of each character



    public static void main(String[] args)
    {
        String name = "schwazzeneger";

        String[] splittedName = name.split("");

        List<String> charList = Arrays.asList(splittedName);

Map<String,Long> counts =
        charList
                .stream()
                .collect(
                            Collectors.groupingBy(
                                                        Function.identity(),
                                                        Collectors.counting()
                                                )

                        )

                ;
        System.out.println(counts);

        Map<Character,Long> counted  = name
                .chars()
                .mapToObj(c -> (char) c)
                .collect(
                         Collectors.
                                    groupingBy(
                                                    Function.identity()
                                                    ,Collectors.counting()
                                    )
                );
        System.out.println(counted);
    }

}
