package com.flatMap;

import java.util.List;

public class CheckFlatMap
{
    public static void main(String[] args)
    {
        List<String> mukeshClasses = List.of("Physics","Maths","Chemistry");
        List<String> rameshClasses = List.of("English","French","German");

        List<List<String>> combinedClasses = List.of(mukeshClasses,rameshClasses);
        List<String> flat = returnFlattened(combinedClasses);
        System.out.println(flat);
    }

    public static List<String> returnFlattened(List<List<String>> combinedClasses)
    {
        return combinedClasses
                                    .stream()
                                    .flatMap(List::stream)
                                    .toList();
    }
}
