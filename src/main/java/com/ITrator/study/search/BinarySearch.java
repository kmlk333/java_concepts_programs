package com.ITrator.study.practice.search;

public class BinarySearch 
{
	public static void main(String...a)
	{
		System.out.println("Binary Search ");
		int[] arr = {10, 37, 24, 15, 87, 2};
		int item = 87;
		int pos = -1;
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end)
		{
			int mid = (start + end) /2;
			if(item == arr[mid])
			{
				pos = mid;
				break;
			}
			if(item > arr[mid])
			{
				start = mid + 1;
			}
			if(item < arr[mid])
			{
				end = mid -1;
			}
		}
		System.out.println("Found at "+pos);
	}
}
