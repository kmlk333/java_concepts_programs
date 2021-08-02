package com.ITrator.study.patterns;

import java.util.Scanner;

public class Pattern3 
{
	public static  void main(String...a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input n");
		int n = scan.nextInt();
		
		int k=n;
		for(int i=1; i<=k; i++)
		{
			for(int j=1; j<=n; j++)
			{
				System.out.print(j + " ");
			}
			n--;
			System.out.println();
		}
	}
	
	/*
	Pattern :-
	1 2 3 4 5 6 7
	1 2 3 4 5 6
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1*/
	
}
