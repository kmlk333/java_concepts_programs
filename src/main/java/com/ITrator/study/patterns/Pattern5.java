package com.ITrator.study.patterns;

import java.util.Scanner;

public class Pattern5 
{
	public static  void main(String...a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input n");
		int rows = scan.nextInt();
		
		for(int i=rows; i>=1; i--)
		{
			for(int j=rows; j>=i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	/*
	Pattern :-
	5 
	5 4 
	5 4 3 
	5 4 3 2 
	5 4 3 2 1 
	*/
	
}
