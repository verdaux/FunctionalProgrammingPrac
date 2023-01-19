package com.FunctionalInterface;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class SuppAndUnary
{
    public static void main(String[] args)
    {
        Supplier<Integer> randomIntSupplier = () -> 2;
        System.out.println(randomIntSupplier.get());

        Supplier<Integer> randomIntSupplierNew = () -> {
            Random random = new Random();
            return random.nextInt(1000 );
        };
        System.out.println(randomIntSupplierNew.get());

         unary();
    }

    public static void unary()
    {
        UnaryOperator<Integer> unary = (x) -> 3 * x;
        System.out.println(unary.apply(2));
    }
}
