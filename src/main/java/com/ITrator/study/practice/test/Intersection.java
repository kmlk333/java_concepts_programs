package com.ITrator.study.practice.test;

public class Intersection 
{
	public static void main(String...a)
	{
		int[] arr1 = {10, 15, 58, 20, 0, 45};
		int[] arr2 = {110, 115, 45, 21, 0, 58, 145};
		
		for(int i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println("Match Found " + arr1[i]);
				}
			}
		}
	}
	

}
