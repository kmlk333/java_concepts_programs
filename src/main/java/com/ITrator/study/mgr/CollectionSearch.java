package com.ITrator.study.practice.mgr;

import java.util.Arrays;

public class CollectionSearch
{
	public static void main(String[] args) 
	{
		String[] strArray = {"Krishna", "Mohan", "Keshari"};
		
		Arrays.sort(strArray);
		for(String str : strArray)
		System.out.println(str);
		
		System.out.println(Arrays.binarySearch(strArray, "Mhan"));
	
	}
}
