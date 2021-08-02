package com.ITrator.study.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		vector.add(5);
		vector.add(6);
		vector.add(7);
		vector.add(8);
		
		Enumeration<Integer> en = vector.elements();
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		Vector<Integer> vec = new Vector<>(6);
		vec.add(5);
		vec.add(6);
		vec.add(7);
		vec.add(8);
		
		System.out.println(vec);
		System.out.println(vec.capacity());
		
		vec.setSize(15);
		System.out.println(vec.size());
		
		System.out.println(vec);
		
		vec.setSize(3);
		System.out.println(vec);
		
		
	}
}
