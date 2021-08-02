package com.ITrator.study.practice.patterns;

import java.util.Scanner;

public class Pattern6 
{
	public static  void main(String...a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input n");
		int rows = scan.nextInt();
		
		for(int i=rows; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	/*
	Pattern :-
	5 4 3 2 1 
	4 3 2 1 
	3 2 1 
	2 1 
	1 
	*/
	
}
