package com.streamexercises;

import java.util.List;

public class AddAll
{
    public static void main(String[] args)
    {
        List<Integer> numList = List.of(8,4,4,3,7,1,8,11,0,5);
        int sum = addAll(numList);
        System.out.println("sum:: "+sum);
        int max = findMax(numList);
        System.out.println("max:: "+max);
    }

    public static int findMax(List<Integer> list)
    {
        return list
                .stream()
                .reduce(0,Integer::max);
                //.reduce(0, (x,y) -> x>y?x:y);
    }
    public static int addAll(List<Integer> list)
    {
        return list
                .stream()
                //.reduce(0, (x,y) -> x+y)
                .reduce(0,Integer::sum)
                ;
    }
    public static void sortedUnique(List<Integer> list)
    {
        list
                .stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
