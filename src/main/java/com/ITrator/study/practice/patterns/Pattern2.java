package com.ITrator.study.practice.patterns;

import java.util.Scanner;

public class Pattern2 
{
	public static  void main(String...a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input n");
		int n = scan.nextInt();
		
		int k=1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(k);
			}
			k++;
			System.out.println();
		}
	}
	/*
	Pattern :-
	1
	22
	333
	4444
	55555*/
}
