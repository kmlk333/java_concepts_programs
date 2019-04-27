package com.ITrator.study.practice.test;

public class SumOfPrimes 
{
	public static void main(String...a)
	{
		int primes = 0;
		outer :
			for(int i=2; i<100; i++)
			{
			inner :
			for(int j=2; j<i/2; j++)
			{
				if(i%j != 0)
				{
					System.out.println("Prime Number " + i);
					primes += i;
					break inner;
				}
			}
		}
		System.out.println("Prime Addition is  " + primes);
	}
}
