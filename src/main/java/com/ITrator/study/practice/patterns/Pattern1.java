package com.ITrator.study.practice.patterns;

import java.util.Scanner;

public class Pattern1 
{
	public static  void main(String...a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input n");
		int n = scan.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	/*
	Pattern :-
	1
	12
	123
	1234
	12345*/
}
