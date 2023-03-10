package com.FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntBinaryOperator;

public class BiFunctions
{
    public static void main(String[] args)
    {
        BiPredicate<Integer,String> check = (Integer number,String str) -> true;
        BiPredicate<Integer,String> checkNow = (number,str) -> {
                return number<10 && str.length()>10;
        };

        System.out.println(checkNow.test(5,"spring Boot"));

        BiFunction<Integer,String,String> biFunc = (num,str) ->
        {
            return num +" "+str;
        };
        System.out.println(biFunc.apply(22,"checking BiFunc"));

        BiConsumer<Integer,String> biCons = (num,str) -> {
            System.out.println("num in biCons is "+num);
            System.out.println("str in biCons is "+str);
        };

        biCons.accept(14,"damn");

        IntBinaryOperator checkFunc = (x,y) -> (x+y);
        System.out.println("Int Binary check :: "+checkFunc.applyAsInt(10,20));
    }
}
