package com.ITrator.study.patterns;

import java.util.Scanner;

public class Pattern8 
{
	public static  void main(String...a)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input n");
		int rows = scan.nextInt();
		
		 for (int i = 1; i <= rows; i++) 
	        {
	            int num = i;
	             
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print(num+" ");
	                 
	                num = num+rows-j;
	            }
	             
	            System.out.println();
	        }
	}
	
	/*
	Pattern :-
	1 
	2 6 
	3 7 10 
	4 8 11 13 
	5 9 12 14 15 
	*/
	
}
