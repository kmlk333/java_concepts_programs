package com.ITrator.Java8.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;

public class LamdaTest {

	public static void main(String[] args) {

		int[] arr = {5,8,7,2, 4,9};
		List<Integer> list = Arrays.asList(5,7,9,1,15);
		
		list.forEach(x -> System.out.println(x));
		
		list.stream().forEach(x-> System.out.println(x));
		
		System.out.println("Sorting two distinct");
		list.stream().distinct().sorted().limit(2).forEach(x -> System.out.println(x));
		
		Optional<Integer> any = list.stream().findAny();
		System.out.println(any.get());
		
		System.out.println("Event number in the array list");
		list.stream().filter(num -> num%2==0).forEach(x -> System.out.println(x));;
	}
}
