package com.ITrator.study.sorting;

public class InsertionSort 
{
	public static void main(String...a)
	{
		int temp;
		int[] arr = {10, 37, 24, 15, 87, 2};
		
		int n = arr.length;  
        for (int j = 1; j < n; j++) {  
            int key = arr[j];  
            int i = j-1;  
            while ( (i > -1) && ( arr[i] > key ) ) {  
                arr[i+1] = arr[i];  
                i--;  
            }  
            arr[i+1] = key;  
        }
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]);
		}
		
	}
}
