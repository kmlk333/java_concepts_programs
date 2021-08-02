package com.ITrator.study.sorting;

public class SelectionSort 
{
	public static void main(String...a)
	{
		int temp;
		int[] arr = {10, 37, 24, 15, 87, 2};
		
		for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        } 
	    
		for(int k=0; k<arr.length; k++)
		{
			System.out.println(arr[k]);
		}
	}
}
