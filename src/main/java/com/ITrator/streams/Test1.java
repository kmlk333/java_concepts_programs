package com.ITrator.streams;

import java.util.Arrays;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(5,8,1,15,20);
		
		System.out.println(list.stream().findFirst().get());
	}
}
