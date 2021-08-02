package com.ITrator.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
	
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		
		myList.add("Krishna");
		myList.add("Mohan");
		myList.add("Lal");
		myList.add("Keshari");
		myList.add("Krishna");
		myList.add("Mohan");
		myList.add("Lal");
		myList.add("Keshari");
		myList.add("Krishna");
		myList.add("Mohan");
		myList.add("Lal");
		myList.add("Keshari");
		myList.add("Krishna");
		myList.add("Mohan");
		myList.add("Lal");
		myList.add("Keshari");
		
		System.out.println(myList);
		
		for(String str : myList) {
			System.out.println("Value is : " + str);
		}
		
	}
}
