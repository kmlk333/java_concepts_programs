package com.ITrator.study.search;

public class LinearSearch 
{
	public static void main(String...a)
	{
		int[] arr = {10, 37, 24, 15, 87, 2};
		int item = 2;
		int pos = -1;
		for(int i=0; i<arr.length; i++)
		{
			if(item == arr[i])
			{
				pos = i;
				break;
			}
		}
		if(pos != -1)
		{
			System.out.println("Item Found at " + pos);
		}
		else
			System.out.println("Element not found");
	}
	
}
