package com.ITrator.study.patterns;

import java.util.Scanner;

public class Pattern4 
{
	public static  void main(String...a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input n");
		int rows = scan.nextInt();
		
		for(int i=1; i<=rows; i++)
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
	5 4 3 2 1 
	5 4 3 2 
	5 4 3 
	5 4 
	5 
	*/
	
}
