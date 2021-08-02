package com.ITrator.study.mgr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ITrator.study.model.Student;

public class StringTest {
	public static void main(String...a) {

		List<Student> myList = new ArrayList<>();
		
		myList.add(new Student("Krishna", 111, 99));
		myList.add(new Student("Mohan", 222, 44));
		
		Student str = new Student("ABC", 12345, 232);
		myList.add(str);
		
		Iterator<Student> itr = myList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println(itr.next());
		}
 	}
	
}
