package com.ITrator.study.sorting;

public class BubbleSort 
{
	public static void main(String...a)
	{
		int[] arr = {10, 37, 24, 15, 87, 2};
		int temp=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=1; j<arr.length; j++)
			{
				if(arr[j-1] > arr[j])
				{
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i : arr)
		System.out.println(i);
	}
}
