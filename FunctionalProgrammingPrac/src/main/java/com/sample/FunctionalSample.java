package com.sample;

import java.util.List;

public class FunctionalSample
{
	public static void main(String[] args)
	{
		printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
	}
	
//	private static void print(int number)
//	{
//		System.out.println(number);
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers)
	{
		
		numbers.
				stream()
						.forEach(System.out::println);
						
		//.forEach(FunctionalSample::print);
	}
}