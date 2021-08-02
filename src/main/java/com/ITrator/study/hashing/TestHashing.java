package com.ITrator.study.hashing;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public class TestHashing 
{
	
	public static void main(String[] args) {
		Map<Student, String> myMap = new IdentityHashMap<>();
	
		Student s1 = new Student(1,"Krishna", "Varanasi");
		Student s2 = new Student(2,"Mohan", "Allahabad");
		Student s3 = new Student(1,"Krishna", "Pune");
		
		myMap.put(s1, "First");
		myMap.put(s2, "Second");
		myMap.put(s3, "Third");
		
		System.out.println(myMap.get(new Student(1,"Krishna", "Varanasi")));
		
	}
	
}
