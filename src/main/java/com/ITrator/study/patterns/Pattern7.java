package com.ITrator.study.practice.patterns;

import java.util.Scanner;

public class Pattern7 
{
	public static  void main(String...a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input n");
		int rows = scan.nextInt();
		
		for(int i=1; i<=rows; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(j%2==0)
					System.out.print(0 + " ");
				else
					System.out.print(1 + " ");
			}
			System.out.println();
		}
	}
	
	/*
	Pattern :-
	1 
	1 0 
	1 0 1 
	1 0 1 0 
	1 0 1 0 1
	*/
	
}
