package com.sample;

import java.util.List;

public class PrintEvenNumbersInList
{
	public static void main(String[] args)
	{
		//printEvenNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));
		printEvenNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));
	}
	
	private static boolean isEven(int number)
	{
		return number%2==0;
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers)
		{
			numbers.
					stream()
							.filter(PrintEvenNumbersInList::isEven)
							.forEach(System.out::println);
		}

//	private static void print(int number)
//	{
//		System.out.println(number);
//	}

	private static void printEvenNumbersInListStructured(List<Integer> numbers)
	{
		
		for(int num : numbers)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
						
		//.forEach(FunctionalSample::print);
	}
}