package com.FunctionalInterface;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncInterfacePrac
{
    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);

        numbers
                .stream()
                .filter( t -> t%2==0)
                .map(x -> x * x)
                //.sorted()
                .forEach(System.out::println);
    }
    
    public void demoTypes(List<Integer> listOfNum)
    {
        Supplier<Predicate<Integer>> predicateSupplier = () -> e -> e % 2 == 0;

        Supplier<Function<Integer, Integer>> functionSupplier = () -> sq -> sq * sq;

        Supplier<Consumer<Integer>> consumerSupplier = () -> System.out::println;
        listOfNum
                .stream()
                .filter(predicateSupplier.get())
                .map(functionSupplier.get())
                .forEach(consumerSupplier.get());
    }
}
